package com.galvanize.game;

import com.galvanize.entity.Entity;

public class Grid {
	
	private Entity[] matrix;
	private int width;
	private int height;
	
	public Grid(int width, int height){
		
		this.width = width;
		this.height = height;
		
		this.matrix = new Entity[this.width * this.height];
	}
	
	
	public Entity get(Vector location){
		
		Entity returnEntity = null;
		
		if(isInside(location)){
			returnEntity = this.matrix[location.getX() + this.width * location.getY()];
		}
		
		return returnEntity;
	}
	
	public void set(Vector location, Entity item){
		if(isInside(location)){
			this.matrix[location.getX() + this.width * location.getY()] = item;	
		}
	}
	
	public boolean isInside(Vector location){
		
		boolean returnBool = false;
		
		if(location.getX() >= 0 && location.getX() < this.width
			 &&  location.getY() >= 0 && location.getY() < this.height){
			returnBool = true;
		}
		
		return returnBool;
	}
	
	public void forEach(ActionRunner runner){
		for(int x = 0; x < this.width; x++){
			for(int y = 0; y < this.height; y++){
				
				Vector currentLocation = new Vector(x, y);
				Entity currentEntity = get(currentLocation);
				
				if(currentEntity != null){
					runner.takeAction(currentEntity, currentLocation);
				}
			}
		}
	}

}
