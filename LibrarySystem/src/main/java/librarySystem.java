
import java.util.HashMap;
import java.util.Vector;


public class librarySystem {
    
    HashMap <String, item> itemMap = new HashMap<>();
    HashMap <String, User> userMap = new HashMap<>();
    
    public librarySystem()
    {
        
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
    
    
}
