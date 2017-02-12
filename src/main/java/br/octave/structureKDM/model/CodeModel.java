package br.octave.structureKDM.model;

import java.util.ArrayList;
import java.util.List;

import br.octave.structureKDM.CompilationUnit;

public class CodeModel extends KDMModel{

	private List<CompilationUnit> compilationUnit;

	public CodeModel(String name){
		this.setName(name);
	}
	
	public void addModule(CompilationUnit compilationUnit){
		if(this.compilationUnit == null)
			this.compilationUnit = new ArrayList<CompilationUnit>();
		this.compilationUnit.add(compilationUnit);
	}
	
	public List<CompilationUnit> getModules() {
		return compilationUnit;
	}
	
}