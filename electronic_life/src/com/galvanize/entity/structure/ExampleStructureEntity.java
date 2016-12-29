package com.galvanize.entity.structure;

import javax.swing.ImageIcon;

import com.galvanize.action.Action;
import com.galvanize.game.View;

public class ExampleStructureEntity extends StructureEntity{
	
	public ExampleStructureEntity(){
		super();
		setSprite(new ImageIcon("sprites/structureexamplesprite.png").getImage());
	}

	@Override
	public Action act(View view) {
		return null;
	}

	@Override
	public void done(Action action) {		
	}

}
