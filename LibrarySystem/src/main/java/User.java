
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
    
    public String getName(String userName)
    {
        return userName;
    }
    
    public int getID(int userID)
    {
        return userID;
    }
    
    public String getAddress(String userAddress)
    {
        return userAddress;
    }
    
    public int getAge(int userAge)
    {
        return age; 
    }
    
    
    
}
