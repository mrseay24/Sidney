import java.awt.Color;
import java.awt.Graphics;

public class Art {
	public static void main(String[] args) {
		DrawingPanel picture = new DrawingPanel(600, 700);
		Graphics g = picture.getGraphics();

		g.setColor(Color.BLUE);
		g.fillRect(30, 400, 40, 200);
		g.setColor(Color.BLACK);
		g.drawRect(30, 400, 40, 200);
		g.setColor(Color.PINK);
		g.fillRect(71, 400, 150, 200);
		g.setColor(Color.BLACK);
		g.drawRect(71, 400, 150, 200);
		g.setColor(Color.RED);
		g.fillRect(42, 562, 20, 38);
		g.setColor(Color.BLACK);
		g.drawRect(42, 562, 20, 38);

		g.setColor(Color.YELLOW);
		g.fillOval(425, 63, 100, 100);
		g.setColor(Color.BLACK);
		g.drawOval(425, 63, 100, 100);
		g.drawLine(476, 26, 476, 62);
		g.drawLine(476, 198, 476, 164);
		g.drawLine(424, 115, 376, 115);
		g.drawLine(526, 115, 574, 115);
		g.drawLine(439, 77, 409, 41);
		g.drawLine(516, 82, 549, 45);
		g.drawLine(514, 146, 548, 171);
		g.drawLine(438, 147, 415, 176);
		g.drawLine(454, 67, 447, 50);
		g.drawLine(501, 69, 508, 47);
		g.drawLine(522, 96, 544, 83);
		g.drawLine(522, 132, 544, 137);
		g.drawLine(497, 158, 507, 176);
		g.drawLine(453, 159, 450, 172);
		g.drawLine(429, 132, 404, 137);
		g.drawLine(428, 94, 402, 87);

		g.setColor(Color.GRAY);
		g.fillRect(437, 462, 30, 150);
		g.setColor(Color.BLACK);
		g.drawRect(437, 462, 30, 150);

		int[] xPoints2 = { 386, 454, 513 };
		int[] yPoints2 = { 461, 406, 461 };
		g.setColor(Color.GREEN);
		g.fillPolygon(xPoints2, yPoints2, 3);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints2, yPoints2, xPoints2.length);

		g.setColor(Color.ORANGE);
		g.fillRect(47, 304, 176, 95);
		g.setColor(Color.BLACK);
		g.drawRect(47, 304, 176, 95);

		int[] xPoints = { 30, 71, 46 };
		int[] yPoints = { 400, 400, 302 };
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, 3);

		int[] xPoints4 = { 388, 452, 513 };
		int[] yPoints4 = { 405, 348, 405 };
		g.setColor(Color.GREEN);
		g.fillPolygon(xPoints4, yPoints4, 3);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints4, yPoints4, xPoints4.length);

		int[] xPoints5 = { 389, 450, 508 };
		int[] yPoints5 = { 347, 296, 347 };
		g.setColor(Color.GREEN);
		g.fillPolygon(xPoints5, yPoints5, 3);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints5, yPoints5, xPoints5.length);

		g.setColor(Color.BLACK);
		g.drawString("House", 98, 622);

		g.drawString("Sun", 314, 106);

		g.drawString("Tree", 492, 550);

		g.drawString("By Sidney Seay", 178, 682);

		picture.save("Assignment5.jpg");
	}

}
