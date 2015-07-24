package com.amittaigames.coyote.render;

import java.awt.Font;
import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import com.amittaigames.coyote.engine.CrashHandler;
import com.amittaigames.coyote.engine.Engine;

public class OpenGLRender extends CallRender {

	private static TrueTypeFont font = new TrueTypeFont(new Font("Arial", Font.PLAIN, 16), Engine.USING_ANTI_ALIASING);
	private Color color = Color.black;
	
	@Override
	public void clear(int r, int g, int b) {
		GL11.glClearColor((float)r/255f, (float)g/255f, (float)b/255f, 1);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}
	
	@Override
	public void drawText(String text, int x, int y) {
		Color.white.bind();
		font.drawString(x, y, text, color);
	}
	
	@Override
	public void setFont(String font, int type, int size) {
		OpenGLRender.font = new TrueTypeFont(new Font(font, type, size), Engine.USING_ANTI_ALIASING);
	}

	@Override
	public void setColor(int r, int g, int b) {
		color = new Color(r, g, b);
		GL11.glColor3f((float)r/255f, (float)g/255f, (float)b/255f);
	}

	@Override
	public void drawImage(int x, int y, String img) {
		GL11.glPushMatrix();
		
		Texture texture = null;
		try {
			texture = TextureLoader.getTexture("PNG", this.getClass().getResourceAsStream(img));
		} catch (IOException e) {
			CrashHandler.init(e);
		}
		
		texture.bind();
		
		GL11.glColor3f(255, 255, 255);
		
		GL11.glTexParameterf(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
		GL11.glTexParameterf(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
		
		GL11.glBegin(GL11.GL_QUADS);
		{
			GL11.glTexCoord2f(0, 0);
			GL11.glVertex2f(x, y);
			GL11.glTexCoord2f(1, 0);
			GL11.glVertex2f(x + texture.getTextureWidth(), y);
			GL11.glTexCoord2f(1, 1);
			GL11.glVertex2f(x + texture.getTextureWidth(), y + texture.getTextureHeight());
			GL11.glTexCoord2f(0, 1);
			GL11.glVertex2f(x, y + texture.getTextureHeight());
		}
		GL11.glEnd();
		
		GL11.glPopMatrix();
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