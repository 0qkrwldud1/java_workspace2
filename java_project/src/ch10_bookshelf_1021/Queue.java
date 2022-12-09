package ch10_bookshelf_1021;

public interface Queue { //인터페이스? 메서드의 명세표 (목차)

	void enQueue(String title);
	String deQueue();
	int getSize();
}
