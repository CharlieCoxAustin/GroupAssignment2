
public class referenceBook extends item{
    
    public referenceBook(int number, String itemTitle)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        checkoutDate = "This cannot be rented";
        requested = false;
        renewed = false;
        value = 0;
        checkoutTime = 0;
    }
    
}
