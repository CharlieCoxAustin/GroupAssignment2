
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
        JLabel checkedOutDate = new JLabel("Date Checked Out: " + thisItem.getCheckoutDate());
        JLabel requested = new JLabel("Requested: " + thisItem.getRequested());
        JLabel itemNumber = new JLabel("Item #: " + thisItem.getItemNumber());
        JLabel valueLabel = new JLabel("Value: " + thisItem.getValue());
        JButton okButton = new JButton("OK");
        
        
        panel.setLayout(null);
        frame.setSize(320,320);
        
        title.setBounds(20, 20, 150, 30);
        author.setBounds(20, 50, 150, 30);
        checkedOut.setBounds(20, 80, 150, 30);
        checkedOutDate.setBounds(20, 110, 250, 30);
        requested.setBounds(20, 140, 150, 30);
        itemNumber.setBounds(20, 170, 150, 30);
        valueLabel.setBounds(20, 200, 150, 30);
        okButton.setBounds(75, 230, 150, 30);
        
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
        panel.add(valueLabel);
        panel.add(okButton);
        panel.add(checkedOutDate);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        
    }
    
}
