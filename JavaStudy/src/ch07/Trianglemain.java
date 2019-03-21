package ch07;

public class Trianglemain {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setBottom(20.0f);
		t.setHeight(10.5f);
		
		float area = t.getArea();
		System.out.println(area);
	}
}
