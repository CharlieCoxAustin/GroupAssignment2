
public class book extends item {
    
        
    public book(int number, String itemTitle, String date)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        checkoutDate = date;
        requested = false;
        renewed = false;
        value = 0;
        checkoutTime = 21;
    }
    
}
