package com.amittaigames.coyote.engine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Launcher {

	private static String name;
	private static String version;
	private static String author;
	private static String image;
	
	public static void start(final CoreGame cg) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(Launcher.class.getResourceAsStream("/cgame/config.txt")));
			name = br.readLine().split("=")[1];
			version = br.readLine().split("=")[1];
			author = br.readLine().split("=")[1];
			image = br.readLine().split("=")[1];
			br.close();
		} catch (Exception e) {
			CrashHandler.init(e);
		}
		
		JPanel main = new JPanel();
		main.setLayout(null);
		
		JLabel banner = new JLabel(new ImageIcon(Launcher.class.getResource("/cgame/" + image)));
		JLabel renderlbl = new JLabel("Rendering");
		final JComboBox<String> render = new JComboBox<String>(new String[] {"OpenGL", "Software"});
		final JCheckBox vsync = new JCheckBox("Use VSync");
		final JCheckBox clean = new JCheckBox("Clean up resources");
		final JCheckBox alias = new JCheckBox("Use Anti-aliasing");
		vsync.setSelected(true);
		clean.setSelected(true);
		alias.setSelected(true);
		JButton start = new JButton("Play");
		JButton quit = new JButton("Quit");
		
		renderlbl.setBounds(16, 268, 75, 16);
		main.add(renderlbl);
		render.setBounds(6, 288, 150, 27);
		main.add(render);
		vsync.setBounds(6, 327, 128, 23);
		main.add(vsync);
		clean.setBounds(6, 362, 175, 23);
		main.add(clean);
		alias.setBounds(6, 397, 150, 23);
		main.add(alias);
		start.setBounds(388, 443, 117, 29);
		main.add(start);
		quit.setBounds(517, 443, 117, 29);
		main.add(quit);
		banner.setBounds(6, 6, 628, 250);
		main.add(banner);
		
		final JFrame frame = new JFrame(name + " by " + author + " - v" + version + " - Coyote Game Engine " + Engine.COYOTE_VERSION);
		frame.setSize(640, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(main);
		frame.setResizable(false);
		frame.setVisible(true);
		
		render.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!render.getSelectedItem().equals("OpenGL")) {
					vsync.setEnabled(false);
					clean.setEnabled(false);
					alias.setEnabled(false);
				} else {
					vsync.setEnabled(true);
					clean.setEnabled(true);
					alias.setSelected(true);
				}
			}
		});
		
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				if (render.getSelectedItem().equals("OpenGL")) {
					Engine.USING_OPENGL = true;
					if (vsync.isSelected()) {
						Engine.USING_VSYNC = true;
					}
					if (clean.isSelected()) {
						Engine.WILL_CLEAN_UP = true;
					}
					if (alias.isSelected()) {
						Engine.USING_ANTI_ALIASING = true;
					}
				} else {
					Engine.USING_OPENGL = false;
				}
				cg.setGLRender();
				Engine.START_GAME = true;
			}
		});
	}
	
}