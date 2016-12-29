package com.galvanize.action;

import com.galvanize.entity.Entity;
import com.galvanize.entity.animal.AnimalEntity;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public class PoopAction extends Action {

	public PoopAction(Entity actor, Vector direction) {
		super(actor, direction);
	}

	@Override
	public boolean execute(World world, Vector sourceLocation) {
		
		boolean returnBool = false;
		
		if(this.actor instanceof AnimalEntity){
			this.actor.setEnergy(this.actor.getEnergy() - 1 );
			returnBool = true;
		}
		
		
		return returnBool;
	}

}
