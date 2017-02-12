package br.octave.structureKDM;

import br.octave.structureKDM.codeElement.AbstractCodeElement;

public class CompilationUnit extends AbstractCodeElement{
	
	private String name;
	
	public CompilationUnit(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}