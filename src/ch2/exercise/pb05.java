package ch2.exercise;

import java.util.HashMap;

public class pb05 {
	public static void main(String[] args) {

		HashMap rslPointer = null;
		Point p = new Point(10, -10);

		System.out.println("1. ÃÊ±â ÁÂÇ¥: (" + p.getX() + "," + p.getY() + ")");

		p.translate(5, 5);
		System.out.println("2. translate() ÀÌÈÄ ÁÂÇ¥: (" + p.getX() + "," + p.getY() + ")");

		rslPointer = p.scale(10);
		System.out.println("3. scale() ÀÌÈÄ ÁÂÇ¥: (" + rslPointer.get("x") + "," + rslPointer.get("y") + ")");
	}

	private static class Point {
		private int x;
		private int y;

		Point() {
			this.x = 0;
			this.y = 0;
		}

		Point(int paramX, int paramY) {
			this.x = paramX;
			this.y = paramY;
		}

		int getX() {
			return this.x;
		}

		int getY() {
			return this.y;
		}

		void translate(int paramX, int paramY) {
			this.x = x + paramX; // System.out.println("x: " + x);
			this.y = y + paramY; // System.out.println("x: " + y);
		}

		HashMap scale(double rate) {
			HashMap scaleList = new HashMap<>();

			int scaleX = getX();
			int scaleY = getY();

			double resultX = scaleX + (scaleX * (rate / 100.0));
			double resultY = scaleY + (scaleY * (rate / 100.0));

			scaleList.put("x", resultX);
			scaleList.put("y", resultY);

			return scaleList;
		}
	}
}
