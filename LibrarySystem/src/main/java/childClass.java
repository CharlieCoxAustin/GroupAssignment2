
public class childClass extends User {
    
    int maxRentals = 5;
    
    public childClass(String userName, int ID, String userAddress, int userAge, String userPhoneNumber)
    {
        
        this.setName(userName);
        this.setID(ID);
        this.setAddress(userAddress);
        this.setAge(userAge);
        phoneNumber = userPhoneNumber;
        
        fineAmount = 0;
        numberRentals = 0;
        
    }
    
    //setters n getters!
    
    public int getMaxRentals()
    {
        return maxRentals;
    }
    
    public void setMaxRentals(int newNum)
    {
        maxRentals = newNum;
    }
    
}
