
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class itemScreen {
    
    public itemScreen(item thisItem)
    {
        JFrame frame = new JFrame(thisItem.getTitle());
        JPanel panel = new JPanel();
        
        JLabel title = new JLabel("Title: " + thisItem.getTitle());
        JLabel author = new JLabel("Author: " + thisItem.getAuthor());
        JLabel checkedOut = new JLabel("Checked Out: " + thisItem.getCheckedOut());
        JLabel requested = new JLabel("Requested: " + thisItem.getRequested());
        JLabel itemNumber = new JLabel("Item #: " + thisItem.getItemNumber());
        JButton okButton = new JButton("OK");
        
        panel.setLayout(null);
        frame.setSize(300,300);
        
        title.setBounds(20, 20, 150, 30);
        author.setBounds(20, 50, 150, 30);
        checkedOut.setBounds(20, 80, 150, 30);
        requested.setBounds(20, 110, 150, 30);
        itemNumber.setBounds(20, 140, 150, 30);
        okButton.setBounds(100, 180, 150, 30);
        
        okButton.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e)
             {
                 frame.dispose();
             }
        });
        
        panel.add(title);
        panel.add(author);
        panel.add(checkedOut);
        panel.add(requested);
        panel.add(itemNumber);
        panel.add(okButton);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        
    }
    
}
