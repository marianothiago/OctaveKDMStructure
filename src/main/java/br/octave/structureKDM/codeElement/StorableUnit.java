package br.octave.structureKDM.codeElement;

public class StorableUnit extends ComputationalObject{
	
	private String kind;
	
	public StorableUnit(String kind){
		this.kind = kind;
	}
	
	public String getKind(){
		return this.kind;
	}
}