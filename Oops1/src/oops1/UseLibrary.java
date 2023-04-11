package oops1;

public class UseLibrary {
	public static void main(String[] args) {
		Book bk=new Book();
		bk.title="Fisher Man";
		bk.author="vicky";
		bk.price=10000;
		bk.publicationYear=2030;
		
		Library lb=new Library();
		lb.type="instite";
		lb.location="perugudi";
		lb.book1=bk;
		System.out.println("Title ="+lb.book1.title+",\nPrice="+lb.book1.price);
	}

}
