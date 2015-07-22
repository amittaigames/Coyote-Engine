package com.amittaigames.coyote.engine;

import java.awt.event.KeyEvent;

import org.lwjgl.input.Keyboard;

public class Keys {

	public static int NUM0 = 48;
	public static int NUM1 = 49;
	public static int NUM2 = 50;
	public static int NUM3 = 51;
	public static int NUM4 = 52;
	public static int NUM5 = 53;
	public static int NUM6 = 54;
	public static int NUM7 = 55;
	public static int NUM8 = 56;
	public static int NUM9 = 57;

	public static int A = 65;
	public static int B = 66;
	public static int C = 67;
	public static int D = 68;
	public static int E = 69;
	public static int F = 70;
	public static int G = 71;
	public static int H = 72;
	public static int I = 73;
	public static int J = 74;
	public static int K = 75;
	public static int L = 76;
	public static int M = 77;
	public static int N = 78;
	public static int O = 79;
	public static int P = 80;
	public static int Q = 81;
	public static int R = 82;
	public static int S = 83;
	public static int T = 84;
	public static int U = 85;
	public static int V = 86;
	public static int W = 87;
	public static int X = 88;
	public static int Y = 89;
	public static int Z = 90;

	public static int LEFT = 37;
	public static int UP = 38;
	public static int RIGHT = 39;
	public static int DOWN = 40;

	public static int ESCAPE = 27;
	public static int BACKSPACE = '\b';
	public static int TAB = 9;
	public static int ENTER = '\n';
	public static int SHIFT = 16;
	public static int CONTROL = 17;
	public static int ALT = 18;
	public static int SLASH = 191;
	public static int BACK_SLASH = 220;

	public static int F1 = 112;
	public static int F2 = 113;
	public static int F3 = 114;
	public static int F4 = 115;
	public static int F5 = 116;
	public static int F6 = 117;
	public static int F7 = 118;
	public static int F8 = 119;
	public static int F9 = 120;
	public static int F10 = 121;
	public static int F11 = 122;
	public static int F12 = 123;

	public static int NUMPAD0 = 96;
	public static int NUMPAD1 = 97;
	public static int NUMPAD2 = 98;
	public static int NUMPAD3 = 99;
	public static int NUMPAD4 = 100;
	public static int NUMPAD5 = 101;
	public static int NUMPAD6 = 102;
	public static int NUMPAD7 = 103;
	public static int NUMPAD8 = 104;
	public static int NUMPAD9 = 105;
	
	@SuppressWarnings("deprecation")
	public static int translateFromAWT( int aCode ) {
	    switch ( aCode ) {
	      case KeyEvent.VK_ESCAPE: return Keyboard.KEY_ESCAPE;
	      case KeyEvent.VK_1: return Keyboard.KEY_1;
	      case KeyEvent.VK_2: return Keyboard.KEY_2;
	      case KeyEvent.VK_3: return Keyboard.KEY_3;
	      case KeyEvent.VK_4: return Keyboard.KEY_4;
	      case KeyEvent.VK_5: return Keyboard.KEY_5;
	      case KeyEvent.VK_6: return Keyboard.KEY_6;
	      case KeyEvent.VK_7: return Keyboard.KEY_7;
	      case KeyEvent.VK_8: return Keyboard.KEY_8;
	      case KeyEvent.VK_9: return Keyboard.KEY_9;
	      case KeyEvent.VK_0: return Keyboard.KEY_0;
	      case KeyEvent.VK_MINUS: return Keyboard.KEY_MINUS;
	      case KeyEvent.VK_EQUALS: return Keyboard.KEY_EQUALS;
	      case KeyEvent.VK_BACK_SPACE: return Keyboard.KEY_BACK;
	      case KeyEvent.VK_TAB: return Keyboard.KEY_TAB;
	      case KeyEvent.VK_Q: return Keyboard.KEY_Q;
	      case KeyEvent.VK_W: return Keyboard.KEY_W;
	      case KeyEvent.VK_E: return Keyboard.KEY_E;
	      case KeyEvent.VK_R: return Keyboard.KEY_R;
	      case KeyEvent.VK_T: return Keyboard.KEY_T;
	      case KeyEvent.VK_Y: return Keyboard.KEY_Y;
	      case KeyEvent.VK_U: return Keyboard.KEY_U;
	      case KeyEvent.VK_I: return Keyboard.KEY_I;
	      case KeyEvent.VK_O: return Keyboard.KEY_O;
	      case KeyEvent.VK_P: return Keyboard.KEY_P;
	      case KeyEvent.VK_OPEN_BRACKET: return Keyboard.KEY_LBRACKET;
	      case KeyEvent.VK_CLOSE_BRACKET: return Keyboard.KEY_RBRACKET;
	      case KeyEvent.VK_ENTER: return Keyboard.KEY_RETURN;
	      case KeyEvent.VK_CONTROL: return Keyboard.KEY_LCONTROL;
	      case KeyEvent.VK_A: return Keyboard.KEY_A;
	      case KeyEvent.VK_S: return Keyboard.KEY_S;
	      case KeyEvent.VK_D: return Keyboard.KEY_D;
	      case KeyEvent.VK_F: return Keyboard.KEY_F;
	      case KeyEvent.VK_G: return Keyboard.KEY_G;
	      case KeyEvent.VK_H: return Keyboard.KEY_H;
	      case KeyEvent.VK_J: return Keyboard.KEY_J;
	      case KeyEvent.VK_K: return Keyboard.KEY_K;
	      case KeyEvent.VK_L: return Keyboard.KEY_L;
	      case KeyEvent.VK_SEMICOLON: return Keyboard.KEY_SEMICOLON;
	      case KeyEvent.VK_QUOTE: return Keyboard.KEY_APOSTROPHE;
	      case KeyEvent.VK_DEAD_GRAVE: return Keyboard.KEY_GRAVE;
	      case KeyEvent.VK_SHIFT: return Keyboard.KEY_LSHIFT;
	      case KeyEvent.VK_BACK_SLASH: return Keyboard.KEY_BACKSLASH;
	      case KeyEvent.VK_Z: return Keyboard.KEY_Z;
	      case KeyEvent.VK_X: return Keyboard.KEY_X;
	      case KeyEvent.VK_C: return Keyboard.KEY_C;
	      case KeyEvent.VK_V: return Keyboard.KEY_V;
	      case KeyEvent.VK_B: return Keyboard.KEY_B;
	      case KeyEvent.VK_N: return Keyboard.KEY_N;
	      case KeyEvent.VK_M: return Keyboard.KEY_M;
	      case KeyEvent.VK_COMMA: return Keyboard.KEY_COMMA;
	      case KeyEvent.VK_PERIOD: return Keyboard.KEY_PERIOD;
	      case KeyEvent.VK_SLASH: return Keyboard.KEY_SLASH;
	      case KeyEvent.VK_MULTIPLY: return Keyboard.KEY_MULTIPLY;
	      case KeyEvent.VK_ALT: return Keyboard.KEY_LMENU;
	      case KeyEvent.VK_SPACE: return Keyboard.KEY_SPACE;
	      case KeyEvent.VK_CAPS_LOCK: return Keyboard.KEY_CAPITAL;
	      case KeyEvent.VK_F1: return Keyboard.KEY_F1;
	      case KeyEvent.VK_F2: return Keyboard.KEY_F2;
	      case KeyEvent.VK_F3: return Keyboard.KEY_F3;
	      case KeyEvent.VK_F4: return Keyboard.KEY_F4;
	      case KeyEvent.VK_F5: return Keyboard.KEY_F5;
	      case KeyEvent.VK_F6: return Keyboard.KEY_F6;
	      case KeyEvent.VK_F7: return Keyboard.KEY_F7;
	      case KeyEvent.VK_F8: return Keyboard.KEY_F8;
	      case KeyEvent.VK_F9: return Keyboard.KEY_F9;
	      case KeyEvent.VK_F10: return Keyboard.KEY_F10;
	      case KeyEvent.VK_NUM_LOCK: return Keyboard.KEY_NUMLOCK;
	      case KeyEvent.VK_SCROLL_LOCK: return Keyboard.KEY_SCROLL;
	      case KeyEvent.VK_NUMPAD7: return Keyboard.KEY_NUMPAD7;
	      case KeyEvent.VK_NUMPAD8: return Keyboard.KEY_NUMPAD8;
	      case KeyEvent.VK_NUMPAD9: return Keyboard.KEY_NUMPAD9;
	      case KeyEvent.VK_SUBTRACT: return Keyboard.KEY_SUBTRACT;
	      case KeyEvent.VK_NUMPAD4: return Keyboard.KEY_NUMPAD4;
	      case KeyEvent.VK_NUMPAD5: return Keyboard.KEY_NUMPAD5;
	      case KeyEvent.VK_NUMPAD6: return Keyboard.KEY_NUMPAD6;
	      case KeyEvent.VK_ADD: return Keyboard.KEY_ADD;
	      case KeyEvent.VK_NUMPAD1: return Keyboard.KEY_NUMPAD1;
	      case KeyEvent.VK_NUMPAD2: return Keyboard.KEY_NUMPAD2;
	      case KeyEvent.VK_NUMPAD3: return Keyboard.KEY_NUMPAD3;
	      case KeyEvent.VK_NUMPAD0: return Keyboard.KEY_NUMPAD0;
	      case KeyEvent.VK_DECIMAL: return Keyboard.KEY_DECIMAL;
	      case KeyEvent.VK_F11: return Keyboard.KEY_F11;
	      case KeyEvent.VK_F12: return Keyboard.KEY_F12;
	      case KeyEvent.VK_F13: return Keyboard.KEY_F13;
	      case KeyEvent.VK_F14: return Keyboard.KEY_F14;
	      case KeyEvent.VK_F15: return Keyboard.KEY_F15;
	      case KeyEvent.VK_KANA: return Keyboard.KEY_KANA;
	      case KeyEvent.VK_CONVERT: return Keyboard.KEY_CONVERT;
	      case KeyEvent.VK_NONCONVERT: return Keyboard.KEY_NOCONVERT;
	      case KeyEvent.VK_CIRCUMFLEX: return Keyboard.KEY_CIRCUMFLEX;
	      case KeyEvent.VK_AT: return Keyboard.KEY_AT;
	      case KeyEvent.VK_COLON: return Keyboard.KEY_COLON;
	      case KeyEvent.VK_UNDERSCORE: return Keyboard.KEY_UNDERLINE;
	      case KeyEvent.VK_KANJI: return Keyboard.KEY_KANJI;
	      case KeyEvent.VK_STOP: return Keyboard.KEY_STOP;
	      case KeyEvent.VK_DIVIDE: return Keyboard.KEY_DIVIDE;
	      case KeyEvent.VK_PAUSE: return Keyboard.KEY_PAUSE;
	      case KeyEvent.VK_HOME: return Keyboard.KEY_HOME;
	      case KeyEvent.VK_UP: return Keyboard.KEY_UP;
	      case KeyEvent.VK_PAGE_UP: return Keyboard.KEY_PRIOR;
	      case KeyEvent.VK_LEFT: return Keyboard.KEY_LEFT;
	      case KeyEvent.VK_RIGHT: return Keyboard.KEY_RIGHT;
	      case KeyEvent.VK_END: return Keyboard.KEY_END;
	      case KeyEvent.VK_DOWN: return Keyboard.KEY_DOWN;
	      case KeyEvent.VK_PAGE_DOWN: return Keyboard.KEY_NEXT;
	      case KeyEvent.VK_INSERT: return Keyboard.KEY_INSERT;
	      case KeyEvent.VK_DELETE: return Keyboard.KEY_DELETE;
	      case KeyEvent.VK_META: return Keyboard.KEY_LWIN;
	    }
	    return Keyboard.KEY_NONE;
	  } 
	
}