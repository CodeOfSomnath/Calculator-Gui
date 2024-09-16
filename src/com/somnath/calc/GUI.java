/**
 * This is the gui class for making a calculator interface 
 */

package com.somnath.calc;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import java.util.logging.*;
import com.formdev.flatlaf.FlatLightLaf;

public class GUI extends JFrame {

    private static Logger logger = Logger.getLogger(GUI.class.getName());

    public GUI(String title) {
        super(title);
        // I have adjust ui manager
        setUI();

        // properties
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);
        setSize(500, 700);
        setResizable(false);
        
        // custom functions
        setMenuBar();
        setLabel();
        setButtons();

    }

    private void setUI() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            logger.warning(String.format("Unable to find LookAndFeel", FlatLightLaf.class.getName()));
        }
    }

    private void setMenuBar() {}


    private void setLabel() {
        JLabel label = new JLabel("Hello");
        label.setOpaque(true);
        label.setBackground(new Color(223, 225, 230));
        label.setBorder(BorderFactory.createLineBorder(new Color(127, 149, 199)));
        label.setBounds(0, 0, getWidth(), 150);
        
        this.add(label);


    }
    private void setButtons() {}

}
