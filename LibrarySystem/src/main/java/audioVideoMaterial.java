
public class audioVideoMaterial extends item{
    String checkoutDate;
    
    public audioVideoMaterial(int number, String itemTitle, String itemAuthor)
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
        
    }
    
    @Override
    public String toString()
    {
        return "audioVideoMaterial";
    }
    
}
