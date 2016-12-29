package com.galvanize.action;

import com.galvanize.entity.Entity;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public class EatAction extends Action{

	public EatAction(Entity actor, Vector direction) {
		super(actor, direction);
	}

	@Override
	public boolean execute(World world, Vector sourceLocation) {
		
		boolean returnBool = false;
		
		Vector actionLocation = sourceLocation.add(this.direction);
		
		Entity entityToEat = world.getGrid().get(actionLocation);
		
		if(world.getGrid().isInside(actionLocation) && entityToEat != null){
			
			this.actor.setEnergy(this.actor.getEnergy() + entityToEat.getEnergy());
			
			world.deleteItemAtLocation(actionLocation);
			
			returnBool = true;
		}
		
		return returnBool;
	}

}
