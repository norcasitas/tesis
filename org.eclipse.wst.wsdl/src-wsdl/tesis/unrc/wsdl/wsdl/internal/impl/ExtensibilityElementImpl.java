/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.unrc.wsdl.wsdl.ExtensibilityElement;
import tesis.unrc.wsdl.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensibility Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.ExtensibilityElementImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.ExtensibilityElementImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensibilityElementImpl extends WSDLElementImpl implements ExtensibilityElement {
	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final QName ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected QName elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensibilityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.EXTENSIBILITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.EXTENSIBILITY_ELEMENT__REQUIRED,
					oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(QName newElementType) {
		QName oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.EXTENSIBILITY_ELEMENT__ELEMENT_TYPE,
					oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WSDLPackage.EXTENSIBILITY_ELEMENT__REQUIRED:
			return isRequired() ? Boolean.TRUE : Boolean.FALSE;
		case WSDLPackage.EXTENSIBILITY_ELEMENT__ELEMENT_TYPE:
			return getElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WSDLPackage.EXTENSIBILITY_ELEMENT__REQUIRED:
			setRequired(((Boolean) newValue).booleanValue());
			return;
		case WSDLPackage.EXTENSIBILITY_ELEMENT__ELEMENT_TYPE:
			setElementType((QName) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case WSDLPackage.EXTENSIBILITY_ELEMENT__REQUIRED:
			setRequired(REQUIRED_EDEFAULT);
			return;
		case WSDLPackage.EXTENSIBILITY_ELEMENT__ELEMENT_TYPE:
			setElementType(ELEMENT_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WSDLPackage.EXTENSIBILITY_ELEMENT__REQUIRED:
			return required != REQUIRED_EDEFAULT;
		case WSDLPackage.EXTENSIBILITY_ELEMENT__ELEMENT_TYPE:
			return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (required: "); //$NON-NLS-1$
		result.append(required);
		result.append(", elementType: "); //$NON-NLS-1$
		result.append(elementType);
		result.append(')');
		return result.toString();
	}

	@Override
	public Boolean getRequired() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRequired(Boolean arg0) {
		// TODO Auto-generated method stub
		
	}

} //ExtensibilityElementImpl
