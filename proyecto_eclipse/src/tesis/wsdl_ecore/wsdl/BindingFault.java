/**
 */
package tesis.wsdl_ecore.wsdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL fault element within a operation within a binding. A fault element within an operation within a binding specifies binding information for the fault with the same name. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.BindingFault#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.BindingFault#getEFault <em>EFault</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingFault()
 * @model superTypes="tesis.wsdl_ecore.wsdl.ExtensibleElement tesis.wsdl_ecore.wsdl.IBindingFault"
 * @generated
 */
public interface BindingFault extends ExtensibleElement, javax.wsdl.BindingFault {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingFault_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.BindingFault#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFault</em>' reference.
	 * @see #setEFault(Fault)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingFault_EFault()
	 * @model required="true"
	 * @generated
	 */
	Fault getEFault();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.BindingFault#getEFault <em>EFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFault</em>' reference.
	 * @see #getEFault()
	 * @generated
	 */
	void setEFault(Fault value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="tesis.wsdl_ecore.wsdl.IFault"
	 * @generated
	 */
	javax.wsdl.Fault getFault();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model faultType="tesis.wsdl_ecore.wsdl.IFault"
	 * @generated
	 */
	void setFault(javax.wsdl.Fault fault);

} // BindingFault
