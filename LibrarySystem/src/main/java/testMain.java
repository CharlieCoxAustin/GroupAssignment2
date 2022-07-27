
import java.io.IOException;


public class testMain {
    
    public static void main(String[] args) throws IOException
    {
        //main screen test section
        librarySystem library = new librarySystem();
        mainScreen libraryScreen = new mainScreen(library);
        //library.printAllItems();
        
        //user screen test section
        /*
        adultClass Steve = new adultClass("Steve", 11, "3535 Lakeshore Ave", 29);
        library.addUser(Steve);
        overdueFine fine = new overdueFine(); 
        Steve.fineVector.add(fine);
        fine.addDay();
        fine.addDay();
        fine.addDay();
        userScreen testScreen = new userScreen(Steve, library);
        */
        
        //library.printAllItems();
        
        
        //some basic unit testing to make sure most the rental stuff works
        /*
        adultClass John = new adultClass("John", 25, "Address Drive", 41);
        library.addUser(John);
        book newBook = new book(97, "Grapes of Wrath", "John Steinbeck");
        book twoBook = new book(55, "Catcher in the Rye", "Some Nerd");
        book threeBook = new book(14, "IT", "Steven King");
        library.addItem(newBook);
        library.addItem(twoBook);
        library.addItem(threeBook);
        library.printAllItems();
        John.rentItem(newBook);
        John.rentItem(twoBook);
        John.rentItem(threeBook);
        John.printItems();
        */
        
        
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
