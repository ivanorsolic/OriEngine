package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;

//Testing Class
public class MainGameLoop {

	public static void main(String[] args) {
		
		//Opening the display using a method from DisplayManager
		DisplayManager.createDisplay();
		
		//game loop - this is where all the objects are displayed
		//where all the rendering is happening, etc.
		//!Display.isCloseRequested <-- run until the user presses X
		while(!Display.isCloseRequested()){
			
			//game logic
			//render
			
			//update the display every frame
			DisplayManager.updateDisplay();
			
		}
		
		//closing the display
		DisplayManager.closeDisplay();
	}

}
