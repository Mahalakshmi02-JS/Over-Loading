public class PlaceSearcher
{
	public static void main(String[] names)
	{
	System.out.println("JVM invoked main");
	String DistanceOfplacesInKm=names[0];
	int distance=Integer.parseInt(DistanceOfplacesInKm);
	Travelling.search(distance);
	System.out.println("Exit::main");
		
	}
}
