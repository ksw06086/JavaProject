package test.center;

import java.awt.Dimension;
import java.awt.Toolkit;

public class LocationCenter {
	private int x;
	private int y;
	
	public LocationCenter(int w, int h) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		int sw = d.width;
		int sh = d.height;
		
		x = (sw-w)/2;
		y = (sh-h)/2;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
