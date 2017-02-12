package br.octave.structureKDM.codeElement;

public class ActionElement extends AbstractCodeElement{

	private String kind, name;
	
	public ActionElement(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	public String getKind() {
		return this.kind;
	}
	public String getName() {
		return this.name;
	}
}