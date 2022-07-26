
public class book extends item {
    
        String checkoutDate;
        
    public book(int number, String itemTitle)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        requested = false;
        renewed = false;
        value = 0;
        checkoutTime = 21;
    }
    
}
