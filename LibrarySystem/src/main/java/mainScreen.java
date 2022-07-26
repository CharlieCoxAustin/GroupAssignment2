
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class mainScreen {
    
    BufferedWriter libraryWriter;
    
    
    public mainScreen(librarySystem library)
    {
        
        //initializing GUI elements
        JFrame frame = new JFrame("Library System");
        JPanel panel = new JPanel();
        JButton addUser = new JButton("Add User");
        JButton addItem = new JButton("Add Item");
        JButton findUser = new JButton("Find User");
        JButton findItem = new JButton("Find Item");
        JButton quit = new JButton("Quit");
        JLabel title = new JLabel("Library System");
        
        //setting boundaries
        panel.setLayout(null);
        frame.setSize(400, 400);
        addUser.setBounds(20, 100, 100, 30);
        addItem.setBounds(140, 100, 100, 30);
        findUser.setBounds(20, 140, 100, 30);
        findItem.setBounds(140, 140, 100, 30);
        quit.setBounds(260, 100, 100, 30);
        title.setBounds(150, 10, 100, 30);
        
        //making buttons active
        quit.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                 
                 try 
                 {
                     libraryWriter = new BufferedWriter(new FileWriter("itemList.txt"));
                     
                     
                     library.itemMap.forEach((k, v) -> 
                     {
                         try {
                             libraryWriter.write(v.toString() + " " + v.title + " " + v.author + " " + v.itemNumber + " " +
                                     v.checkoutDate + " " + v.checkedOut + " " + v.renewed + " " + v.requested + "\n");
                             } 
                             catch (IOException ex) 
                             {
                             Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
                             }
                     });
                     
                 } 
                 catch (IOException ex) 
                 {
                     Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
                 }
                
                 try 
                 {
                     libraryWriter.close();
                 } 
                 catch (IOException ex) 
                 {
                     Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
                 }
                         
                frame.dispose();
             }
        });
        
        addUser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addUserScreen newUser = new addUserScreen(library);
            }
        });
        
        addItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                addItemScreen newItem = new addItemScreen(library);
            }
        });
        
        findUser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //will open screen to find a user.
            }
        });
        
        findItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //will open screen to find an Item.
            }
        });
        
        //adding to panel
        panel.add(addUser);
        panel.add(addItem);
        panel.add(findUser);
        panel.add(findItem);
        panel.add(quit);
        frame.add(panel);
        panel.add(title);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
