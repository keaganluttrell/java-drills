package com.galvanize.entity.plant;

import javax.swing.ImageIcon;

import com.galvanize.action.Action;
import com.galvanize.action.GrowAction;
import com.galvanize.action.ReproduceAction;
import com.galvanize.game.Vector;
import com.galvanize.game.View;

public class ExamplePlantEntity extends PlantEntity {

	public ExamplePlantEntity(){
		super();
		this.setSprite(new ImageIcon("sprites/plantexamplesprite.png").getImage());
		this.setEnergy(5);
	}
	
	@Override
	public Action act(View view) {
		Action returnAction;
		
		Vector emptySpace = view.findEmpty();
		
		if(this.getEnergy() >= 10 && emptySpace != null){
			
			returnAction = new ReproduceAction(this, emptySpace);	
			
		}else{
			returnAction = new GrowAction(this);
		}
		
		return returnAction;
	}

	@Override
	public void done(Action action) {		
	}

}
