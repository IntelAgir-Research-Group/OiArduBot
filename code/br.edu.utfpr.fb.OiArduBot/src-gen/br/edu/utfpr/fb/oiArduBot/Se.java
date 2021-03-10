/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.oiArduBot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Se</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.Se#getCondicaoSe <em>Condicao Se</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.Se#getCodigoSe <em>Codigo Se</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.Se#getSenao <em>Senao</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.fb.oiArduBot.OiArduBotPackage#getSe()
 * @model
 * @generated
 */
public interface Se extends EObject
{
  /**
   * Returns the value of the '<em><b>Condicao Se</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condicao Se</em>' attribute.
   * @see #setCondicaoSe(String)
   * @see br.edu.utfpr.fb.oiArduBot.OiArduBotPackage#getSe_CondicaoSe()
   * @model
   * @generated
   */
  String getCondicaoSe();

  /**
   * Sets the value of the '{@link br.edu.utfpr.fb.oiArduBot.Se#getCondicaoSe <em>Condicao Se</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condicao Se</em>' attribute.
   * @see #getCondicaoSe()
   * @generated
   */
  void setCondicaoSe(String value);

  /**
   * Returns the value of the '<em><b>Codigo Se</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codigo Se</em>' attribute.
   * @see #setCodigoSe(String)
   * @see br.edu.utfpr.fb.oiArduBot.OiArduBotPackage#getSe_CodigoSe()
   * @model
   * @generated
   */
  String getCodigoSe();

  /**
   * Sets the value of the '{@link br.edu.utfpr.fb.oiArduBot.Se#getCodigoSe <em>Codigo Se</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Codigo Se</em>' attribute.
   * @see #getCodigoSe()
   * @generated
   */
  void setCodigoSe(String value);

  /**
   * Returns the value of the '<em><b>Senao</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.utfpr.fb.oiArduBot.Senao}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Senao</em>' containment reference list.
   * @see br.edu.utfpr.fb.oiArduBot.OiArduBotPackage#getSe_Senao()
   * @model containment="true"
   * @generated
   */
  EList<Senao> getSenao();

} // Se
