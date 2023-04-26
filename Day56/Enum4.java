enum FavPlaces {

    OOTY,
    TAJMAHAL,
    GOA,
    AGRA,
    KERALA,
    COORG,
    LADAKH,
    MANALI
}


public class Enum4 { 
    public static void main(String[] args) {
        
        FavPlaces fp = FavPlaces.LADAKH;

        switch(fp) {

             case OOTY:

                 System.out.println("one of the best ");
                 break;

             case TAJMAHAL:

                 System.out.println("tajmahal");
                 break;

             case GOA:

                 System.out.println("goa"); 
                 break;   

             case AGRA:

                 System.out.println("agra");  
                 break;  


             case KERALA:

                 System.out.println("kerala");   
                 break;    
                 
             case COORG:

                 System.out.println("coorg");   
                 break; 

             case LADAKH:

                 System.out.println("ladakh");   
                 break; 

             case MANALI:

                 System.out.println("manali");   
                 break;  

        }
    }
    
}
