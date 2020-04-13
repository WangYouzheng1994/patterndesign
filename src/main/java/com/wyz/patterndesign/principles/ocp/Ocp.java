package com.wyz.patterndesign.principles.ocp;

/**
 * 开闭原则：open close
 * 好处是  代码清楚，结构简单
 * 坏处是：如果要加一个别的图形，那么要改的地方也多。 然后违反了基本的ocp原则 扩展开放，修改关闭。
 */
public class Ocp {
	public static void main(String[] args) {
		GraphicEditor editor = new GraphicEditor();
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();

		editor.drawShape(rectangle);
		editor.drawShape(circle);
		editor.drawShape(triangle);
	}
}

class GraphicEditor {
	/**
	 * 画图形~~~，根据type来绘制不同的图形
	 *
	 * @param shape
	 */
	public void drawShape(Shape shape) {
		if (shape.m_type == 1) {
			drawRectangle(shape);
		} else if (shape.m_type == 2) {
			drawCircle(shape);
		} else if (shape.m_type == 3) {
			drawTriangle(shape);
		}
	}

	/**
	 * 画长方形
	 *
	 * @param recTangle
	 */
	public void drawRectangle(Shape recTangle) {
		System.out.println("画个矩形");
	}

	/**
	 * 画圆形
	 *
	 * @param circle
	 */
	public void drawCircle(Shape circle) {
		System.out.println("画个圆形");
	}

	/**
	 * 三角形
	 *
	 * @param triangle
	 */
	public void drawTriangle(Shape triangle) {
		System.out.println("画个三角形");
	}
}

class Shape {
	int m_type;
}

class Rectangle extends Shape {
	public Rectangle() {
		this.m_type = 1;
	}
}

class Circle extends Shape {
	public Circle() {
		this.m_type = 2;
	}
}

class Triangle extends Shape {
	public Triangle() {
		this.m_type = 3;
	}
}