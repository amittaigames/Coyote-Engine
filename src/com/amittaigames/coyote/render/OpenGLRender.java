package com.amittaigames.coyote.render;

import org.lwjgl.opengl.GL11;

public class OpenGLRender extends CallRender {

	@Override
	public void clear(int r, int g, int b) {
		GL11.glClearColor((float)r/255f, (float)g/255f, (float)b/255f, 1);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}

	@Override
	public void setColor(int r, int g, int b) {
		GL11.glColor3f((float)r/255f, (float)g/255f, (float)b/255f);
	}

	@Override
	public void fillRect(int x, int y, int w, int h) {
		GL11.glPushMatrix();
		
		GL11.glBegin(GL11.GL_QUADS);
		{
			GL11.glVertex2f(x, y);
			GL11.glVertex2f(x + w, y);
			GL11.glVertex2f(x + w, y + h);
			GL11.glVertex2f(x, y + h);
		}
		GL11.glEnd();
		
		GL11.glPopMatrix();
	}
	
}