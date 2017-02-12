package br.octave.structureKDM.codeElement;

import java.util.ArrayList;
import java.util.List;

import br.octave.structureKDM.relationship.AbstractActionRelationship;

public abstract class AbstractCodeElement {

	private List<AbstractActionRelationship> relations;
	private List<AbstractCodeElement> codeElements;

	public List<AbstractActionRelationship> getRelations() {
		return relations;
	}
	
	public void addRelations(AbstractActionRelationship relation){
		if(this.relations == null)
			this.relations = new ArrayList<AbstractActionRelationship>();
		this.relations.add(relation);
	}
	
	public void addCodeElement(AbstractCodeElement codeElement){
		if(this.codeElements == null)
			this.codeElements = new ArrayList<AbstractCodeElement>();
		this.codeElements.add(codeElement);
	}

	public List<AbstractCodeElement> getCodeElements() {
		return codeElements;
	}
}