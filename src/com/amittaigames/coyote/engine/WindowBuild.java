package com.amittaigames.coyote.engine;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class WindowBuild extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuild frame = new WindowBuild();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public WindowBuild() {
		setSize(new Dimension(640, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel banner = new JLabel(new ImageIcon(this.getClass().getResource("/cgame/banner.png")));
		banner.setBounds(6, 6, 628, 250);
		contentPane.add(banner);
		
		JComboBox render = new JComboBox(new String[] {"OpenGL", "Software"});
		render.setBounds(6, 288, 150, 27);
		contentPane.add(render);
		
		JLabel lblRendering = new JLabel("Rendering");
		lblRendering.setBounds(16, 268, 75, 16);
		contentPane.add(lblRendering);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(517, 443, 117, 29);
		contentPane.add(btnQuit);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBounds(388, 443, 117, 29);
		contentPane.add(btnPlay);
		
		JCheckBox chckbxUseVsync = new JCheckBox("Use VSync");
		chckbxUseVsync.setBounds(6, 327, 128, 23);
		contentPane.add(chckbxUseVsync);
		
		JCheckBox chckbxCleanUp = new JCheckBox("Clean up");
		chckbxCleanUp.setBounds(6, 362, 128, 23);
		contentPane.add(chckbxCleanUp);
		
		JCheckBox chckbxAntialiasing = new JCheckBox("Anti-aliasing");
		chckbxAntialiasing.setBounds(6, 397, 128, 23);
		contentPane.add(chckbxAntialiasing);
	}
}
