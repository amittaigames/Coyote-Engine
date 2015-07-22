package com.amittaigames.coyote.render;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

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
	public void drawImage(int x, int y, String img) {
		try {
			BufferedImage buf = ImageIO.read(this.getClass().getResourceAsStream(img));
			graphics.drawImage(buf, x, y, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
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