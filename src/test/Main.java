package test;

import com.amittaigames.coyote.engine.CoreGame;
import com.amittaigames.coyote.render.Render;
import com.amittaigames.coyote.render.Window;

public class Main extends CoreGame {

	private static Main game;
	int x = 100;
	
	public Main(int fps) {
		super(fps);
	}
	
	public static void main(String[] args) {
		game = new Main(60);
	}
	
	public static void start() {
		Window.init("Coyote Game Engine v0.1", 800, 600, game);
	}

	@Override
	public void init() {
		
	}

	@Override
	public void render(Render r) {
		r.clear(0, 0, 0);
		
		r.setColor(0, 122, 163);
		r.fillRect(x, 100, 100, 100);
	}

	@Override
	public void update(int delta) {
		x += delta / 5;
	}

}
