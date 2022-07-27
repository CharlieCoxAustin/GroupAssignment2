
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class librarySystem {
    
    HashMap <String, item> itemMap = new HashMap<>();
    HashMap <String, User> userMap = new HashMap<>();
    
    BufferedReader libraryReader; 
    
        
    
    public librarySystem() throws FileNotFoundException, IOException
    {
        libraryReader = new BufferedReader(new FileReader("itemList.txt"));
         System.out.println("file opened");
        String line;
        while((line = libraryReader.readLine()) != null)
        {
            System.out.println(line);
            String[] stringArray = line.split(",", 0);
            String type = stringArray[0];
            String title = stringArray[1];
            String author = stringArray[2];
            int number = Integer.parseInt(stringArray[3]);
            String checkoutDate = stringArray[4];
            Boolean checkedOut = Boolean.parseBoolean(stringArray[5]);
            Boolean renewed = Boolean.parseBoolean(stringArray[6]);
            Boolean requested = Boolean.parseBoolean(stringArray[7]);
            
            System.out.println("file opened and read from");
            System.out.println(line);
            item newItem = null;
            
            switch(type) 
            {
                case "book" :
                    newItem = new book(number, title, author);
                    break;
                case "audioVideoMaterial" :
                    newItem = new audioVideoMaterial(number, title, author);
                    break;
                case "currentBestSeller" :
                    newItem = new currentBestSeller(number, title, author);
                    break;
                case "referencebook" :
                    newItem = new referenceBook(number, title, author);
                    break;    
                case "magazine" : 
                    newItem = new magazine(number, title, author);
                    break;
            }
            
            newItem.setCheckedOut(checkedOut);
            newItem.setRenewed(renewed);
            newItem.setRequested(requested);
            newItem.setCheckoutDate(checkoutDate);
            
            itemMap.put(newItem.title, newItem);
            
            //need to add code to open the userFile and also think of a way to save what books are rented.
            
            
        }
        
        itemMap.forEach((k, v) ->
        { 
            System.out.println(v.title); 
        }); 
        
        libraryReader.close();
    }
    
    public void addItem(item itemAdd)
    {
        itemMap.put(itemAdd.getTitle(), itemAdd);
    }
    
    public void removeItem(item itemRemove)
    {
        itemMap.remove(itemRemove);
    }
    
    public void addUser(User newUser)
    {
        userMap.put(newUser.getName() , newUser);
    }
    
    public void removeUser(User oldUser)
    {
        userMap.remove(oldUser);
    }
    
    public void printAllItems()
    {
        itemMap.forEach((k, v) ->
        {
        
          System.out.println(v.title);
          
        });   
    }
    
    public void printAllUsers()
    {
        userMap.forEach((k, v) ->
        {
        
          System.out.println(v.name);
          
        });   
    }
    
    public Boolean findUser(String userName)
    {
        return userMap.containsKey(userName);
    }
    
    public Boolean findItem(String itemName)
    {
        return itemMap.containsKey(itemName);
    }
    
    public item getItem(String itemName)
    {
        System.out.println("getting item.");
        item rentedItem = itemMap.get(itemName);
        System.out.println("Item is " + rentedItem.title);
        return itemMap.get(itemName);
    }
    
    
}
