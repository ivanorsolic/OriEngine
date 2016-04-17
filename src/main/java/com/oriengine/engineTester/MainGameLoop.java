package com.oriengine.engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;

//Testing Class
public class MainGameLoop {

	public static void main(String[] args) {
		
		//Opening the display using a method from DisplayManager
		DisplayManager.createDisplay();
		
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		float[] vertices = {
				  -0.5f, 0.5f, 0,
				  -0.5f, -0.5f, 0,
				  0.5f, -0.5f, 0,
				  0.5f, 0.5f, 0f
				};
				  
		int[] indices = {
				  0,1,3,
				  3,1,2
				};
		//game loop - this is where all the objects are displayed
		//where all the rendering is happening, etc.
		//!Display.isCloseRequested <-- run until the user presses X
		RawModel model = loader.loadToVAO(vertices, indices);
		while(!Display.isCloseRequested()){
			renderer.prepare();
			//game logic
			//render
			renderer.render(model);
			
			//update the display every frame
			DisplayManager.updateDisplay();
			
		}
		
		loader.cleanUp();
		//closing the display
		DisplayManager.closeDisplay();
	}

}