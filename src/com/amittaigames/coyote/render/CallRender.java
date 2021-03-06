package com.amittaigames.coyote.render;

public abstract class CallRender {
	
	public abstract void clear(int r, int g, int b);
	public abstract void setColor(int r, int g, int b);
	public abstract void fillRect(int x, int y, int w, int h);
	public abstract void drawImage(int x, int y, String img);
	public abstract void drawText(String text, int x, int y);
	public abstract void setFont(String font, int type, int size);
	
}