package guimodule;
import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup() {
		
		size(400,400);
		background(200, 0, 255);
		
	}
	public void draw() {
		fill(255,255,0);
		ellipse(200, 200, 390, 390);
		fill(0, 0, 0);
		ellipse(120, 135, 50, 70);
		fill(0, 0, 0);
		
		ellipse(260, 135, 50, 70);
		noFill();
		
		arc(200,280,75,75,0,PI);
		
		}
}
