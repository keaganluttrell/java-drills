package com.galvanize.game;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import com.galvanize.entity.Entity;

public class View {
	
	private World world;
	private Vector location;
	
	public View(World world, Vector location){
		this.world = world;
		this.location = location;
	}
	
	public Entity look(Vector direction){
		
		Entity returnEntity = null;
		
		Vector target = this.location.add(direction);
		
		if(this.world.getGrid().isInside(target)){
			returnEntity = this.world.getGrid().get(target);
		}
		
		return returnEntity;	
	}
	
	//direction instead?
	public ArrayList<Vector> findAll(Class<? extends Entity> entityClass){
		
		ArrayList<Vector> returnDirections = new ArrayList<Vector>();
		
		for(Map.Entry<String, Vector> entry: Direction.directions.entrySet()){
			
			Vector currentDirection = entry.getValue();
			
			Entity spotted = look(currentDirection);
			
			if(spotted != null && entityClass.isInstance(spotted)){
				
				returnDirections.add(currentDirection);
			}
		}
		
		return returnDirections;
	}
	
	//direction instead?
	public Vector find(Class<? extends Entity> entityClass){
		
		Vector returnDirection = null;
		
		ArrayList<Vector> directionsList = findAll(entityClass);
		if(!directionsList.isEmpty()){
			returnDirection = directionsList.get(new Random().nextInt(directionsList.size()));
		}
		
		return returnDirection;
	}
	
	public ArrayList<Vector> findAllEmpty(){
		
		ArrayList<Vector> returnDirections = new ArrayList<Vector>();
		
		for(Map.Entry<String, Vector> entry: Direction.directions.entrySet()){
			
			Vector currentDirection = entry.getValue();
			Entity spotted = look(currentDirection);
			
			if(spotted == null){
				returnDirections.add(currentDirection);
			}
		}
		
		return returnDirections;
	}
	
	public Vector findEmpty(){
	
		Vector returnDirection = null;
		
		ArrayList<Vector> directionsList = findAllEmpty();
		if(!directionsList.isEmpty()){
			returnDirection = directionsList.get(new Random().nextInt(directionsList.size()));
		}
		
		
		return returnDirection;
	}
	

}
