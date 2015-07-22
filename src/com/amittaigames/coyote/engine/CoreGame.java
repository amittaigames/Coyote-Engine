package com.amittaigames.coyote.engine;

import com.amittaigames.coyote.render.Render;

public abstract class CoreGame {

	private boolean GL_RENDER = false;
	private int FPS = 60;
	
	public CoreGame(int fps) {
		Natives.load();
		FPS = fps;
		Launcher.start(this);
	}
	
	public void setGLRender() {
		GL_RENDER = Engine.USING_OPENGL;
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