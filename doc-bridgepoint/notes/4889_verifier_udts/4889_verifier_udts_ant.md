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

### 6. Work Required

### 7. Acceptance Test

7.1 A test model shall be built which includes the usage of UDTs in external
entities and component interfaces. The successful execution of this model shall
be the acceptance test.

### End
