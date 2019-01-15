import javax.swing.*;
import java.awt.*;
import java.util.*;


class AucklandUniGPACalculator {


    int grades[] = new int[24];

    private static String getInput() {
        String input;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your grade (e.g. A+, A, A-, etc.):");
        input = reader.nextLine();
        return input;
    }

    private static void gui() {
        // create Frame
        JFrame frame = new JFrame("Auckland Uni GPA Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // create panel at bottom, add compmonents

        JPanel panel = new JPanel();
        JLabel promptLabel = new JLabel("Enter your grade (e.g. A+, A, A-, etc.):");
        JTextField textField = new JTextField(30);
        JButton addGradeButton = new JButton("Add grade");
        JButton resetButton = new JButton("Reset");
        JTextArea textArea = new JTextArea("This is just a test.");
        panel.add(promptLabel);
        panel.add(promptLabel);
        panel.add(textField);
        panel.add(addGradeButton);
        panel.add(resetButton);
        panel.add(textArea);

        //setting layout

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);

        // setting up actionListeners

        addGradeButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(this, textBox.getText());
            }
        }

    }


    public static void main(String[] args) {
        gui();


    }


}