package day7.DaySeven.Overriding;

public class SBI extends RBI {  //Sub Class
	
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}

}
