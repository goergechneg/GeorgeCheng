//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	private Block leftWall;
	private Block rightWall;
	private Block topWall;
	private Block bottomWall;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(150,150,10,10,Color.RED);
		leftPaddle = new Paddle(0,400,10,70,Color.GREEN,4);
		rightPaddle = new Paddle(750,400,10,70,Color.GREEN,4);
		leftScore = 0;
		rightScore = 0;
		topWall = new Block(0,0,800,0,Color.WHITE);
		bottomWall = new Block(0,500,800,0,Color.WHITE);
		rightWall = new Block(800,0,0,800,Color.WHITE);
		leftWall = new Block(0,0,0,800,Color.WHITE);
		keys = new boolean[4];
    	setBackground(Color.WHITE);
		setVisible(true);
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.drawString("Right Score : " + rightScore, 600, 500);
		graphToBack.drawString("Left Score : " + leftScore, 600, 525);
		bottomWall.draw(graphToBack);
		topWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		leftWall.draw(graphToBack);

		//see if ball hits left wall or right wall
		if(ball.didCollideLeft(leftWall) || ball.didCollideRight(rightWall))
		{
			leftPaddle.setSpeed(0);
			rightPaddle.setSpeed(0);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if(ball.didCollideLeft(leftWall))
			{
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Right Score : " + rightScore, 600, 500);
				rightScore++;
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Right Score : " + rightScore, 600, 500);
			}
			else if(ball.didCollideRight(rightWall))
			{
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Left Score : " + leftScore, 600, 525);
				leftScore++;
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Left Score : " + leftScore, 600, 525);
			}
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillOval(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setXSpeed(1);
			ball.setYSpeed(1);
			ball.setPos(150,150);
			leftPaddle.setSpeed(2);
			rightPaddle.setSpeed(2);
		}
		
		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideTop(topWall)||ball.didCollideBottom(bottomWall)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		if(ball.didCollideLeft(leftPaddle))
			ball.setXSpeed(-ball.getXSpeed());
		
		
		//see if the ball hits the right paddle
		
		if(ball.didCollideRight(rightPaddle))
			ball.setXSpeed(-ball.getXSpeed());


		//see if the paddles need to be moved
		if(keys[0])
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1])
		{
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2])
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3])
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}