package com.amittaigames.coyote.render;

import com.amittaigames.coyote.engine.CoreGame;

public class Window {
	
	protected static String title;
	public static int height;
	public static int width;
	protected static CoreGame cg;
	
	public static void init(String title, int width, int height, CoreGame cg) {
		Window.title = title;
		Window.height = height;
		Window.width = width;
		Window.cg = cg;
		
		
		if (cg.isGLRender()) {
			System.out.println("Using OpenGL Rendering");
			OpenGLWindow.init();
		} else {
			System.out.println("Using Software Rendering");
			SoftwareWindow.init();
		}
	}
	
}