package ch12_generics_1024;

public class Point<T, V> {
	// Integer T
	// Double V
	// 제너릭에 넣는것이 올수있기때문에 
	
	//has-a 관계
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public  T getX() { //리턴 의 타입 : Integer 반환하구나.
			return x;
	}

	public V getY() {
		return y;
    }
}
