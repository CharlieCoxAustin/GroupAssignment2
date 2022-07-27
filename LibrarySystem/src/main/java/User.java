
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
    
    public void setNumRentals(int number)
    {
        numberRentals = number;
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
    
    public int getNumberRentals()
    {
        return numberRentals;
    }
    
    public void addFine(overdueFine newFine)
    {
        fineVector.add(newFine);
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
    
    public void rentItem(item rentable)
    {
        if(rentable.rentable)
        {
           rentedItems.add(rentable);
           rentable.setCheckedOut(true);
           rentable.checkedoutBy = this.getName();
        }
    }
    
    public void returnItem(item returnable)
    {
        rentedItems.remove(returnable);
        returnable.setCheckedOut(false); 
    }
    
    public void returnAllItems()
    {
        for(item rentedItem : rentedItems)
        {
            rentedItem.setCheckedOut(false);
            rentedItem.setCheckoutDate("not checked out");
        }
        rentedItems.clear();
    }
    
    public void payFines()
    {
        fineVector.clear();
    }
    
    public void printItems()
    {
        System.out.println("Printing items: ");
        for(item rentedItem : rentedItems)
        {
            System.out.println(rentedItem.title);
        }
    }
    
    
    
}
