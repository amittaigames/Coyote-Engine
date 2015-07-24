package com.amittaigames.coyote.render;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.amittaigames.coyote.engine.CrashHandler;

public class SoftwareRender extends CallRender {
	
	private Graphics graphics;
	private Font font = new Font("Arial", Font.PLAIN, 16);
	
	public SoftwareRender(Graphics g) {
		this.graphics = g;
		graphics.setFont(font);
	}
	
	@Override
	public void clear(int r, int g, int b) {
		graphics.setColor(new Color(r, g, b));
		graphics.fillRect(0, 0, Window.width, Window.height);
	}
	
	@Override
	public void drawText(String text, int x, int y) {
		graphics.drawString(text, x, y);
	}
	
	@Override
	public void drawImage(int x, int y, String img) {
		try {
			BufferedImage buf = ImageIO.read(this.getClass().getResourceAsStream(img));
			graphics.drawImage(buf, x, y, null);
		} catch (IOException e) {
			CrashHandler.init(e);
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