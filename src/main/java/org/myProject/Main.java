package org.myProject;

import mdlaf.MaterialLookAndFeel;
import org.myProject.View.Window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

      try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e){
            throw new RuntimeException(e);
        }

        Window w = new Window();
        w.setVisible(true);
    }
}
