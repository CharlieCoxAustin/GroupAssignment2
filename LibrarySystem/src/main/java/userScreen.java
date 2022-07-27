
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class userScreen {
    
    public userScreen(User person, librarySystem library)
    {
        
        JFrame frame = new JFrame(person.getName());
        JPanel panel = new JPanel();
        JButton checkoutItem = new JButton("Checkout Item");
        JButton payFine = new JButton("Pay Fines");
        JButton returnItems = new JButton("Return Items");
        JLabel userName = new JLabel("User name: " + person.getName());
        JLabel fineTotal = new JLabel("Total Fines: $" + person.getFines());
        JLabel address = new JLabel("Address: " + person.getAddress());
        JLabel userID = new JLabel("User ID: " + person.getID());
        JLabel itemsRentedLabel = new JLabel("Items Rented");
        JTextArea itemsRentedArea = new JTextArea();
        
        
        frame.setSize(400,400);
        panel.setLayout(null);
        checkoutItem.setBounds(20, 100, 150, 30);
        payFine.setBounds(180, 100, 150, 30);
        returnItems.setBounds(20, 140, 150, 30);
        userName.setBounds(20, 20, 150, 30);
        fineTotal.setBounds(20, 40, 150, 30);
        address.setBounds(20, 60, 200, 30);
        userID.setBounds(180, 20, 150, 30);
        itemsRentedLabel.setBounds(20, 180, 150, 30);
        itemsRentedArea.setBounds(20, 220, 200, 120);
        
        //makin buttons work
        payFine.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                 person.payFines();
                 finePaidScreen paidFines = new finePaidScreen();
                 fineTotal.setText("Total Fines: $" + person.getFines());
             }
        });
        
        checkoutItem.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                 checkoutItemScreen newItem = new checkoutItemScreen(library, person);
             }
        });
        
        returnItems.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                 person.returnAllItems();
                 itemsReturnedScreen itemsReturned = new itemsReturnedScreen();
             }
        });
        
        panel.add(checkoutItem);
        panel.add(payFine);
        panel.add(returnItems);
        panel.add(userName);
        panel.add(fineTotal);
        panel.add(address);
        panel.add(userID);
        panel.add(itemsRentedLabel);
        panel.add(itemsRentedArea);
        
        
        //
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        for(item rentedItem : person.rentedItems)
        {
            itemsRentedArea.append(rentedItem.getTitle() + "\n");
        }
    }
    
    
    
}
