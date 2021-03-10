/*
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;

import br.edu.utfpr.fb.oiArduBot.Tipo;
import br.edu.utfpr.fb.oiArduBot.Variavel;
import br.edu.utfpr.fb.oiArduBot.impl.VariavelImpl;
import br.edu.utfpr.fb.services.OiArduBotGrammarAccess.VariavelElements;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
public class OiArduBotGenerator extends AbstractGenerator {

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		Iterator<Greeting> filtered = Iterators.filter(resource.getAllContents(), Greeting.class);
//		Iterator<String> names = Iterators.transform(filtered, new Function<Greeting, String>() {
//
//			@Override
//			public String apply(Greeting greeting) {
//				return greeting.getName();
//			}
//		});
		//fsa.generateFile("greetings.txt", "People to greet: " + IteratorExtensions.join(names, ", "));
		Iterator<Variavel> filtered = Iterators.filter(resource.getAllContents(), Variavel.class);
		Iterator<String> variaveis = Iterators.transform(filtered, new Function<Variavel,String>() {
			@Override
			public String apply(Variavel variavel) {
				return variavel.getName();
			}
		});
		Iterator<String> vValores = Iterators.transform(filtered, new Function<Variavel, String>() {
			@Override
			public String apply(Variavel variavel) {
				return variavel.getValor();
			}
		});
		Iterator<Tipo> vTipos = Iterators.transform(filtered, new Function<Variavel, Tipo>() {
			@Override
			public Tipo apply(Variavel variavel) {
				return variavel.getTipo();
			}
		});
		Map<String, String> varTipo = new HashMap<>();
		Map<String, String> varValor = new HashMap<>();
		String var, valor, tipo;
		while (variaveis.hasNext() && vValores.hasNext() && vTipos.hasNext()) {
			var = variaveis.next();
			valor = vValores.next();
			tipo = vTipos.next().toString();
			varTipo.put(var, tipo);
			varValor.put(var, valor);
		}
		String v,vl,t,vars = "";
		Iterator varTipoIt = varTipo.entrySet().iterator();
		while (varTipoIt.hasNext()) {
			Entry<String, String> entry = (Entry) varTipoIt.next();
			v = entry.getKey();
			t = entry.getValue();
			System.out.println(v+":"+t);
			if (t.equals("Texto")) {
				t = "String";
			} else {
				t = "int";
			}
			vl = varValor.get(v);
			vars += "\n\t"+t+" "+v+" = "+vl+";";
		}
		fsa.generateFile("codigo.ino", 
				"#include <ArduinoRobot.h>\n"
				+ "\n"
				+ "void setup() {"
				+ "\n\tSerial.begin(9600);" +
				vars
				+ "\n}\n"
				+ "\n"
				+ "void loop() {\n"
				+ "\tSerial.print(\"Inicio do loop...\");\n"
				//resource.getAllContents().forEachRemaining();
//					resource.allContents
//						.filter(Greeting)
//						.map[name]
//						.join(', '))
				+ "\tSerial.print(\"Fim do loop!\")"
				+ "\n}");
	}
}
