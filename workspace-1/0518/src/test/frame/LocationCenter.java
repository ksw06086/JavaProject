package test.frame;

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
		
		x = (int)(0.5*(sw-w));
		y = (int)(0.5*(sh-h));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
