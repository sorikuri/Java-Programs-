import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSwitchUI {
    public static void main(String[] args) {
        // 1. Create the main window (Frame)
        JFrame frame = new JFrame("Greeting App");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Custom layout positioning

        // 2. Create UI components
        JLabel label = new JLabel("Enter Number (1-3):");
        label.setBounds(30, 30, 150, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(180, 30, 100, 30);
        frame.add(textField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(30, 80, 100, 30);
        frame.add(submitButton);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(150, 80, 150, 30);
        frame.add(resultLabel);

        // 3. Add logic to the button (Action Listener)
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Read and parse input from the text field
                    int buttonNum = Integer.parseInt(textField.getText());
                    
                    // Your exact switch-case logic
                    switch (buttonNum) {
                        case 1:
                            resultLabel.setText("BITCH!");
                            break;
                        case 2:
                            resultLabel.setText("MOTHERFUCKER!");
                            break;
                        case 3:
                            resultLabel.setText("CHAL NIKAL!");
                            break;
                        default:
                            resultLabel.setText("Invalid case");
                            break;
                    }
                } catch (NumberFormatException ex) {
                    // Handle non-integer inputs gracefully
                    resultLabel.setText("Please enter a number!");
                }
            }
        });

        // 4. Make the window visible
        frame.setVisible(true);
    }


    
 }
