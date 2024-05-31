package design23june;

public class HeatMissileSystem implements MissileSystem {

	public static HeatMissileSystem heat = null;
	
	public static HeatMissileSystem getObject() {
		
		if(heat == null)
		{
			heat = new HeatMissileSystem();
		}
		
		else {
			
		}
		return heat;
	}
	
	
	public void luanch(String source) {
		// TODO Auto-generated method stub

	}

	public void blast(String destination) {
		// TODO Auto-generated method stub

	}

}
