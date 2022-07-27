
public class referenceBook extends item{
    
    public referenceBook(int number, String itemTitle, String itemAuthor)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        checkoutDate = "unrentable";
        requested = false;
        renewed = false;
        value = 0;
        checkoutTime = 0;
        author = itemAuthor;
        checkedoutBy = "nobody";
        rentable = false;
        daysRented = 0;
        
    }
    
    @Override
    public String toString()
    {
        return "referencebook";
    }
    
}
