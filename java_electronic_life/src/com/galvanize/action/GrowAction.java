package com.galvanize.action;

import com.galvanize.entity.Entity;
import com.galvanize.entity.plant.PlantEntity;
import com.galvanize.game.Direction;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public class GrowAction extends Action{

	public GrowAction(Entity actor) {
		super(actor, Direction.ZERO);
	}

	@Override
	public boolean execute(World world, Vector sourceLocation) {
		
		boolean returnBool = false;
		
		if(this.actor instanceof PlantEntity){
			this.actor.setEnergy(this.actor.getEnergy() + 1);
			returnBool = true;
		}
		
		return returnBool;
	}

}
