package com.galvanize.client;

import javax.swing.JFrame;

public class ElectronicLife extends JFrame {

	private static final long serialVersionUID = -3141540977640208905L;
	
	public ElectronicLife(){
		init();
	}
	
	private void init(){
		
		add(new Game(480, 480));
		
		setSize(480, 504);
		
		setTitle("Electronic Life");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
	}

	
	
	public static void main(String[] args){
		new ElectronicLife();
	}
}
