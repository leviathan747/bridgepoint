---

This work is licensed under the Creative Commons CC0 License

---

# User data types in java external entity bridges
### xtUML Project Analysis Note

### 1. Abstract

Realized external entities and components do not support UDTs (User Data Types)
as parameters and return values. This work will allow UDTs to be used in
realized interfaces.

### 2. Document References

<a id="2.1"></a>2.1 [BridgePoint DEI #4889 User data types in java external entity bridges](https://support.onefact.net/issues/4889)  

### 3. Background

None

### 4. Requirements

4.1 Verifier shall support UDTs as parameters and return types on realized
external entity bridges.  
4.2 Verifier shall support UDTs as parameters and return types on realized
component interface bridges.  
4.3 UDTs based on core types shall behave exactly as the core types.  
4.4 UDTs based on `inst<Mapping>` and `inst_ref<Mapping>` shall behave as
general purpose Java objects.  
4.5 Verifier execution shall support `==`, `!=`, `<`, `>`, `<=`, `>=` operators
for UDTs based on `inst<Mapping>`.  
4.6 Verifier execution shall support `==`, `!=` operators for UDTs based on
`inst_ref<Mapping>`.  

### 5. Analysis

5.1 Current support

Verifier currently supports many types of UDTs. UDTs based on enumerators,
structures, and core types are already supported. Verifier executes realized
Java code by using a class loader and the reflection API to select and invoke
methods using a documented naming convention.

5.2 Supporting `inst<Mapping>` and `inst_ref<Mapping>`

It would be simple to extend this behavior to expect the Java type `Object` for
parameters and return values of the mapping types. This would allow any Java
class to be passed into the modeled application and back out again.

5.3 Implementing operators for `inst<Mapping>` and `inst_ref<Mapping>`

The BridgePoint user documentation currently states that although the language
allows the equality and comparison operators for `inst<Mapping>` and the
equality operators only for `inst_ref<Mapping>`, they are not supported by
Verifier. To support these operators even in Verifier, two new interfaces could
be created in the `lib` package: `InstMapping` and `InstRefMapping`.
`InstRefMapping` could simply be an empty interface and `InstMapping` could
extend the `Comparable<InstMapping>` interface provided by Java.

Once this is in place, users who wanted to use types based on the mapping types
would have to write Java classes which implement one of the two new interfaces.
For example, a user could create a new type `Matrix4x4` based on
`inst<Mapping>`. Then perhaps he could create an EE bridge with the following
signature: `Matrix4x4 MATRIX::identityMatrix()`. The following Java class could
then be defined to represent the `Matrix4x4` type:

```Java
public class Matrix4x4 implements InstMapping {

    @Override
    public int compareTo(InstMapping o) {
        return 0;  // TODO implement comparison operation
    }

    @Override
    public boolean equals(Object o) {
        return false;  // TODO implement equality operation
    }

}
```

The following Java class could be defined to represent the realized external
entity:

```Java
public class MATRIX {

    public static InstMapping identityMatrix() {
        return new Matrix4x4();
    }

}
```

In this way, Verifier will receive a returned instance that is guaranteed to be
of type `InstMapping`, and therefore Verifier can be sure that `compareTo` and
`equals` are defined for the type. Then Verifier can be updated to cast values
of UDTs based on the mapping types before invoking the equality and comparison
operations.

### 6. Work Required

6.1 Implement `InstMapping` and `InstRefMapping` interfaces.  
6.2 Update the Verifier realized code invoking utility to use `InstMapping` and
`InstRefMapping` for UDT types based on the mapping types when searching for
realized methods with reflection.  
6.3 Update the binary operation evaluation code in Verifier proper to allow
evaluating comparison and equality operations on mapping types where appropriate
using the technique described above.  
6.4 Do code clean up where sensible.  

### 7. Acceptance Test

7.1 A test model shall be built which includes the usage of UDTs in external
entities and component interfaces. The successful execution of this model shall
be the acceptance test.

### End
