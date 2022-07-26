
public class magazine extends item{
    
    public magazine(int number, String itemTitle)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        checkoutDate = "Cannot be checked out";
        requested = false;
        renewed = false;
        value = 0;
        checkoutTime = 0;
        
    }
    
}
