
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class addItemScreen {
    
    String itemType;
    
    public addItemScreen(librarySystem library)
    {
        itemType = "not initialized";
        
        JFrame frame = new JFrame("New Item");
        JPanel panel = new JPanel();
        JLabel titleLabel = new JLabel("Title: ");
        JTextField titleField = new JTextField("Title");
        JLabel itemNumberLabel = new JLabel("Item Number: ");
        JTextField itemNumberField = new JTextField("Item #");
        JButton addItem = new JButton("Add Item");
        JButton cancel = new JButton("Cancel");
        JLabel authorLabel = new JLabel("Author");
        JTextField authorField = new JTextField("author");
        
        
        //setting up combo box for drop down
        String [] itemTypes = {"reference book", "book", "best seller", "A/V item", "magazine"};
        JComboBox dropDown = new JComboBox(itemTypes);
        
        //setting up dimensions
        titleLabel.setBounds(20, 20, 50, 30);
        titleField.setBounds(110, 20, 150, 30);
        itemNumberLabel.setBounds(20, 70, 100, 30);
        itemNumberField.setBounds(110, 70, 150, 30);
        dropDown.setBounds(20, 200, 150, 30);
        addItem.setBounds(20, 250, 150, 30);
        cancel.setBounds(180, 250, 150, 30);
        authorLabel.setBounds(20, 130, 50, 30);
        authorField.setBounds(110, 130, 150, 30);
        
        //making buttons and dropdown work
        dropDown.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 itemType = (String)dropDown.getSelectedItem(); 
                 System.out.println(itemType);
            }
        });
        
        addItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int number = Integer.parseInt(itemNumberField.getText());
                String name = titleField.getText();
                String author = authorField.getText();
                item newItem = null;
                itemType = (String)dropDown.getSelectedItem();
                
                 switch(itemType)
                 {
                     case "reference book" :
                         newItem = new referenceBook(number, name, author); 
                         break;
                     case "book" :
                         newItem = new book(number, name, author);
                         break;
                     case "best seller" :
                         newItem = new currentBestSeller(number, name, author);
                         break;
                     case "A/V item" :
                         newItem = new audioVideoMaterial(number, name, author);
                         break;
                     case "magazine" :
                         newItem = new magazine(number, name, author);
                         break;
                 }
                 
                 library.addItem(newItem);
                 
                 frame.dispose();
            }
        });
        
        cancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                 frame.dispose();
            }
        });
        
        //adding things to panel and frame
        
        panel.setLayout(null);
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(itemNumberLabel);
        panel.add(itemNumberField);
        panel.add(dropDown);
        panel.add(addItem);
        panel.add(cancel);
        panel.add(authorLabel);
        panel.add(authorField);
        
        frame.setSize(350,350);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
