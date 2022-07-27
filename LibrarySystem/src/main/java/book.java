
public class book extends item {
    
        
        
    public book(int number, String itemTitle, String itemAuthor)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        requested = false;
        checkoutDate = "today";
        author = itemAuthor;
        renewed = false;
        value = 0;
        checkoutTime = 21;
        checkedoutBy = null;
        rentable = true;
    }
    
    @Override
    public String toString()
    {
        return "book";
    }
    
}
