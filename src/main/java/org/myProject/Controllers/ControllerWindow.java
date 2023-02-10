package org.myProject.Controllers;

import org.myProject.View.Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerWindow {

    private String title;

    public static void TopSearch(JPanel panel, JTextField searchIndexPanel){
        searchIndexPanel.setText("Title of university");
        searchIndexPanel.setBounds(80,0,230,40);
        searchIndexPanel.setForeground(Color.WHITE);
        searchIndexPanel.setEditable(false);
        searchIndexPanel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 25));
        searchIndexPanel.setBackground(panel.getBackground());
        searchIndexPanel.setBorder(BorderFactory.createEmptyBorder());
        panel.add(searchIndexPanel);
    }

    public static void TopBar(Window w,JPanel container, JPanel panelTop){
        panelTop.setBounds(0,0,w.getWidth(),40);
        panelTop.setLayout(null);
        panelTop.setBackground(new Color(185, 28, 125, 255));
        container.add(panelTop, BorderLayout.NORTH);
        panelTop.setVisible(true);
    }

    public static void desplace(Window w, JPanel container,JPanel panelTop, JButton buttonDesplace, Menu menu){
        buttonDesplace.setBounds(5,5,40,40);
        panelTop.add(buttonDesplace);
        buttonDesplace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(menu.getStatePanel()){
                    menu.setStatePanel(false);
                    menu.setVisible(true);
                    container.setBounds(210,container.getY(), w.getWidth(), container.getHeight());
                }
                else {
                    menu.setStatePanel(true);
                    menu.setVisible(false);
                    container.setBounds(0,container.getY(), w.getWidth(), container.getHeight());
                }
            }
        });
    }

    public static void container(Window w,JPanel container){
        container.setBackground(Color.white);
        container.setLayout(null);
        w.add(container, BorderLayout.CENTER);
    }

    public static void tabbed(Window w, JPanel container, JTabbedPane tabbedPane){
        tabbedPane = new JTabbedPane();
        tabbedPane.setPreferredSize(new Dimension(400,400));
        tabbedPane.setBackground(Color.RED);
        container.add(tabbedPane, BorderLayout.WEST);
    }


}
