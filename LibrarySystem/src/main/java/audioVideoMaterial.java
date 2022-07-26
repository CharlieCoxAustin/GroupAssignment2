
public class audioVideoMaterial extends item{
    String checkoutDate;
    
    public audioVideoMaterial(int number, String itemTitle)
    {
        checkedOut = false;
        itemNumber = number;
        title = itemTitle;
        requested = false;
        renewed = false;
        value = 0;
        checkoutTime = 14;
    }
    
}
