
import java.io.IOException;


public class testMain {
    
    public static void main(String[] args) throws IOException
    {
        //main screen test section
        librarySystem library = new librarySystem();
        //mainScreen libraryScreen = new mainScreen(library);
        //library.printAllItems();
        
        //user screen test section
        adultClass Steve = new adultClass("Steve", 11, "3535 Lakeshore Ave", 29);
        overdueFine fine = new overdueFine();
        Steve.fineVector.add(fine);
        fine.addDay();
        fine.addDay();
        fine.addDay();
        userScreen testScreen = new userScreen(Steve);
        
        //addUserScreen test section
        //addUserScreen testUserScreen = new addUserScreen(library);
        
        //additemscreen test section
        //addItemScreen newItem = new addItemScreen(library);
        
        //finduser test section
        //findUserScreen testFindUser = new findUserScreen(library);
        
        //user not found test
        //userNotFoundScreen testScreen = new userNotFoundScreen();
        
        //findItem test section
        //findItemScreen findItem = new findItemScreen(library);
        
        
    }
    
}
