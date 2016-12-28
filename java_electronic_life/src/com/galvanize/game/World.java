package com.galvanize.game;

import java.util.ArrayList;

import com.galvanize.action.Action;
import com.galvanize.entity.Entity;

public class World {
	
	private Grid grid;
	
	public World(Entity[][] map){
		
		this.grid = new Grid(map[0].length , map.length);
		
		for(int x = 0; x < map.length; x++){
			for(int y = 0; y < map[x].length; y++){
				this.getGrid().set(new Vector(x, y), map[x][y]);
			}
		}	
	}
	
	public void turn(){
		ArrayList<Entity> acted = new ArrayList<Entity>();

		
		getGrid().forEach((Entity entity, Vector location) -> {
			
			if(entity.isAct() && !acted.contains(entity)){
				
				Action intendedAction = entity.act(new View(this, location));
				
				// attempt to perform action
				if(intendedAction.execute(this, location)){
					
					//if successful invoke entities done method
					entity.done(intendedAction);
				}
				
				// if entity energy less than 0
				if(entity.getEnergy() <= 0){
					deleteItemAtLocation(location);
				}
				
				acted.add(entity);
			}
		});
	}
	
	public void deleteItemAtLocation(Vector location){
		this.grid.set(location, null);
	}
	
	public boolean checkDirection(Vector direction, Vector location){
		return this.grid.isInside(direction.add(location));
	}

	public Grid getGrid() {
		return grid;
	}

}
