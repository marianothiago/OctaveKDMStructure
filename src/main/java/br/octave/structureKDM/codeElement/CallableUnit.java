package br.octave.structureKDM.codeElement;

import br.octave.structureKDM.Signature;

public class CallableUnit extends ComputationalObject{

	private String kind;
	private Signature signature;
	
	public CallableUnit(String kind, Signature signature) {
		super();
		this.kind = kind;
		this.signature = signature;
	}


	public String getKind() {
		return kind;
	}

	public Signature getSignature() {
		return signature;
	}
}