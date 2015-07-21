package com.amittaigames.coyote.render;

import java.awt.Color;
import java.awt.Graphics;

public class SoftwareRender extends CallRender {
	
	private Graphics graphics;
	
	public SoftwareRender(Graphics g) {
		this.graphics = g;
	}
	
	@Override
	public void clear(int r, int g, int b) {
		graphics.setColor(new Color(r, g, b));
		graphics.fillRect(0, 0, Window.width, Window.height);
	}

	@Override
	public void setColor(int r, int g, int b) {
		graphics.setColor(new Color(r, g, b));
	}

	@Override
	public void fillRect(int x, int y, int w, int h) {
		graphics.fillRect(x, y, w, h);
	}
	
}