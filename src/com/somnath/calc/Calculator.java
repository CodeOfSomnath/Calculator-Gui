package com.somnath.calc;

import javax.swing.UIManager;

public class Calculator {
    public static void main(String[] args) {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    System.out.println(info.getName());
    System.out.println(info.getClassName());
}

    }
}
