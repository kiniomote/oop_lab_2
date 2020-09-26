import java.awt.*;


public class ColoredRect {
	public Color inColor;
	
	public void draw(Graphics g, int x, int y, int h, int w) {
		g.setColor(inColor);
		g.fillRect(x, y, h, w);
	}
}
