package com.java.java8features;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaSwing {
        public static void main(String[] args) {
            JTextField tf=new JTextField();
            tf.setBounds(100, 100,350,50);
            JButton b=new JButton("click");
            b.setBounds(200,300,100,60);

            // lambda expression implementing here.
            b.addActionListener(e-> {tf.setText("hello swing");});

            JFrame f=new JFrame();
            f.add(tf);f.add(b);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(null);
            f.setSize(800, 600);
            f.setVisible(true);

        }


}
