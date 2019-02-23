import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

class grade{
    private static int gradeTotal = 0;
    private static int subjectCount = 0;

    public static int getValue() {
        if (subjectCount == 0){
            return 0;
        } else {
            return gradeTotal/subjectCount;
        }
    }

    public static void resetValue(){
        gradeTotal = 0;
        subjectCount = 0;
    }

    public static void setValue(String inputVariable){
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
    }
}

class GPACalculator {
    private static void gui() {
        // create Frame
        JFrame frame = new JFrame("Auckland Uni GPA Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);

        // create panel at bottom, add components
        JPanel panel = new JPanel();
        JLabel promptLabel = new JLabel("Enter your grade (e.g. A+, A, A-, etc.):");
        JTextField textField = new JTextField(10);
        JButton addGradeButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JTextArea textArea = new JTextArea("Your GPA is " + grade.getValue());
        panel.add(promptLabel);
        panel.add(promptLabel);
        panel.add(textField);
        panel.add(addGradeButton);
        panel.add(resetButton);
        panel.add(textArea);

        //implements action listeners, and their behaviour for submit and reset buttons
        addGradeButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String variable = textField.getText();
                grade.setValue(variable);
                textArea.setText("Your GPA is " + grade.getValue());
            }
        });
        resetButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                grade.resetValue();
                textArea.setText("Your GPA is " + grade.getValue());
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
