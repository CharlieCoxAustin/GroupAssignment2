
public class adultClass extends User {
    
    public adultClass(String userName, int ID, String userAddress, int userAge)
    {
        this.setName(userName);
        this.setID(ID);
        this.setAddress(userAddress);
        this.setAge(userAge);
        numberRentals = 0;
    }
    
}
