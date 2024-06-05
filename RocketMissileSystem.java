package june23pattern;

public class RocketMissileSystem implements MissileSystem {
	
	public static RocketMissileSystem rocket =null;
	
	private RocketMissileSystem() {
		
	}

	public static RocketMissileSystem getObject() {
		if(rocket==null) {
			rocket = new RocketMissileSystem();
			System.out.println("New object created");
		}
		
		else {
			System.out.println("Returning existing object");
		}
		
		return rocket;
	}

	@Override
	public void launch(String source) {
		
		
	}

	@Override
	public void blast(String destination) {
		
		
	}
	
	
	
}
