package com.galvanize.action;

import com.galvanize.entity.Entity;
import com.galvanize.entity.animal.AnimalEntity;
import com.galvanize.game.Vector;
import com.galvanize.game.World;

public class MoveAction extends Action {

	public MoveAction(Entity actor, Vector direction) {
		super(actor, direction);
	}

	@Override
	public boolean execute(World world, Vector sourceLocation) {

		boolean returnBool = false;

		if (this.actor instanceof AnimalEntity) {

			Vector actionLocation = sourceLocation.add(this.direction);

			if (world.getGrid().isInside(actionLocation)) {

				Entity entityAtLocation = world.getGrid().get(actionLocation);

				if (entityAtLocation == null) {

					world.getGrid().set(actionLocation, this.actor);
					world.getGrid().set(sourceLocation, null);

					this.actor.setEnergy(this.actor.getEnergy() - 1);

					returnBool = true;
				}
			}
		}

		return returnBool;
	}

}
