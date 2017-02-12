package br.octave.structureKDM;

import java.util.ArrayList;
import java.util.List;

public class Signature {

	private List<ParameterUnit> parameters;
	
	public void addParameter(ParameterUnit parameter){
		if(this.parameters == null)
			this.parameters = new ArrayList<ParameterUnit>();
		this.parameters.add(parameter);
	}

	public List<ParameterUnit> getParameters() {
		return parameters;
	}
}