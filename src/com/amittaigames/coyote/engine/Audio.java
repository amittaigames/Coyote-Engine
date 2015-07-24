package com.amittaigames.coyote.engine;

import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Audio {

	public static void play(String file) {
		try {
			InputStream in = Audio.class.getResourceAsStream(file);
			AudioStream audio = new AudioStream(in);
			AudioPlayer.player.start(audio);
		} catch (Exception e) {
			CrashHandler.init(e);
		}
	}
	
}