package com.amittaigames.coyote.engine;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String getTime() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
		return new String(ft.format(dNow));
	}

	public static String cat(String[] arr, int start, String cat) {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i != arr.length - 1) {
				sb.append(cat);
			}
		}
		return sb.toString();
	}

}