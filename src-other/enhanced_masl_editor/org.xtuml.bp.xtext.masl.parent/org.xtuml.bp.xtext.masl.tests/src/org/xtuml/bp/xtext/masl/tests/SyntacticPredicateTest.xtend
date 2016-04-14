package org.xtuml.bp.xtext.masl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtuml.bp.xtext.masl.masl.CharacteristicCall
import org.xtuml.bp.xtext.masl.masl.DomainServiceDefinition
import org.xtuml.bp.xtext.masl.masl.Expression
import org.xtuml.bp.xtext.masl.masl.FindExpression
import org.xtuml.bp.xtext.masl.masl.MaslModel
import org.xtuml.bp.xtext.masl.masl.OperationCall
import org.xtuml.bp.xtext.masl.masl.SimpleFeatureCall

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MASLInjectorProvider)
class SyntacticPredicateTest {
	
	@Inject extension ParseHelper<MaslModel>
	
	@Test
	def void testFindExpression() {
		val expression = 'find foo(a=b);'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof FindExpression)
		assertTrue((expression as FindExpression).where != null)
	} 

	@Test
	def void testFindExpression2() {
		val expression = '(find foo(a=b))\'length;'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof CharacteristicCall)
		assertTrue((expression as CharacteristicCall).receiver instanceof FindExpression)
	} 

	@Test
	def void testParenthesizedExpression() {
		val expression = '(foo);'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof SimpleFeatureCall)
	} 

	@Test
	def void testOperationCall() {
		val expression = 'foo();'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof OperationCall)
	} 

	@Test
	def void testOperationCall2() {
		val expression = 'this.foo();'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof OperationCall)
	} 
	
	@Test
	def void testSimpleFeatureCall() {
		val expression = 'this.foo;'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof SimpleFeatureCall)
	} 
	
	@Test
	def void testCharacteristicCall() {
		val expression = 'this\'foo;'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof CharacteristicCall)
	} 
	
	@Test
	def void testCharacteristicCall2() {
		val expression = 'this\'foo();'.parseExpression
		assertTrue(expression.eClass.name, expression instanceof CharacteristicCall)
	} 
	
	private def parseExpression(CharSequence expression) {
		val model = '''
			service foo::foo() is
			begin
				«expression»
			end;
		'''.parse;
		val body = (model.elements.head as DomainServiceDefinition).body
		assertEquals(1, body.statements.size)
		(body.statements.head) as Expression
	}
}