public class Places
{
	public static String placeName(int distance)
	{
		System.out.println("Invoked placeName");
		System.out.println("distance:" +distance);
		if(distance==246)
		{
			System.out.println("Distance from Hassan to Kolar");
			return "Hassan to Kolar";
			
		}
		if(distance==513)
		{
			System.out.println("Distance from udupi to raichur");
			return "Udupi to Raichur";
			
		}
		if(distance==436)
		{
			System.out.println("Distance from koppal to mysore");
			return "koppal to mysore";
		}
		if(distance==470)
		{
			System.out.println("Distance from Bidar to belgaum");
			return "Bidar to Belgaum";
			
		}
		if(distance==266)
		{
			System.out.println("Distance from Haveri to Tumkur");
			return "Haveri to Tumkur";
			
		}
		if(distance==248)
		{
			System.out.println("Distance from Banglore to Coorg");
			return "Banglore to Coorg";
			
		}
		if(distance==1691)
		{
			System.out.println("Distance from Karnataka to Nepal");
			return "Karnataka to Nepal";
			
		}
		if(distance==1123)
		{
			System.out.println("Distance from jammu to UP");
			return "jammu to UP";
			
		}
		if(distance==1000)
		{
			System.out.println("Distance from Telangana to orissa");
			return "Telangana to orissa";
			
		}
		if(distance==1250)
		{
			System.out.println("Distance from Gujarath to Goa");
			return "Gujarath to Goa";
			
		}
		if(distance==120)
		{
			System.out.println("Distance from Hassan to Mandya");
			return "Hassan to Mandya";
			
		}
		if(distance==720)
		{
			System.out.println("Distance from Bellary to chikkballapur");
			return "Bellary to chikkballapur";
			
		}
		if(distance==250)
		{
			System.out.println("Distance from Yadgir to Hassan");
			return "Yadgir to Hassan";
			
		}
		if(distance==200)
		{
			System.out.println("Distance from Tumkur to Shivmogha");
			return "Tumkur to Shivmogha";
			
		}
		System.out.println("Place not in Earth");

		return "place not in earth";
		
	}
}