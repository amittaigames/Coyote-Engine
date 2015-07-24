package com.amittaigames.coyote.render;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import org.lwjgl.Sys;

import com.amittaigames.coyote.engine.CrashHandler;

public class SoftwareWindow extends Window {

	private static Canvas canvas;
	private static JFrame frame;
	private static BufferedImage img;
	private static Graphics drawGraphics;
	private static Graphics imgGraphics;
	private static BufferStrategy bs;
	
	private static long lastFrame;
	
	public static void init() {
		Dimension size = new Dimension(width, height);
		canvas = new Canvas();
		canvas.setPreferredSize(size);
		canvas.setMaximumSize(size);
		canvas.setMinimumSize(size);
		
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		drawGraphics = img.getGraphics();
		
		frame = new JFrame();
		frame.setTitle(title);
		frame.add(canvas);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		canvas.createBufferStrategy(1);
		bs = canvas.getBufferStrategy();
		imgGraphics = bs.getDrawGraphics();
		
		cg.init();
		
		frame.setVisible(true);
		
		start();
	}
	
	private static void swapBuffers() {
		imgGraphics.drawImage(img, 0, 0, width, height, null);
		bs.show();
	}
	
	@SuppressWarnings("unused")
	public static void start() {
		long prev = System.nanoTime();
		int fpsCap = cg.getDesiredFPS();
		long optimal = 1000000000 / fpsCap;
		int fps = 0;
		int lastFps = 0;
		
		while (true) {
			long now = System.nanoTime();
			long upd = now - prev;
			prev = now;
			lastFps += upd;
			fps++;
			
			int delta = getDelta();
			
			if (lastFps >= 1000000000) {
				//constFPS = fps;
				lastFps = 0;
				fps = 0;
				//System.out.println("FPS: " + constFPS);
			}
			
			if (delta > 0) {
				cg.update(delta);
				cg.render(new Render(false));
				swapBuffers();
			}
			
			try {
				Thread.sleep(Math.abs((prev - System.nanoTime() + optimal) / 1000000));
			} catch (Exception e) {
				CrashHandler.init(e);
			}
		}
	}
	
	private static int getDelta() {
		long time = getTime();
		int delta = (int) (time - lastFrame);
		lastFrame = time;
		return delta;
	}
	
	private static long getTime() {
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
	public static Graphics getGraphics() {
		return drawGraphics;
	}
	
	public static JFrame getWindow() {
		return frame;
	}
	
	public static Canvas getCanvas() {
		return canvas;
	}
	
}