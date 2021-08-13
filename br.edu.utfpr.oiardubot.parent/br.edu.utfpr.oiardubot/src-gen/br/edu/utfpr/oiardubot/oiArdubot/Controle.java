/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Controle#getParas <em>Paras</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getControle()
 * @model
 * @generated
 */
public interface Controle extends EObject
{
  /**
   * Returns the value of the '<em><b>Paras</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.utfpr.oiardubot.oiArdubot.Para}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paras</em>' containment reference list.
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getControle_Paras()
   * @model containment="true"
   * @generated
   */
  EList<Para> getParas();

} // Controle