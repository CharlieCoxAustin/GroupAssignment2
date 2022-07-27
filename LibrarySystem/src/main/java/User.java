
import java.util.Vector;


public abstract class User {
    
    String name;
    int id; 
    String address;
    Vector<overdueFine> fineVector = new Vector<>();
    Vector<item> rentedItems = new Vector<>();
    int numberRentals;
    int age;
    
    //setters n getters!
    
    public void setName(String userName)
    {
        name = userName;
    }
    
    public void setAge(int userAge)
    {
        age = userAge;
    }
    
    public void setID(int userID)
    {
        id = userID;
    }
    
    public void setAddress(String userAddress)
    {
        address = userAddress;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getAge()
    {
        return age; 
    }
    
    public float getFines()
    {
        float fineTotal = 0;
        
        for(overdueFine fine : fineVector)
        {
            fineTotal += fine.currentOwed;
        }
        
        return fineTotal;
    }
    
    public void payFines()
    {
        fineVector.clear();
    }
    
    
    
}
