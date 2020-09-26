import java.awt.*;


public class DrawableRect extends ColoredRect {
	public Color outColor;
	
	public void draw(Graphics g, int x, int y, int h, int w) {
		super.draw(g, x ,y ,h, w);
		g.setColor(outColor);
		g.drawRect(x, y, h, w);
	}
}
