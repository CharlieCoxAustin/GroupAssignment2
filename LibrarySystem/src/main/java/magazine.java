
public class magazine extends item{
    
    public magazine(int number, String itemTitle, String itemAuthor)
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
        checkedoutBy = null;
        rentable = false;
    }
    
    @Override
    public String toString()
    {
        return "magazine";
    }
    
}
