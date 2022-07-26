
public class overdueFine {
    
    float currentOwed;
    int daysOverdue;
    //item itemOverdue;
    
    public overdueFine()
    {
        currentOwed = 0;
        daysOverdue = 0;
    }
    
    //setters n getters!
    
    public void setCurrentOwed(float owed)
    {
        currentOwed = owed;
    }
    
    public void setDaysOverdue(int days)
    {
        daysOverdue = days;
    }
    
    public float getCurrentOwed(float owed)
    {
        return owed;
    }
    
    public int getDaysOverdue(int days)
    {
        return days;
    }
    
    //relevant functions!
    
    public void addDay()
    {
        currentOwed += .10;
        daysOverdue++;
    }
    
}
