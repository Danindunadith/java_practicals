package que012018;

public class Book extends Item {

	private String publisher;
	private String category;
	private String pages;
	public Book(int itemNo, String description, double unitPrice, String publisher, String category, String pages) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}
	@Override
	public void Display() {


		System.out.println(publisher);
		System.out.println(category);
		System.out.println(pages);
		
		super.Display();
	}
	
	
}
