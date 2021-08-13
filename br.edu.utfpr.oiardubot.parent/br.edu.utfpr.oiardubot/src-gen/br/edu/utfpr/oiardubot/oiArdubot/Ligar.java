/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ligar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Ligar#getTipoPorta <em>Tipo Porta</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Ligar#getPorta <em>Porta</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getLigar()
 * @model
 * @generated
 */
public interface Ligar extends Implementacao
{
  /**
   * Returns the value of the '<em><b>Tipo Porta</b></em>' attribute.
   * The literals are from the enumeration {@link br.edu.utfpr.oiardubot.oiArdubot.TipoPorta}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Porta</em>' attribute.
   * @see br.edu.utfpr.oiardubot.oiArdubot.TipoPorta
   * @see #setTipoPorta(TipoPorta)
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getLigar_TipoPorta()
   * @model
   * @generated
   */
  TipoPorta getTipoPorta();

  /**
   * Sets the value of the '{@link br.edu.utfpr.oiardubot.oiArdubot.Ligar#getTipoPorta <em>Tipo Porta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Porta</em>' attribute.
   * @see br.edu.utfpr.oiardubot.oiArdubot.TipoPorta
   * @see #getTipoPorta()
   * @generated
   */
  void setTipoPorta(TipoPorta value);

  /**
   * Returns the value of the '<em><b>Porta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Porta</em>' containment reference.
   * @see #setPorta(Porta)
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getLigar_Porta()
   * @model containment="true"
   * @generated
   */
  Porta getPorta();

  /**
   * Sets the value of the '{@link br.edu.utfpr.oiardubot.oiArdubot.Ligar#getPorta <em>Porta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Porta</em>' containment reference.
   * @see #getPorta()
   * @generated
   */
  void setPorta(Porta value);

} // Ligar