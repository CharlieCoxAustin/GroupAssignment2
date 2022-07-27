
public class currentBestSeller extends item{
    
    String checkoutDate;
    
    public currentBestSeller(int number, String itemTitle, String itemAuthor)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        requested = false;
        renewed = false;
        value = 0;
        checkoutTime = 14;
        author = itemAuthor;
        checkedoutBy = "nobody";
        rentable = true;
        daysRented = 0;
        
    }
    
    @Override
    public String toString()
    {
        return "currentBestSeller";
    }
    
    
    
}
