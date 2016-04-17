package renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

//A Class for managing the display
public class DisplayManager {

	//Width and the height of the display
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	//FPS cap at which we want the game to run at
	private static final int FPS_CAP = 120;
	
	//Method to open up the display at the beginning when we start the game
	public static void createDisplay(){
		
		//Version of the OpenGL we're using, enabling forward compatibility and ProfileCore
		//Just a couple of settings, not too important
		ContextAttribs attribs = new ContextAttribs(3,2).withForwardCompatible(true).withProfileCore(true);
		
		try {
			//Determining the size of the display
			Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
			//Actually creating the display
			Display.create(new PixelFormat(), attribs);
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		//Telling OpenGL where on the display it can render the game
		//x,y=0 <-- choosing the whole display, bottom left and top right -->Width, Height
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
	}
	
	//Method to update the display every frame
	public static void updateDisplay(){
		Display.sync(FPS_CAP);
		Display.update();
	}
	
	//Method to exit and close the display
	public static void closeDisplay(){
		Display.destroy();
		}
}
