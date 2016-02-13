/**
 */
package tesis.unrc.wsdl.wsdl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL binding element. A binding defines message format and protocol details for operations and messages defined by a particular portType. There may be any number of bindings for a given portType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Binding#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Binding#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Binding#getEPortType <em>EPort Type</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Binding#getEBindingOperations <em>EBinding Operations</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBinding()
 * @model superTypes="tesis.unrc.wsdl.wsdl.ExtensibleElement tesis.unrc.wsdl.wsdl.IBinding"
 * @generated
 */
public interface Binding extends ExtensibleElement, javax.wsdl.Binding {
	/**
	 * Returns the value of the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QName</em>' attribute.
	 * @see #setQName(QName)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBinding_QName()
	 * @model dataType="tesis.unrc.wsdl.wsdl.QName"
	 * @generated
	 */
	QName getQName();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Binding#getQName <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QName</em>' attribute.
	 * @see #getQName()
	 * @generated
	 */
	void setQName(QName value);

	/**
	 * Returns the value of the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undefined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undefined</em>' attribute.
	 * @see #setUndefined(boolean)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBinding_Undefined()
	 * @model
	 * @generated
	 */
	boolean isUndefined();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Binding#isUndefined <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined</em>' attribute.
	 * @see #isUndefined()
	 * @generated
	 */
	void setUndefined(boolean value);

	/**
	 * Returns the value of the '<em><b>EPort Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPort Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPort Type</em>' reference.
	 * @see #setEPortType(PortType)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBinding_EPortType()
	 * @model required="true"
	 * @generated
	 */
	PortType getEPortType();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Binding#getEPortType <em>EPort Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPort Type</em>' reference.
	 * @see #getEPortType()
	 * @generated
	 */
	void setEPortType(PortType value);

	/**
	 * Returns the value of the '<em><b>EBinding Operations</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.BindingOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBinding Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBinding Operations</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBinding_EBindingOperations()
	 * @model type="tesis.unrc.wsdl.wsdl.BindingOperation" containment="true"
	 * @generated
	 */
	EList getEBindingOperations();

} // Binding
