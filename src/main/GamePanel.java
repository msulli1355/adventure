package main;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel<Graphicw2D, Graphics2D> extends JPanel implements Runnable 
{
	//SCREEN SETTINGS
	final int originalTileSize = 16; //16x16 tile
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale;//48x48 tile
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol;//768px
	final int screenHeight = tileSize * maxScreenRow;//576px
	
	Thread gameThread;

	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (gameThread != null)
		{
	//		System.out.println("The game loop is running.");
			//UPDATE:  update information such as player's positino
			update();
			//DRAW draw the screen
			
			repaint();
		}
	}
	public void update() {
	
		
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphicw2D g2 = (Graphicw2D)g;
		 ((Graphics) g2).setColor(Color.white);
		 ((Graphics) g2).fillRect(100, 100, tileSize, tileSize);
		 ((Graphics) g2).dispose();
	}
}






















