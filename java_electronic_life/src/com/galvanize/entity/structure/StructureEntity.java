package com.galvanize.entity.structure;

import com.galvanize.entity.Entity;

public abstract class StructureEntity extends Entity {
	
	public StructureEntity(){
		super();
		this.setAct(false);
		this.setEnergy(1);
	}

}
