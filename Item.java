package que012018;

public abstract class Item {

	private int itemNo;
	private String description;
	private double unitPrice;
	public Item(int itemNo, String description, double unitPrice) {
		super();
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void Display()
	{
		System.out.println(itemNo+"ItemNo");
		System.out.println(description+"Description");
		System.out.println(unitPrice+"UnitPrice");
	}
	
}
