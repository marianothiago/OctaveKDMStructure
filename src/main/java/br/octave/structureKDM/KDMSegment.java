package br.octave.structureKDM;

import java.util.ArrayList;
import java.util.List;

import br.octave.structureKDM.model.KDMModel;

public class KDMSegment {

	private String name;
	private List<KDMModel> models;
	
	public KDMSegment(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addSegment(KDMModel model){
		if(this.models == null)
			this.models = new ArrayList<KDMModel>();
		this.models.add(model);
	}

	public List<KDMModel> getModels() {
		return models;
	}
}