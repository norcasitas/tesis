/**
 */
package tesis.wsdl_ecore.wsdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.MessageReference#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.MessageReference#getEMessage <em>EMessage</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getMessageReference()
 * @model abstract="true"
 * @generated
 */
public interface MessageReference extends ExtensibleElement {
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
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getMessageReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.MessageReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EMessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMessage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMessage</em>' reference.
	 * @see #setEMessage(Message)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getMessageReference_EMessage()
	 * @model required="true"
	 * @generated
	 */
	Message getEMessage();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.MessageReference#getEMessage <em>EMessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMessage</em>' reference.
	 * @see #getEMessage()
	 * @generated
	 */
	void setEMessage(Message value);

} // MessageReference
