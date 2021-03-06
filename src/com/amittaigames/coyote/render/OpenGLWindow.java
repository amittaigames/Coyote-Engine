package com.amittaigames.coyote.render;

import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import com.amittaigames.coyote.engine.CrashHandler;
import com.amittaigames.coyote.engine.Engine;

public class OpenGLWindow extends Window {

	private static long lastFrame;
	
	public static void init() {
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.setTitle(title);
			if (Engine.USING_VSYNC) {
				Display.setVSyncEnabled(true);
				System.out.println("[Coyote] Using VSync");
			}
			Display.create();
			Keyboard.create();
		} catch (Exception e) {
			CrashHandler.init(e);
		}
		
		start();
	}
	
	private static void start() {
		initGL();
		getDelta();
		
		cg.init();
		
		while (!Display.isCloseRequested()) {
			int delta = getDelta();
			
			cg.update(delta);
			cg.render(new Render(true));
			
			Display.update();
			Display.sync(cg.getDesiredFPS());
		}
		
		Display.destroy();
		if (!Engine.WILL_CLEAN_UP) {
			System.exit(0);
		} else {
			System.out.println("[Coyote] Cleaning up OpenGL...");
		}
	}
	
	private static void initGL() {
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, width, height, 0, -1, 1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}
	
	private static int getDelta() {
		long time = getTime();
		int delta = (int) (time - lastFrame);
		lastFrame = time;
		return delta;
	}
	
	private static long getTime() {
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
}