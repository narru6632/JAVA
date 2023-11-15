package ex08class;

class Triangle{
	double line;
	double hei;

	public void init(double line, double hei) {
		this.line = line;
		this.hei = hei;
	}

	void setBottom(double line) {
		this.line = line;
}
	void setHeight(double hei) {
		this.hei = hei;
	}
	double getArea() {
		double area = this.hei*this.line/2;
		return area;
	}

}

public class QuTriangle {
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}

	
}
