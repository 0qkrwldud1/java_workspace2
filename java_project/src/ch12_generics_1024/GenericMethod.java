package ch12_generics_1024;

public class GenericMethod {
	

	//<T, V> -> 매개변수의 자료형, double -> 반환값의 자료형
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		//
		double left2 = ((Integer)p1.getX()).doubleValue();
		double right =((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		//integer, double는 wrapper클래스형.
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0); //생략x
		Point<Integer, Double> p2 = new Point<>(10, 10.0); //생략한것.
		//p1, p2 생성. makerectangle메서드에 객체로 넣음.
		//래퍼클래스의 특징 -> 자동형변환, 오토박싱, 상위 하위로 자동으로 형변환
		//다른예제로 객체생성시 원하는 형으로 선언이 가능.
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
	}
}
