package br.octave.structureKDM.inventoryElement;

public class SourceFile extends AbstractInventoryElement{

	private String name;

	public SourceFile(String name, String path) {
		this.name = name;
		this.setPath(path);
	}

	public String getName() {
		return name;
	}
}