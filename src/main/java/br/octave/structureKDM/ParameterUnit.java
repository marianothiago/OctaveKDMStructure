package br.octave.structureKDM;

public class ParameterUnit{

	private int pos;
	private String name, kind;

	public ParameterUnit(String name, String kind, int pos) {
		this.name = name;
		this.kind = kind;
		this.pos = pos;
	}

	public int getPos() {
		return pos;
	}
	public String getName(){
		return this.name;
	}
	public String getKind(){
		return this.kind;
	}
}