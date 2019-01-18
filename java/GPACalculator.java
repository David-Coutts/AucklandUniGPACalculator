import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

class GPACalculator {

    public static HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    public static int grades[] = new int[24];

    private static void createHashMap(){
        HashMap<String, Integer> temphmap = new HashMap<String, Integer>();
        temphmap.put("A+", 9);
        temphmap.put("A", 8);
        temphmap.put("A-", 7);
        temphmap.put("B+", 6);
        temphmap.put("B", 5);
        temphmap.put("B-", 4);
        temphmap.put("C+", 3);
        temphmap.put("C", 2);
        temphmap.put("C-", 1);
        temphmap.put("D+", 0);
        temphmap.put("D", 0);
        temphmap.put("D-", 0);
        hmap = temphmap;

    }

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
        int gradeCount = 0;
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
        addGradeButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String variable = textField.getText();
                }

            }
        });

        //setting layout

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);


    }



    public static void main(String[] args) {
        gui();
        createHashMap();

        System.out.println(hmap);



    }


}
