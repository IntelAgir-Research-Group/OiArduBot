/*
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.serializer;

import br.edu.utfpr.fb.oiArduBot.Atuacao;
import br.edu.utfpr.fb.oiArduBot.Beep;
import br.edu.utfpr.fb.oiArduBot.Codigo;
import br.edu.utfpr.fb.oiArduBot.Controle;
import br.edu.utfpr.fb.oiArduBot.Model;
import br.edu.utfpr.fb.oiArduBot.Notificacao;
import br.edu.utfpr.fb.oiArduBot.OiArduBotPackage;
import br.edu.utfpr.fb.oiArduBot.Para;
import br.edu.utfpr.fb.oiArduBot.Robo;
import br.edu.utfpr.fb.oiArduBot.Se;
import br.edu.utfpr.fb.oiArduBot.Senao;
import br.edu.utfpr.fb.oiArduBot.Sensoriamento;
import br.edu.utfpr.fb.oiArduBot.Variavel;
import br.edu.utfpr.fb.services.OiArduBotGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OiArduBotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OiArduBotGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OiArduBotPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OiArduBotPackage.ATUACAO:
				sequence_Atuacao(context, (Atuacao) semanticObject); 
				return; 
			case OiArduBotPackage.BEEP:
				sequence_Beep(context, (Beep) semanticObject); 
				return; 
			case OiArduBotPackage.CODIGO:
				sequence_Codigo(context, (Codigo) semanticObject); 
				return; 
			case OiArduBotPackage.CONTROLE:
				sequence_Controle(context, (Controle) semanticObject); 
				return; 
			case OiArduBotPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case OiArduBotPackage.NOTIFICACAO:
				sequence_Notificacao(context, (Notificacao) semanticObject); 
				return; 
			case OiArduBotPackage.PARA:
				sequence_Para(context, (Para) semanticObject); 
				return; 
			case OiArduBotPackage.ROBO:
				sequence_Robo(context, (Robo) semanticObject); 
				return; 
			case OiArduBotPackage.SE:
				sequence_Se(context, (Se) semanticObject); 
				return; 
			case OiArduBotPackage.SENAO:
				sequence_Senao(context, (Senao) semanticObject); 
				return; 
			case OiArduBotPackage.SENSORIAMENTO:
				sequence_Sensoriamento(context, (Sensoriamento) semanticObject); 
				return; 
			case OiArduBotPackage.VARIAVEL:
				sequence_Variavel(context, (Variavel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Atuacao returns Atuacao
	 *
	 * Constraint:
	 *     notificacoes+=Notificacao
	 */
	protected void sequence_Atuacao(ISerializationContext context, Atuacao semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Beep returns Beep
	 *
	 * Constraint:
	 *     tipo=TipoBeep
	 */
	protected void sequence_Beep(ISerializationContext context, Beep semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OiArduBotPackage.Literals.BEEP__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OiArduBotPackage.Literals.BEEP__TIPO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBeepAccess().getTipoTipoBeepEnumRuleCall_4_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Codigo returns Codigo
	 *
	 * Constraint:
	 *     controles+=Para
	 */
	protected void sequence_Codigo(ISerializationContext context, Codigo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Controle returns Controle
	 *
	 * Constraint:
	 *     paras+=Para
	 */
	protected void sequence_Controle(ISerializationContext context, Controle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (var+='Variaveis'? variaveis+=Variavel* ini+='Inicio' fim+='Fim')
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Notificacao returns Notificacao
	 *
	 * Constraint:
	 *     beep+=Beep
	 */
	protected void sequence_Notificacao(ISerializationContext context, Notificacao semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Para returns Para
	 *
	 * Constraint:
	 *     (de=INT ate=INT passo=INT? codigoPara=STRING)
	 */
	protected void sequence_Para(ISerializationContext context, Para semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robo returns Robo
	 *
	 * Constraint:
	 *     (sensores+=Sensoriamento atuadores+=Atuacao)
	 */
	protected void sequence_Robo(ISerializationContext context, Robo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Se returns Se
	 *
	 * Constraint:
	 *     (condicaoSe=STRING codigoSe=STRING senao+=Senao?)
	 */
	protected void sequence_Se(ISerializationContext context, Se semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Senao returns Senao
	 *
	 * Constraint:
	 *     codigoSenao=STRING
	 */
	protected void sequence_Senao(ISerializationContext context, Senao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OiArduBotPackage.Literals.SENAO__CODIGO_SENAO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OiArduBotPackage.Literals.SENAO__CODIGO_SENAO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSenaoAccess().getCodigoSenaoSTRINGTerminalRuleCall_1_0(), semanticObject.getCodigoSenao());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sensoriamento returns Sensoriamento
	 *
	 * Constraint:
	 *     (sensor+=[Variavel|ID] porta=INT tipo=TipoPorta)
	 */
	protected void sequence_Sensoriamento(ISerializationContext context, Sensoriamento semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variavel returns Variavel
	 *
	 * Constraint:
	 *     (tipo=Tipo name=ID valor=STRING?)
	 */
	protected void sequence_Variavel(ISerializationContext context, Variavel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
