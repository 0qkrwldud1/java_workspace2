package ch09_abstractex_1020;

public class ComputerTest {

	public static void main(String[] args) {
		//추상 클래스는 인스턴스화 할수 없다. 
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		//c2는 바라보는 관점이 computer
		c2.display();
		c2.turnOff();
		c2.turnOn();
		c2.typing();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		c4.display(); 	//자식 우선.
		c4.turnOff(); 	//부모 ,자식에 없음.
		c4.turnOn(); 	//부모
		c4.typing(); 	//자식
	}
}
