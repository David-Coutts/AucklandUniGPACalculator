import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;




class GPACalculator {

    private static int gradeTotal = 0;
    private static int subjectCount = 0;

    private static String parseInput(String inputVariable){
        inputVariable = inputVariable.toUpperCase();
        if (inputVariable.equals("A+")){
            gradeTotal += 9;
            subjectCount += 1;
        } else if (inputVariable.equals("A")){
            gradeTotal += 8;
            subjectCount += 1;
        } else if (inputVariable.equals("A-")){
            gradeTotal += 7;
            subjectCount += 1;
        } else if (inputVariable.equals("B+")){
            gradeTotal += 6;
            subjectCount += 1;
        } else if (inputVariable.equals("B")){
            gradeTotal += 5;
            subjectCount += 1;
        } else if (inputVariable.equals("B-")){
            gradeTotal += 4;
            subjectCount += 1;
        } else if (inputVariable.equals("C+")){
            gradeTotal += 3;
            subjectCount += 1;
        } else if (inputVariable.equals("C")){
            gradeTotal += 2;
            subjectCount += 1;
        } else if (inputVariable.equals("C-")){
            gradeTotal += 1;
            subjectCount += 1;
        } else if (inputVariable.equals("D+")){
            gradeTotal += 0;
            subjectCount += 1;
        } else if (inputVariable.equals("D")){
            gradeTotal += 0;
            subjectCount += 1;
        } else if (inputVariable.equals("D-")){
            gradeTotal += 0;
            subjectCount += 1;
        } else if (inputVariable.equals("F")){
            gradeTotal += 0;
            subjectCount += 1;
        }
        System.out.println(gradeTotal);
        System.out.println(subjectCount);
        int result = gradeTotal/subjectCount;
        System.out.println(result);
        String returnValue = String.valueOf(result);
        return returnValue;

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
        frame.setSize(250, 250);

        // create panel at bottom, add compmonents
        JPanel panel = new JPanel();
        JLabel promptLabel = new JLabel("Enter your grade (e.g. A+, A, A-, etc.):");
        JTextField textField = new JTextField(10);
        JButton addGradeButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JTextArea textArea = new JTextArea("Your GPA is 0");
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
                String result = parseInput(variable);
                textArea.setText("Your GPA is " + result);

            }
        });

        resetButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int gradeCount = 0;
                int subjectCount = 0;
                textArea.setText("Your GPA is 0");

            }
        });

        //setting layout

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);


    }



    public static void main(String[] args) {
        gui();



    }


}
