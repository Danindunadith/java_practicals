package que012018;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {

		ArrayList<Item> arrlist = new ArrayList<>();
		
		
		Book b1 = new Book(130, "good", 120.0, "thomas", "English", "120");
		Book b2 = new Book(150,"bad", 300.0, "Marko", "Hindi", "60");
		
		arrlist.add(b1);
		arrlist.add(b2);

		

	}

}
