package com.galvanize.action;

import com.galvanize.entity.Entity;
import com.galvanize.game.Direction;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public class DieAction extends Action{

	public DieAction(Entity actor) {
		super(actor, Direction.ZERO);
	}

	@Override
	public boolean execute(World world, Vector sourceLocation) {
		
		boolean returnBool = false;
		
		Vector actionLocation = sourceLocation.add(this.direction);
		
		Entity entityToDie = world.getGrid().get(actionLocation);
		
		if(entityToDie != null){
			world.deleteItemAtLocation(actionLocation);
			returnBool = true;
		}
		
		return returnBool;
	}

}
