package june23pattern;

public class HeatMissileSystem implements MissileSystem {

	public static HeatMissileSystem heat = null;
	
	private HeatMissileSystem() {
		
	}
	
	public static HeatMissileSystem getObject() {
		if(heat==null) {
			heat = new HeatMissileSystem();
			System.out.println("New object created");
		}
		
		else {
			System.out.println("Returning existing one");
		}
		
		return heat;
	}

	@Override
	public void launch(String source) {
		
		
	}

	@Override
	public void blast(String destination) {
		
		
	}
	
	
}
