package org.myProject.View;

import javax.swing.*;
import org.myProject.Controllers.ControllerWindow;

import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

    private Menu menu;
    private JButton buttonDesplace;
    private JPanel container = new JPanel(), panelTop = new JPanel();;
    private boolean state;
    private static JTabbedPane tabbedPane = new JTabbedPane();
    private JTextField searchIndexPanel;

    public Window(){//Usa los box layout vertical y horizontal y busca que sea un diseño responsivo minimamente
        this.setSize(1100,800);
        this.setMinimumSize(new Dimension(700,600));
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        ControllerWindow.container(this,container);
        //Not reorganice this methods, since may throw a error
        menu();
        TopBar();
        TopSearch();
        state = false;
        ControllerWindow.tabbed(this, container, tabbedPane);
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                container.setBounds(container.getX(), container.getY(), getWidth(), container.getHeight());
                panelTop.setBounds(panelTop.getX(), panelTop.getY(), getWidth(), panelTop.getHeight());
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void menu(){
        menu = new Menu(getHeight());
        this.add(menu, BorderLayout.LINE_START);
    }

    private void TopSearch(){
        searchIndexPanel = new JTextField();
        ControllerWindow.TopSearch(panelTop, searchIndexPanel);
    }

    private void TopBar(){
        ControllerWindow.TopBar(this,container,panelTop);
        button();
    }

    private void button(){
        buttonDesplace = new JButton();
        ControllerWindow.desplace(this, container, panelTop, buttonDesplace, menu);
    }

    public static void setIndex(int index){
        tabbedPane.setSelectedIndex(index);
    }
}
