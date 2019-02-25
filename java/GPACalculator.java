import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

class grade{

    private static int gradeTotal;
    private static int subjectCount;
    private static int previousGradeTotal;
    private static int previousSubjectCount;

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

    public static void undoAddition(){
        // this will allow users to step back one grade addition, just in case they've made a mistake
        if (previousSubjectCount != 0){
            gradeTotal = previousGradeTotal;
            subjectCount = previousSubjectCount;
        }
    }

    public static void setValue(String inputVariable){
        if (inputVariable.equals("A+")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 9;
            subjectCount += 1;
        } else if (inputVariable.equals("A")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 8;
            subjectCount += 1;
        } else if (inputVariable.equals("A-")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 7;
            subjectCount += 1;
        } else if (inputVariable.equals("B+")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 6;
            subjectCount += 1;
        } else if (inputVariable.equals("B")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 5;
            subjectCount += 1;
        } else if (inputVariable.equals("B-")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 4;
            subjectCount += 1;
        } else if (inputVariable.equals("C+")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 3;
            subjectCount += 1;
        } else if (inputVariable.equals("C")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 2;
            subjectCount += 1;
        } else if (inputVariable.equals("C-")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 1;
            subjectCount += 1;
        } else if (inputVariable.equals("D+")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 0;
            subjectCount += 1;
        } else if (inputVariable.equals("D")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 0;
            subjectCount += 1;
        } else if (inputVariable.equals("D-")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
            gradeTotal += 0;
            subjectCount += 1;
        } else if (inputVariable.equals("F")){
            previousGradeTotal = gradeTotal;
            previousSubjectCount = subjectCount;
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
        JButton undoGradeButton = new JButton("Undo");
        JButton resetButton = new JButton("Reset");
        JTextArea textArea = new JTextArea("Your GPA is " + grade.getValue());
        panel.add(promptLabel);
        panel.add(promptLabel);
        panel.add(textField);
        panel.add(addGradeButton);
        panel.add(undoGradeButton);
        panel.add(resetButton);
        panel.add(textArea);

        //implements action listeners, and their behaviour for submit and reset buttons
        addGradeButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String variable = textField.getText().toUpperCase();
                grade.setValue(variable);
                textArea.setText("Your GPA is " + grade.getValue());
            }
        });

        undoGradeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                grade.undoAddition();
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
