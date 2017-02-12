package br.octave.structureKDM.relationship;

public abstract class AbstractActionRelationship {

	private String from, to;

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}
}