package com.wyz.patterndesign.principles.ocp.improve;

/**
 * 开闭原则：open close
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

/**
 * 用于绘图的类。 （使用方）  抽象出一个画的方法。 这样 它作为使用者在新增图形以后也不需要修改他的代码。
 */
class GraphicEditor {
	/**
	 * 画图形~~~，根据type来绘制不同的图形
	 *
	 * @param shape
	 */
	public void drawShape(Shape shape) {
		shape.draw();
	}
}

/**
 * 基类做成抽象的。 提供方做成抽象的
 */
abstract class Shape {
	int m_type;

	/**
	 * 抽象方法
	 */
	public abstract void draw();
}

class Rectangle extends Shape {
	public Rectangle() {
		this.m_type = 1;
	}

	/**
	 * 抽象方法
	 */
	@Override
	public void draw() {
		System.out.println("画个矩形");
	}
}

class Circle extends Shape {
	public Circle() {
		this.m_type = 2;
	}

	@Override
	public void draw() {
		System.out.println("画个圆形");
	}
}

class Triangle extends Shape {
	public Triangle() {
		this.m_type = 3;
	}

	@Override
	public void draw() {
		System.out.println("画个长方形");
	}
}

/**
 * 其他的图形  我们模拟要增加图形。因为我们把绘制的动作抽离了出去。那么使用者GraphicEditor就不需要改变了。
 */
class OtherGraphic extends Shape {
	public OtherGraphic() {
		this.m_type = 4;
	}

	/**
	 * 抽象方法
	 */
	@Override
	public void draw() {
		System.out.println("绘制其他图形");
	}
}