package advance.dev;

class Rectangle extends Shape implements IShape {
	double width, height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double chuVi() {
		return 2 * (width + height);
	}

	double dienTich() {
		return width * height;
	}

	public void input(Shape[] shapes) {
		// input method implementation for Rectangle
	}

	public void print(Shape[] shapes) {
		// print method implementation for Rectangle
	}
}