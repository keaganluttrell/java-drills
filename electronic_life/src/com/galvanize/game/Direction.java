package com.galvanize.game;

import java.util.HashMap;
import java.util.Random;

public class Direction {
	
	
	public static final Vector NORTH = new Vector(0,-1);
	public static final Vector NORTHEAST = new Vector(1,-1);
	public static final Vector EAST = new Vector(1,0);
	public static final Vector SOUTHEAST = new Vector(1,1);
	public static final Vector SOUTH = new Vector(0,1);
	public static final Vector SOUTHWEST = new Vector(-1,1);
	public static final Vector WEST = new Vector(-1,0);
	public static final Vector NORTHWEST = new Vector(-1,-1);
	public static final Vector ZERO = new Vector(0, 0);
	
	public static HashMap<String, Vector> directions = new HashMap<String, Vector>();
	
	static {
		//NOTE: does not include zero
		directions.put("north", NORTH);
		directions.put("northeast", NORTHEAST);
		directions.put("east", EAST);
		directions.put("southeast", SOUTHEAST);
		directions.put("south", SOUTH);
		directions.put("southwest", SOUTHWEST);
		directions.put("west", WEST);
		directions.put("northwest", NORTHWEST);
	}
	
	public static Vector getRandom(){
		String[] keyList = directions.keySet().toArray(new String[directions.size()]);
		return directions.get(keyList[new Random().nextInt(keyList.length)]);
	}

}
