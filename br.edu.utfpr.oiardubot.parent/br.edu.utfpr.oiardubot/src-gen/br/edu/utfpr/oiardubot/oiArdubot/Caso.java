/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Caso#getValor <em>Valor</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Caso#getCodigo <em>Codigo</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getCaso()
 * @model
 * @generated
 */
public interface Caso extends EObject
{
  /**
   * Returns the value of the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' attribute.
   * @see #setValor(String)
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getCaso_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link br.edu.utfpr.oiardubot.oiArdubot.Caso#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

  /**
   * Returns the value of the '<em><b>Codigo</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.utfpr.oiardubot.oiArdubot.Codigo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codigo</em>' containment reference list.
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getCaso_Codigo()
   * @model containment="true"
   * @generated
   */
  EList<Codigo> getCodigo();

} // Caso