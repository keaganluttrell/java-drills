package com.galvanize.action;

import java.lang.reflect.Constructor;

import com.galvanize.entity.Entity;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public class ReproduceAction extends Action{

	public ReproduceAction(Entity actor, Vector direction) {
		super(actor, direction);
	}

	@Override
	public boolean execute(World world, Vector sourceLocation) {
		
		boolean returnBool = false;
		
		Vector actionLocation = sourceLocation.add(this.direction);
				
		//if empty area
		if(world.getGrid().isInside(actionLocation) && world.getGrid().get(actionLocation) == null){
			
			Class<? extends Entity> begetterClass = this.actor.getClass();
			
			try{
				
				Constructor<? extends Entity> begetterConstructor = begetterClass.getConstructor();
				
				Entity offspring = begetterConstructor.newInstance();
				
				world.getGrid().set(actionLocation, offspring);
				
				this.actor.setEnergy(this.actor.getEnergy() / 2);
				
				returnBool = true;
				
			}catch(Exception E){
				System.err.println(E.getMessage());
			}
			
		}
		
		return returnBool;	
	}
}

