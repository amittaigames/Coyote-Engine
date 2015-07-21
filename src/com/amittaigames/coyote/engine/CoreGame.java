package com.amittaigames.coyote.engine;

import com.amittaigames.coyote.render.Render;

public abstract class CoreGame {

	private boolean GL_RENDER = false;
	private int FPS = 60;
	
	public CoreGame(boolean gl, int fps) {
		GL_RENDER = gl;
		FPS = fps;
	}
	
	public boolean isGLRender() {
		return GL_RENDER;
	}
	
	public int getDesiredFPS() {
		return FPS;
	}
	
	public abstract void init();
	public abstract void render(Render r);
	public abstract void update(int delta);
	
}