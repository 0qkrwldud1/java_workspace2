package ch11_object_1021;

class Book{ //암묵적으로 오브젝트 클래스 상속받고있음. 
			//toString()
			
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		
		return bookTitle + "," + bookNumber;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	
	System.out.println(book1);
	System.out.println(book1.toString());
	}
}

