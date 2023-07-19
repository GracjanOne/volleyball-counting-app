/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.siatkowa;

/**
 *
 * @author GracjanZ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

public class ButtonGame extends JFrame {
private JButton button1;
private JButton button2;
private int score1;
private int score2;
private int score3;
private int score4;
private JTextField textField;
private GridBagConstraints constraints;
public ButtonGame() {
    
    setLayout(new GridBagLayout());
    
    constraints = new GridBagConstraints();
    
    button1 = new JButton("0");
    Font currentFont = button1.getFont();
    float newSize = currentFont.getSize() + 170.0f;
    button1.setFont(currentFont.deriveFont(newSize));

    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            score1++;
            button1.setText(String.valueOf(score1));
        }
    });
    
    constraints.gridx = 2;
    constraints.gridy = 1;
    constraints.insets = new Insets(0, 3, 0, 3);
    add(button1, constraints);
    textField = new JTextField("DRUŻYNA NR. 1");
    
    textField.setPreferredSize(new Dimension(300, 50));
    constraints.gridx = 2;
    constraints.gridy = 0;
    
    textField.setHorizontalAlignment(SwingConstants.CENTER);
    add(textField, constraints);
    JLabel vsLabel = new JLabel("VS");
    vsLabel.setForeground(Color.WHITE);
    add(vsLabel);
    button2 = new JButton("0");
    
    Font currentFont2 = button2.getFont();
    float newSize2 = currentFont2.getSize() + 170.0f;
    button2.setFont(currentFont.deriveFont(newSize2));
    JTextField textField2 = new JTextField("DRUŻYNA NR. 2");
    textField2.setPreferredSize(new Dimension(300, 50));
    textField2.setHorizontalAlignment(SwingConstants.CENTER);
    constraints.gridx = 4;
    constraints.gridy = 0;
   
    add(textField2, constraints);
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            score2++;
            button2.setText(String.valueOf(score2));
        }
    });
    constraints.gridx = 4;
    constraints.gridy = 1;
    constraints.insets = new Insets(0, 10, 5, 10);
    add(button2,constraints);
    
    JButton resetButton = new JButton("Resetuj punkty");
    resetButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            score1 = 0;
            score2 = 0;
            score3 = 0;
            score4 = 0;
            button1.setText(String.valueOf(score1));
            button2.setText(String.valueOf(score2));
        }
    });
    constraints.gridy = 2;
    constraints.gridx = 2;
    add(resetButton,constraints);
    resetButton.setBorderPainted(false);
    JButton button3 = new JButton("0");
    
constraints.gridx = 1;
constraints.gridy = 1;
add(button3, constraints);

button3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        score3++;
        button3.setText(String.valueOf(score3));
        if (score3 >= 6) {
            button3.setEnabled(false);
        }
    }
    
});
JButton button4 = new JButton("0");
constraints.gridx = 5;
constraints.gridy = 1;
add(button4, constraints);
button4.setBorderPainted(false);
button3.setBorderPainted(false);
JButton resetSetsButton = new JButton("Resetuj sety");
resetSetsButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        score3 = 0;
        score4 = 0;
        button3.setText(String.valueOf(score3));
        button4.setText(String.valueOf(score4));
        button3.setEnabled(true);
        button4.setEnabled(true);
    }
});
constraints.gridx = 4;
constraints.gridy = 2;
add(resetSetsButton,constraints);
resetSetsButton.setBorderPainted(false);
button4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        score4++;
        button4.setText(String.valueOf(score4));
        if (score4 >= 6) {
            button4.setEnabled(false);
        }
    }
});

    button1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                if (score1 > 0) {
                    score1--;
                }
                button1.setText(String.valueOf(score1));
            }
        }
    });
    
    button2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                if (score2 > 0) {
                    score2--;
                }
                button2.setText(String.valueOf(score2));
            }
        }
    });
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (score1 <= 40) {
                
                button1.setText(String.valueOf(score1));
            } else {
                button1.setEnabled(false);
            }
        }
    });
    
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (score2 <= 40) {
                
                button2.setText(String.valueOf(score2));
            } else {
                button2.setEnabled(false);
            }
        }
    });
    resetButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            score1 = 0;
            score2 = 0;
            button1.setText(String.valueOf(score1));
            button2.setText(String.valueOf(score2));
            button1.setEnabled(true);
            button2.setEnabled(true);
        }
    });
    button1.setPreferredSize(new Dimension(300, 300));
    button2.setPreferredSize(new Dimension(300, 300));
    button3.setPreferredSize(new Dimension(100, 100));
    button4.setPreferredSize(new Dimension(100,100));
    getContentPane().setBackground(Color.WHITE);
    button1.setBackground(new Color(0x92, 0xC3, 0x8D));
    button2.setBackground(new Color(0xC3, 0x8D, 0x8D));
    button3.setBackground(new Color(0x92, 0xC3, 0x8D));  
    button4.setBackground(new Color(0xC3, 0x8D, 0x8D));
    resetSetsButton.setBackground(new Color(190,193,195));
    resetSetsButton.setForeground(Color.WHITE);
    button1.setBorderPainted(false);
    button2.setBorderPainted(false);
    resetButton.setBackground(new Color(190,193,195));
    resetButton.setForeground(Color.WHITE);
    setTitle("Tablica wyników");
    setSize(300, 100);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    textField.setBorder(null);
    textField2.setBorder(null);

    Font currentFont3 = textField.getFont();
float newSize3 = currentFont3.getSize() + 27.0f;
textField.setFont(currentFont3.deriveFont(Font.BOLD, newSize3));
button1.setFocusPainted(false);
button2.setFocusPainted(false);
button3.setFocusPainted(false);
button4.setFocusPainted(false);
resetSetsButton.setFocusPainted(false);

resetButton.setFocusPainted(false);
Font currentFont4 = textField2.getFont();
float newSize4 = currentFont4.getSize() + 27.0f;
textField2.setFont(currentFont4.deriveFont(Font.BOLD, newSize4));
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    Font currentFont5 = button3.getFont();
    float newSize5 = currentFont5.getSize() + 60.0f;
    button3.setFont(currentFont5.deriveFont(newSize5));
    
    Font currentFont6 = button4.getFont();
    float newSize6 = currentFont6.getSize() + 60.0f;
    button4.setFont(currentFont6.deriveFont(newSize6));
    
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new ButtonGame().setVisible(true);
        }
        
    });
}

}


