/**
 */
package tesis.wsdl_ecore.wsdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage
 * @generated
 */
public interface WsdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WsdlFactory eINSTANCE = tesis.wsdl_ecore.wsdl.impl.WsdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type</em>'.
	 * @generated
	 */
	PortType createPortType();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Binding Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Operation</em>'.
	 * @generated
	 */
	BindingOperation createBindingOperation();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Extensibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extensibility Element</em>'.
	 * @generated
	 */
	ExtensibilityElement createExtensibilityElement();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	Definition createDefinition();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault</em>'.
	 * @generated
	 */
	Fault createFault();

	/**
	 * Returns a new object of class '<em>Binding Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Input</em>'.
	 * @generated
	 */
	BindingInput createBindingInput();

	/**
	 * Returns a new object of class '<em>Binding Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Output</em>'.
	 * @generated
	 */
	BindingOutput createBindingOutput();

	/**
	 * Returns a new object of class '<em>Binding Fault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Fault</em>'.
	 * @generated
	 */
	BindingFault createBindingFault();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns a new object of class '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types</em>'.
	 * @generated
	 */
	Types createTypes();

	/**
	 * Returns a new object of class '<em>Unknown Extensibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Extensibility Element</em>'.
	 * @generated
	 */
	UnknownExtensibilityElement createUnknownExtensibilityElement();

	/**
	 * Returns a new object of class '<em>XSD Schema Extensibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Schema Extensibility Element</em>'.
	 * @generated
	 */
	XSDSchemaExtensibilityElement createXSDSchemaExtensibilityElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WsdlPackage getWsdlPackage();

} //WsdlFactory
