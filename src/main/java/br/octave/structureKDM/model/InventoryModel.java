package br.octave.structureKDM.model;

import java.util.ArrayList;
import java.util.List;

import br.octave.structureKDM.inventoryElement.AbstractInventoryElement;

public class InventoryModel extends KDMModel{

	private List<AbstractInventoryElement> inventoryElements;
	
	public InventoryModel(String name){
		this.setName(name);
	}
	
	public void addInventoryElement(AbstractInventoryElement inventoryElement){
		if(this.inventoryElements == null)
			this.inventoryElements = new ArrayList<AbstractInventoryElement>();
		this.inventoryElements.add(inventoryElement);
	}

	public List<AbstractInventoryElement> getInventoryElements() {
		return inventoryElements;
	}
}