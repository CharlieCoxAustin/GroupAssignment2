
public abstract class item {
    
    Boolean checkedOut;
    int itemNumber;
    String title;
    String checkoutDate;
    Boolean requested;
    Boolean renewed;
    float value;
    int checkoutTime;
    String author;
    String checkedoutBy;
    Boolean rentable;
    
    
    //setters n getters!
    
    public void setCheckedOut(Boolean value)
    {
        checkedOut = value;
    }
    
    public void setItemNumber(int value)
    {
        itemNumber = value;
    }
    
    public void setTitle(String value)
    {
        title = value;
    }
    
    public void setCheckoutDate(String value)
    {
        checkoutDate = value;
    }
    
    public void setRequested(Boolean value)
    {
        requested = value;
    }
    
    public void setRenewed(Boolean value)
    {
        renewed = value;
    }
    
    public void setValue(float itemValue)
    {
        value = itemValue;
    }
    
    public void setCheckoutTime(int number)
    {
        checkoutTime = number;
    }
    
    public void setCheckedoutBy(String person) //changed from accepting a User as an argument
    {
        checkedoutBy = person;
    }
    
    public void setAuthor(String name)
    {
        author = name;
    }
    
    public int getCheckoutTime()
    {
        return checkoutTime;
    }
    
    public Boolean getCheckedOut()
    {
        return checkedOut;
    }
    
    public int getItemNumber()
    {
        return itemNumber;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getCheckoutDate()
    {
        return checkoutDate;
    }
    
    public Boolean getRequested()
    {
        return requested;
    }
    
    public Boolean getRenewed()
    {
        return renewed;
    }
    
    public float getValue()
    {
        return value;
    }
    
    public String getCheckedoutBy()
    {
        return checkedoutBy;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    
    
}
