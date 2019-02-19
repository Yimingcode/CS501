public class C1E11Population {
  public static void main(String[] args) {
	 double population;
	 double birthrate;
	 double deathrate;
	 double imrate;

	 population = 312032486;
	 birthrate = 7;
	 deathrate = 13;
	 imrate = 45;
	 population = population + 365 * 24 * 60 * 60.0 / birthrate - 365 * 24 * 60 * 60.0 / deathrate + 365 * 24 * 60 * 60.0 / imrate;
	 
	 System.out.print("The population of first year is ");
	 System.out.println( population );
	 population = population + 365 * 24 * 60 * 60.0 / birthrate - 365 * 24 * 60 * 60.0 / deathrate + 365 * 24 * 60 * 60.0 / imrate;
	 System.out.print("The population of second year is ");
	 System.out.println( population );
	 population = population + 365 * 24 * 60 * 60.0 / birthrate - 365 * 24 * 60 * 60.0 / deathrate + 365 * 24 * 60 * 60.0 / imrate;
	 System.out.print("The population of third year is ");
	 System.out.println( population );
	 population = population + 365 * 24 * 60 * 60.0 / birthrate - 365 * 24 * 60 * 60.0 / deathrate + 365 * 24 * 60 * 60.0 / imrate;
	 System.out.print("The population of fourth year is ");
	 System.out.println( population );
	 population = population + 365 * 24 * 60 * 60.0 / birthrate - 365 * 24 * 60 * 60.0 / deathrate + 365 * 24 * 60 * 60.0 / imrate;
	 System.out.print("The population of fifth year is ");
	 System.out.println( population );
  }
}
