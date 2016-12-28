package com.galvanize.map;

import java.util.Random;

import com.galvanize.entity.Entity;
import com.galvanize.entity.animal.ExampleAnimalEntity;
import com.galvanize.entity.plant.ExamplePlantEntity;
import com.galvanize.entity.structure.ExampleStructureEntity;

public class Map {

	public static Entity[][] map = generateMap();
	
	public static Entity[][] generateMap(){
		
		Entity[][] returnMap = new Entity[20][20];
		
		Random rand = new Random();
		
		for(int x = 0; x < 20; x++){
			for(int y = 0; y < 20; y++){
				
				int randomInt = rand.nextInt(20);
				
				// Wall border
				if(x == 0 || x == 19 || y == 0 || y == 19){
					
					returnMap[x][y] = new ExampleStructureEntity();
					
				// 2 / 20 chance of spawning a wall
				} else if(randomInt <= 2){
					
					returnMap[x][y] = new ExampleStructureEntity();
					
				// 1 / 20 chance of spawning an animal
				} else if(randomInt == 3){
					
					returnMap[x][y] = new ExampleAnimalEntity();
					
				// 4 / 20 chance of spawning a plant
				} else if(randomInt < 7){
					
					returnMap[x][y] = new ExamplePlantEntity();
					
				}
				
			}
		}
		
		return returnMap;
	}
	
}
