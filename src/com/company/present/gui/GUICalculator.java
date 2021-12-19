package com.company.present.gui;

import com.company.entity.Operation;
import com.company.service.CalculatorService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculator {
    private JTextField jTextField = new JTextField(4);
    private JTextField jTextField2 = new JTextField(4);
    private JTextField jTextField3 = new JTextField(4);
    private JLabel jLabel = new JLabel();

    private CalculatorService calculatorService = new CalculatorService();

    public void run() {
        JFrame jFrame = new JFrame("Calculator");
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Calculate");

        jButton.addActionListener(new CalculateButtonActionListener());

        jPanel.add(jTextField);
        jPanel.add(jTextField2);
        jPanel.add(jTextField3);
        jPanel.add(jLabel);
        jPanel.add(jButton);

        jFrame.add(jPanel);
        jFrame.setSize(400, 100);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private class CalculateButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(jTextField.getText());
            double num2 = Double.parseDouble(jTextField2.getText());
            String operation = jTextField3.getText();
            switch (operation){
                case "sum":
                    Operation sum = calculatorService.sum(num1, num2);
                    jLabel.setText("Result = " + sum.getResult());
                    break;
                case "sub":
                    Operation sub = calculatorService.sub(num1, num2);
                    jLabel.setText("Result = " + sub.getResult());
                    break;
                case "mul":
                    Operation mul = calculatorService.mul(num1, num2);
                    jLabel.setText("Result = " + mul.getResult());
                    break;
                case "div":
                    Operation div = calculatorService.div(num1, num2);
                    jLabel.setText("Result = " + div.getResult());
                    break;
            }
        }
    }
}
