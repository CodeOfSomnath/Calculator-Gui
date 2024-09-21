/**
 * This is the gui class for making a calculator interface 
 */

package com.somnath.calc;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.LinkedList;
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
        // setLabel(); // for debug only
        setButtons();

    }

    private void setUI() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            logger.warning(String.format("Unable to find LookAndFeel", FlatLightLaf.class.getName()));
        }
    }

    private void setMenuBar() {
        JMenuBar bar = new JMenuBar();

        JMenu helpMenu = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        JMenuItem help = new JMenuItem("help");

        helpMenu.add(about);
        helpMenu.addSeparator();
        helpMenu.add(help);

        bar.add(helpMenu);

        this.setJMenuBar(bar);
    }


    private void setLabel() {
        JLabel label = new JLabel();
        label.setOpaque(true); // this line allows to see background color
        label.setBackground(new Color(223, 225, 230));
        label.setBorder(BorderFactory.createLineBorder(new Color(127, 149, 199)));
        label.setBounds(0, 0, getWidth(), 150);
        
        this.add(label);


    }


    private void createNumberButtons(JPanel panel) {
        LinkedList<JButton> buttons = new LinkedList<>();

        for (int i = 9; i > 0; i--) {
            buttons.add(new JButton(String.format("%d", i)));
        }

        for (JButton button : buttons) {
            panel.add(button);
        }

    }

    private void setButtons() {
       
        JPanel numberPlate = new JPanel();
        numberPlate.setLayout(new GridLayout(4, 3));
        // label highet before this panel is 150
        numberPlate.setBounds(0, 150, 400, getHeight()-230);
        this.createNumberButtons(numberPlate);

        //adding more buttons and custom properties
        JButton powerButton = new JButton("10^");
        numberPlate.add(powerButton);

        JButton zeroButton = new JButton("0");
        numberPlate.add(zeroButton);

        JButton dotButton = new JButton(".");
        numberPlate.add(dotButton);

        this.add(numberPlate);

        JPanel oprationPanel = new JPanel();
        

    }

}
