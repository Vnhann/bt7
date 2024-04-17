package advance.dev;

class Circle extends Shape implements IShape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double chuVi() {
		return 2 * Math.PI * radius;
	}

	double dienTich() {
		return Math.PI * radius * radius;
	}

	public void input(Shape[] shapes) {
		// input method implementation for Circle
	}

	public void print(Shape[] shapes) {
		// print method implementation for Circle
	}
}
