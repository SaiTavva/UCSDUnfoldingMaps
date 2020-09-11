package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
	PImage img;
	public void setup() {
		size(400,400);
		background(255);
		stroke(0);
		img=loadImage("https://upload.wikimedia.org/wikipedia/commons/6/67/Hoffl%C3%B6th%28T%C3%B6Vo-Cl%C3%B6rath%29-2%28400x400%29.jpg","jpg");
		//img.resize(width,0);
		//image(img,0,0);
		background(img);
	}
	public void draw() {
		//fill(0,0,0);
		//ellipse(50,50,51,51);
		//fill(255,255,0);
		//ellipse(50,50,50,50);
		int[] color=sunColorSet(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/4,width/4,height/5);
	}
	public int[] sunColorSet(float seconds) {
		int rgb[]=new int[3];
		float diffFrom30=Math.abs(30-seconds);
		float ratio=diffFrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		return rgb;
		
	}
	//public static void main(String args[]) {
		//MyPApplet 
		//for(int i=0;i<=30;i++) {
			
			
		
		
	}
	

