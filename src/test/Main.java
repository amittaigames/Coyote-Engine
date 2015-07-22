package test;

import com.amittaigames.coyote.engine.CoreGame;
import com.amittaigames.coyote.engine.Engine;
import com.amittaigames.coyote.engine.Input;
import com.amittaigames.coyote.engine.Keys;
import com.amittaigames.coyote.render.Render;
import com.amittaigames.coyote.render.Window;

public class Main extends CoreGame {

	private static Main game;
	int x = 100;
	int y = 100;
	
	public Main(int fps) {
		super(fps);
	}
	
	public static void main(String[] args) {
		game = new Main(60);
		while (!Engine.START_GAME) {
			Engine.idle();
		}
		Window.init("Coyote Game Engine v0.5", 800, 600, game);
	}

	@Override
	public void init() {
		Input.init(game);
	}

	@Override
	public void render(Render r) {
		r.clear(0, 0, 0);
		
		r.setColor(0, 122, 163);
		r.drawImage(x, y, "/assets/Player.png");
	}

	@Override
	public void update(int delta) {
		if (Input.isKeyPressed(Keys.D))
			x += delta / 5;
		if (Input.isKeyPressed(Keys.A))
			x -= delta / 5;
		if (Input.isKeyPressed(Keys.W))
			y -= delta / 5;
		if (Input.isKeyPressed(Keys.S))
			y += delta / 5;
	}

}
