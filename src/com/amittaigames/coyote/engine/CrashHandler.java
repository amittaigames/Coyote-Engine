package com.amittaigames.coyote.engine;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.lwjgl.opengl.Display;

import com.amittaigames.coyote.render.SoftwareWindow;

public class CrashHandler {

	public static void init(Exception e) {
		if (Engine.USE_OPENGL_RENDERING) {
			Display.destroy();
		} else {
			SoftwareWindow.getWindow().dispose();
		}
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		
		JTextArea text = new JTextArea();
		text.setLineWrap(true);
		compileIssue(e, text);
		text.setEditable(false);
		panel.add(text);
		
		JFrame frame = new JFrame("Oops!");
		frame.setSize(640, 480);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	private static void compileIssue(Exception e, JTextArea text) {
		StringBuilder sb = new StringBuilder();
		sb.append("Coyote Engine just crashed and burned.\n");
		sb.append("Sorry! :(\n\n");
		sb.append("=== Helpful Info ===\n\n");
		for (int i = 0; i < e.getStackTrace().length; i++) {
			sb.append(e.getStackTrace()[i].toString() + "\n");
		}
		sb.append("Type: " + e.getClass().getSimpleName() + "\n");
		sb.append("Message: " + e.getMessage() + "\n");
		sb.append("Cause: " + e.getCause() + "\n\n");
		sb.append("=== For the Devs ===\n\n");
		for (StackTraceElement ste : e.getStackTrace()) {
			sb.append(ste.getFileName().replace(".java", "") + ":" + ste.getLineNumber() + " - " + ste.getMethodName() + "\n");
		}
		text.setText(sb.toString());
	}
	
}