
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class mainScreen {
    
    public mainScreen(librarySystem library)
    {
        //initializing GUI elements
        JFrame frame = new JFrame("Library System");
        JPanel panel = new JPanel();
        JButton addUser = new JButton("Add User");
        JButton addItem = new JButton("Add Item");
        JButton quit = new JButton("Quit");
        JLabel title = new JLabel("Library System");
        
        //setting boundaries
        panel.setLayout(null);
        frame.setSize(400, 400);
        addUser.setBounds(20, 100, 100, 30);
        addItem.setBounds(140, 100, 100, 30);
        quit.setBounds(260, 100, 100, 30);
        title.setBounds(150, 10, 100, 30);
        
        //making buttons active
        quit.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                frame.dispose();
             }
        });
        
        addUser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //will open screen to add a new user.
            }
        });
        
        addItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //will open screen to add a new Item.
            }
        });
        
        //adding to panel
        panel.add(addUser);
        panel.add(addItem);
        panel.add(quit);
        frame.add(panel);
        panel.add(title);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
