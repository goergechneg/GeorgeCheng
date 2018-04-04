//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y)
	{
	setPos(x,y);	
	}
	
	public Block(int x, int y, int w, int h)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	   //add the other set methods
   public void setPos(int x, int y)
   {
	   xPos = x;
	   yPos = y;
   }
   


   public void setX(int x)
   {
	   xPos =x ;
   }
   
   public void setY(int y)
   {
	   yPos = y;
   }
   public void setColor(Color col)
   {
	   color = col;

   }
   
   public void setWidth(int w)
   {
	   width = w;
   }
   
   public void setHeight(int h) {
	   height = h;
   }
   
   public int getX() {
	   return xPos;
   }
   
   public int getY() {
	   return yPos;
   }
   
   public int getWidth()
   {
	   return width;
   }
   
   public int getHeight() {
	   return height;
   }
   
   public Color getColor() {
	   return color;
   }
   public void draw(Graphics window)
   {
   	window.setColor(color);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   

   }
   
	public boolean equals(Object obj)
	{
		Block x = (Block) obj;
		if(x.getColor()==getColor()
			&& x.getHeight()==getHeight()
			&& x.getWidth()==getWidth()
			&& x.getX()==getX()
			&& x.getY()==getY())
			return true;

		return false;
	}   

	public String toString()
	{
		return "X Position = " + xPos + " Y Position = " + yPos + " Width = " + width + " Height = " + height + " Color = "+ color;
	}

   //add a toString() method  - x , y , width, height, color
}