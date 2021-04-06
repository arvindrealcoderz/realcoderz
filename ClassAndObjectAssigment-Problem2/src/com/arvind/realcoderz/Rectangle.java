package com.arvind.realcoderz;

public class Rectangle {
	private int length = 1;
	private int width = 1;

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public double Area(Rectangle rec) {
		return rec.getLength() * rec.getWidth();
	}
}
