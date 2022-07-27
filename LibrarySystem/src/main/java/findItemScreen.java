
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class findItemScreen {
    
    public findItemScreen(librarySystem library)
    {
        JFrame frame = new JFrame("Find Item");
        JPanel panel = new JPanel();
        JTextField titleField = new JTextField("Title");
        JLabel titleLabel = new JLabel("Title: ");
        JButton searchButton = new JButton("Search");
        JButton cancel = new JButton("Cancel");
        
        titleLabel.setBounds(20, 20, 100, 30);
        titleField.setBounds(100, 20, 150, 30);
        searchButton.setBounds(20, 60, 100, 30);
        cancel.setBounds(130, 60, 100, 30);
        
        //making buttons work
        cancel.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                 frame.dispose();
             }
        });
        
        searchButton.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                 if(library.findItem(titleField.getText()))
                 {
                     
                 }
                 else
                 {
                     itemNotFoundScreen notFound = new itemNotFoundScreen();
                 }
             }
        });
        
        frame.setSize(300,300);
        panel.setLayout(null);
        
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(searchButton);
        panel.add(cancel);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }
    
}
