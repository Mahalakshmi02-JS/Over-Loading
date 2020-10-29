public class PlaceFinder
{
	public static void main(String[] names)
	{
	System.out.println("JVM invoked main");
	String DistanceOfplacesInKm=names[0];
	int distance=Integer.parseInt(DistanceOfplacesInKm);
	Places.placeName(distance);
	System.out.println("Exit::main");
		
	}
}
