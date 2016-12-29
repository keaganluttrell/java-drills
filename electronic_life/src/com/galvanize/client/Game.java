package com.galvanize.client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.galvanize.entity.Entity;
import com.galvanize.game.Vector;
import com.galvanize.game.World;
import com.galvanize.map.Map;

public class Game extends JPanel{

	private static final long serialVersionUID = 1770946754572052431L;
	
	private World gameWorld;
	
	private Timer timer;
	
	private int tickRate = 1000;
	
	private int tileSize = 24;
	
	private int width;
	private int height;
	
	public Game(int width, int height){
		initGame(width, height);
	}
	
	private void initGame(int width, int height){
		
		this.width = width;
		this.height = height;
		
		this.gameWorld = new World(Map.map);
	
		this.timer = new Timer();
		
		this.setBackground(new Color(66, 66, 66));
		this.setPreferredSize(new Dimension(this.width, this.height));
		this.setDoubleBuffered(true);
		
		timer.scheduleAtFixedRate(new paintTask(), 0, tickRate);
		
	}
	
	

    @Override
    public void paintComponent(Graphics graphics) {
    	super.paintComponent(graphics);
    	 
        this.gameWorld.getGrid().forEach((Entity entity, Vector location) -> {
        	graphics.drawImage(entity.getSprite(), location.getX() * tileSize, location.getY() * tileSize, tileSize, tileSize, this);
        });
        
    }
    
    private class paintTask extends TimerTask{

		@Override
		public void run() {
			gameWorld.turn();
			repaint();
		}
    	
    }
}
