package com.galvanize.entity.animal;

import javax.swing.ImageIcon;

import com.galvanize.action.Action;
import com.galvanize.action.EatAction;
import com.galvanize.action.MoveAction;
import com.galvanize.action.ReproduceAction;
import com.galvanize.entity.plant.PlantEntity;
import com.galvanize.game.Direction;
import com.galvanize.game.Vector;
import com.galvanize.game.View;

public class ExampleAnimalEntity extends AnimalEntity {
	
	public ExampleAnimalEntity(){
		super();
		this.setEnergy(40);
		this.setSprite(new ImageIcon("sprites/animalexamplesprite2.png").getImage());
	}

	@Override
	public Action act(View view) {
		
		Action returnAction;
		
		Vector mateDirection = view.find(ExampleAnimalEntity.class);
		Vector emptyDirection = view.findEmpty();
		Vector dinnerDirection = view.find(PlantEntity.class);
		
		if(mateDirection != null && emptyDirection != null && this.getEnergy() >= 80){
			
			returnAction = new ReproduceAction(this, emptyDirection);
			
		}else if(dinnerDirection != null){
			
			returnAction = new EatAction(this, dinnerDirection);
			
		}else{
			
			returnAction = new MoveAction(this, Direction.getRandom());
			
		}
		
		return returnAction;
	}

	@Override
	public void done(Action action) {

		
	}

}
