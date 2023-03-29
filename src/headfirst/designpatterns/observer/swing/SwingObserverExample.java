package headfirst.designpatterns.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");


//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());

        button.addActionListener(event -> System.out.println("하지마! 후회할껄?"));
        button.addActionListener(event -> System.out.println("그냥 저질러!"));



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지마! 후회할껄?");
        }
    }


    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러!");
        }
    }
}
