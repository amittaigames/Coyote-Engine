package test;

import com.amittaigames.coyote.engine.CoreGame;
import com.amittaigames.coyote.engine.Engine;
import com.amittaigames.coyote.render.Render;
import com.amittaigames.coyote.render.Window;

public class Main extends CoreGame {

	int x = 100;
	
	public Main(boolean gl, int fps) {
		super(gl, fps);
	}
	
	public static void main(String[] args) {
		Main game = new Main(Engine.USE_OPENGL_RENDERING, 60);
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
