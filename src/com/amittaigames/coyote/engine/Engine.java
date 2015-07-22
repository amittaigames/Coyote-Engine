package com.amittaigames.coyote.engine;

public class Engine {

	public static final boolean USE_OPENGL_RENDERING = true;
	public static final boolean USE_SOFTWARE_RENDERING = false;
	
	public static boolean USING_OPENGL = false;
	public static boolean USING_VSYNC = false;
	public static boolean START_GAME = false;
	
	public static void idle() {
		try {
			Thread.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}