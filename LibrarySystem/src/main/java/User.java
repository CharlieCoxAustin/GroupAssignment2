
public abstract class User {
    
    String name;
    int id; 
    String address;
    //vector fineVector = new vector();
    //vector rentedItems = new vector();
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
    
    
    
}
