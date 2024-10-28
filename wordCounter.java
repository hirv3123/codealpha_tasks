import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wordCounter {

    public static void main(String[] args) {

        // creating the frame(JFrame is the main container, here we set the size & close the operation)
        JFrame frame = new JFrame("word counter");
        frame.setSize(400,200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating the components

        // JTextArea allows us to write multiple line text
        JTextArea txtArea = new JTextArea("Enter the paragaraph");

        //JButton triggers the action
        JButton button = new JButton("count the words"); 

        // JLabel displays the result
        JLabel result = new JLabel("word count: 0");


        // adding components to the frame
        frame.add(txtArea, "North");
        frame.add(button, "Center");
        frame.add(result, "South");


// adding Action Listener for the button(Action Listener calculates word count using String.split("\\s+") & updates the label with the count)
        button.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
         String text = txtArea.getText();

        //  splits the text by spaces
         String[] words = text.trim().split("\\s+");

         int wc = words.length;

         result.setText("word count: " + wc);
            }
        });

        // displays the frame
        frame.setVisible(true);
    }
}
