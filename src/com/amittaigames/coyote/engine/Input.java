package com.amittaigames.coyote.engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;

import com.amittaigames.coyote.render.SoftwareWindow;

public class Input implements KeyListener {

	private static CoreGame cg;
	private static boolean[] keys = new boolean[256];
	
	public static void init(CoreGame cg) {
		Input.cg = cg;
		if (!cg.isGLRender()) {
			SoftwareWindow.getWindow().addKeyListener(new Input());
			SoftwareWindow.getCanvas().addKeyListener(new Input());
		} else {
			try {
				Keyboard.create();
			} catch (LWJGLException e) {
				e.printStackTrace();
			}
		}
		Arrays.fill(keys, false);
	}

	public static boolean isKeyPressed(int key) {
		boolean pressed = false;
		if (!cg.isGLRender()) {
			pressed = keys[key];
		} else {
			pressed = Keyboard.isKeyDown(Keys.translateFromAWT(key));
		}
		return pressed;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}