package com.galvanize.entity;

import java.awt.Image;

import com.galvanize.action.Action;
import com.galvanize.game.View;

public abstract class Entity {
	
	protected Image sprite;
	
	protected boolean act;
	
	protected int energy;
	
	//invoke and return the action you would like to do
	public abstract Action act(View view);
	
	//if action is successful gets called and you can update your energy level
	public abstract void done(Action action);

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isAct() {
		return act;
	}

	public void setAct(boolean act) {
		this.act = act;
	}

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
}
