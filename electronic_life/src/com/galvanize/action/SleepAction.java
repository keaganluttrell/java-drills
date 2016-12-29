package com.galvanize.action;

import com.galvanize.entity.Entity;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public class SleepAction extends Action{

	public SleepAction(Entity actor, Vector direction) {
		super(actor, direction);
	}

	@Override
	public boolean execute(World world, Vector sourceLocation) {
		return true;
	}

}
