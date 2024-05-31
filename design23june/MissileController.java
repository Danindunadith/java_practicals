package design23june;

public class MissileController {
	
	public static MissileController controller;
	
	private MissileController() {
		
	} 

	
	public static MissileController getObject() {
		if(controller == null)
		{
			controller = new MissileController();
			System.out.println("New missile created");
		}
		
		else {
			System.out.println("Returning existing one");
		}
		
		return controller;
	}
	
	
	
	public void performLaunching(String start)
	{
		
	}
	
	public void performBlasting(String end)
	{
		
	}
}
