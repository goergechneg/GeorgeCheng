//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x,y,10,10);
		xSpeed = 1;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		xSpeed = 1;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y,w,h,c);
		xSpeed = 1;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd)
	{
		super(x,y,w,h,c);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	
	 public void setPos( int x, int y) {
		 super.setPos(x, y);
	 }
	 public void setXSpeed( int x ) {
		 xSpeed = x;
	 }
	 public void setYSpeed( int y ) {
		 ySpeed = y;
	 }

	 public int getXSpeed() {
		 return xSpeed;
	 }
	 public int getYSpeed() {
		 return ySpeed;
	 }
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  window.setColor(Color.WHITE);
	  window.fillOval(getX(),getY(),getWidth(),getHeight());
	  

      setX(getX()+xSpeed);
		//setY
      setY(getY() + ySpeed);
		//draw the ball at its new location
      window.setColor(getColor());
		window.fillOval(getX(), getY(), getWidth(), getHeight());;
   }
   
	public boolean equals(Object obj)
	{
		Ball ball = (Ball) obj;
		return super.equals(ball)&&xSpeed==ball.getXSpeed()&&ySpeed==ball.getYSpeed();
		
	}   

   //add the get methods

	public String toString() {
		return super.toString()+" xSpeed:"+xSpeed+" ySpeed:"+ ySpeed;
	}
   //add a toString() method
	
	public boolean didCollideLeft(Object obj)
	{
		Block block = (Block)obj;
		if((getX() == block.getX() + block.getWidth())
				&& getY() + getHeight()/2 > block.getY()
				&& getY() + getHeight()/2 < block.getY() + block.getHeight())
		{
			return true;
		}
		return false;
	}
	public boolean didCollideRight(Object obj)
	{
		Block block = (Block)obj;
		if(getX() + getWidth() == block.getX()
				&& getY() + getHeight()/2 > block.getY()
				&& getY() + getHeight()/2 < block.getY() + block.getHeight())
		{
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj)
	{
		Block block = (Block)obj;
		if(getY() == block.getY() + block.getHeight())
		{
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj)
	{
		Block block = (Block)obj;
		if(getY() + getHeight() == block.getY())
		{
			return true;
		}
		return false;
	}
}