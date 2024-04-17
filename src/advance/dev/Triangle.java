package advance.dev;

class Triangle extends Shape implements IShape {
	double a, b, c;

	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double chuVi() {
		return a + b + c;
	}

	double dienTich() {
		double p = chuVi() / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public void input(Shape[] shapes) {
		// input method implementation for Triangle
	}

	public void print(Shape[] shapes) {
		// print method implementation for Triangle
	}
}
