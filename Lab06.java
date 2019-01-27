package Lab06Starter;

/**
 *
 * @author ????
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        StarShip myShip = new StarShip("Orville");
        System.out.println("\n" + myShip.getName() 
								+ " says " + myShip.fireWeapon());
								
		
		// *** PLACE ADDITIONAL STATEMENTS PER PART II HERE.
		System.out.println("Homeport: " + myShip.getHomeport());
		System.out.println("Captain: " + myShip.getCaptain());
		
	
		// STEP 1: Instantiate one of each subclass and fire weapon
		Constitution myGalacticShip = new Constitution("Orville");
		Galaxy myGalacticRock = new Galaxy("Dino TeroShip300", "Jean-Luc Picard", "Dr.Leah Brahms");
        
		// 1.a. Create and fire weapons for a Constitution starship
    
        System.out.println(myGalacticShip.fireWeapon());
		
        // 1.b. Create and fire weapons for a Galaxy starship
		
		System.out.println(myGalacticRock.fireWeapon());
        
		
        // STEP 3: Print average crew size
        
		// 3.a. Print average crew size for Constitution starship
		System.out.println("The Crew size is: " + myGalacticShip.getAvgCrewSize());

        
		// 3.b. Print average crew size for Galaxy starship
		System.out.println("The Crew size is: " + myGalacticRock.getAvgCrewSize());

        
        // STEP 7: Fire all weapons
        System.out.println("\n*** COMMENCE FIRE. Fire at will. ***");
        
        // 7.a. Fire phasers until exhaustion (Constellation)

		
		
        
        // 7.b. Launch torpedo salvos until all torpedoes expended. (Galaxy)
		
		
		

    }
}
