package com.amittaigames.coyote.render;

public class Render {

	private CallRender render;
	
	public Render(boolean gl) {
		if (gl)
			render = new OpenGLRender();
		else
			render = new SoftwareRender(SoftwareWindow.getGraphics());
	}
	
	public void clear(int r, int g, int b) {
		render.clear(r, g, b);
	}
	
	public void setColor(int r, int g, int b) {
		render.setColor(r, g, b);
	}
	
	public void fillRect(int x, int y, int w, int h) {
		render.fillRect(x, y, w, h);
	}
	
	public void drawImage(int x, int y, String img) {
		render.drawImage(x, y, img);
	}
	
}