package com.galvanize.action;

import com.galvanize.entity.Entity;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public abstract class Action {

	protected Entity actor;
	protected Vector direction;
	
	public Action(Entity actor, Vector direction){
		this.actor = actor;
		this.direction = direction;
	}
	
	public abstract boolean execute(World world, Vector sourceLocation);
	
}
