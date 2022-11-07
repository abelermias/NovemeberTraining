public class LocationObjectMothers {

	public static LocationObjectMother NewOrleans() {
		
		return new LocationBuilder()
				.withState(States.Louisiana)
				.withCity(Cities.NewOrleans)
				.build();
	}
	
	public static LocationObjectMother Houston() {
		
		return new LocationBuilder()
				.withState(States.Texas)
				.withCity(Cities.Houston)
				.build();
	}
	
	public static LocationObjectMother Nashville() {
		
		return new LocationBuilder()
				.withState(States.Tennessee)
				.withCity(Cities.Nashville)
				.build();
		
	}
	
	public static LocationObjectMother Asheville() {
		
		return new LocationBuilder()
				.withState(States.NorthCarolina)
				.withCity(Cities.Asheville)
				.build();
		
	}
}
