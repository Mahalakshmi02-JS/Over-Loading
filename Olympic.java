public class Olympic 
{
	public static void games(String country)
	{
		
		System.out.println("invoked games");
		System.out.println("argument country: "+country);
	}
	public static void games(String nameOfPlayer,String nameOfCountry)
	{
		System.out.println("invoked games with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 nameOfPlayer: " +nameOfPlayer);
		System.out.println("arg2 nameOfCountry: " +nameOfCountry);
		}
		public static void games(String nameOfCountry,int tropiesOfIndia)
	{
		System.out.println("invoked games with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 nameOfCountry: " +nameOfCountry);
		System.out.println("arg2 tropiesOfIndia: " +tropiesOfIndia);
		}
	public static void games(int noOfsportsInOlympic,String oldestSport,double marathonKmInOlympic)
	{
		System.out.println("invoked games with three parameters ");
		System.out.println("String,int and float");
		System.out.println("arg1 oldestSport:"  +oldestSport);
		System.out.println("arg2 noOfsportsInOlympic:  " +noOfsportsInOlympic);
		System.out.println("arg3 marathonKmInOlympic:  " +marathonKmInOlympic);

		}
	
	

		
}

