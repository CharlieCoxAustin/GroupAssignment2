
public class childClass extends User {
    
    int maxRentals = 5;
    
    public childClass(String userName, int ID, String userAddress, int userAge)
    {
        if(userAge >= 12)
        {
            System.out.println("You're too old for a children's library card! \n");
            return;
        }
        
        this.setName(userName);
        this.setID(ID);
        this.setAddress(userAddress);
        this.setAge(userAge);
        
        
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
