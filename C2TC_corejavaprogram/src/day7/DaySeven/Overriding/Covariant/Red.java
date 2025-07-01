package day7.DaySeven.Overriding.Covariant;

public class Red extends Color {
	
	@Override
	public Red getColor() {
		Red s = new Red();
		return s;
	}
	

}
