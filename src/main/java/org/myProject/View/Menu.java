package org.myProject.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JPanel {

    private static boolean statePanel;
    private boolean mouseExitedState;
    private String home, activities, notes, settings;

    //Components
    private panelButton buttonHome, buttonNotes, buttonActivityes, buttonSentActi, buttonSettings;
    private JLabel labelHome, labelActiv, labelNotes, labelSettings;
    private JLabel labelImgHome, labelImgAct, labelImgN, labelImgSett;
    private JPanel panelUser, container, panelOptions;

    public Menu(int height){
        statePanel = false;
        this.setSize(200, height);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        declaredLanguage(true);
        declaredLabels();
        declaredContainer();
        buttons();
        panelUser();
    }

    private void declaredLanguage(boolean state){
        if(state){//Is true if selected language is Spanish
            home = "Pagina inicial";
            notes = "Trabajo";
            activities = "Universidad";
            settings = "Configuraciones";
        }
        else{
            home = "Home";
            notes = "Schedule";
            activities = "University";
            settings = "Settings";
        }
    }

    private void declaredLabels(){
        labelHome = new JLabel(home);
        labelHome.setForeground(Color.BLACK);
        labelHome.setFont(new Font("Arial", Font.PLAIN, 20));
        labelHome.setHorizontalAlignment(0);

        labelActiv = new JLabel(activities);
        labelActiv.setForeground(Color.BLACK);
        labelActiv.setFont(new Font("Arial", Font.PLAIN, 20));
        labelActiv.setHorizontalAlignment(0);

        labelNotes = new JLabel(notes);
        labelNotes.setForeground(Color.BLACK);
        labelNotes.setFont(new Font("Arial", Font.PLAIN, 20));
        labelNotes.setHorizontalAlignment(0);

        labelSettings = new JLabel(settings);
        labelSettings.setForeground(Color.BLACK);
        labelSettings.setFont(new Font("Arial", Font.PLAIN, 20));
        labelSettings.setHorizontalAlignment(0);
    }

    private void declaredContainer(){
        container = new JPanel();
        container.setBackground(Color.WHITE);
        container.setLayout(new BorderLayout());
        this.add(container, BorderLayout.CENTER);
        panelOption();
    }

    private void panelOption(){
        panelOptions = new JPanel();
        panelOptions.setBackground(Color.WHITE);
        panelOptions.setPreferredSize(new Dimension(getWidth(), 500));
        panelOptions.setLayout(null);
        container.add(panelOptions, BorderLayout.CENTER);
    }

    private void buttons(){

        buttonHome = new panelButton(30,30);
        buttonHome.setBounds(5,40, 185,60);
        buttonHome.setBackground(panelOptions.getBackground());
        buttonHome.setLayout(null);
        labelHome.setBounds(20,15,140,30);
        buttonHome.add(labelHome);
        buttonHome.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                //Window.setIndex(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonHome.setBackground(new Color(180,180,180));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                buttonHome.setBackground(Color.WHITE);
            }
        });


        buttonNotes = new panelButton(30,30);
        buttonNotes.setLayout(null);
        buttonNotes.setBounds(5,120,185,60);
        buttonNotes.setBackground(panelOptions.getBackground());
        labelNotes.setBounds(20,15,140,30);
        buttonNotes.add(labelNotes);
        buttonNotes.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonNotes.setBackground(new Color(180,180,180));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                buttonNotes.setBackground(Color.WHITE);
            }
        });

        buttonActivityes = new panelButton(30,30);
        buttonActivityes.setLayout(null);
        buttonActivityes.setBounds(5,200,185,60);
        buttonActivityes.setBackground(panelOptions.getBackground());
        labelActiv.setBounds(20,15,140,30);
        buttonActivityes.add(labelActiv);
        buttonActivityes.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonActivityes.setBackground(new Color(180,180,180));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                buttonActivityes.setBackground(Color.WHITE);
            }
        });

        panelOptions.add(buttonHome);
        panelOptions.add(buttonNotes);
        panelOptions.add(buttonActivityes);


    }

    private void panelUser(){
        panelUser = new JPanel();
        panelUser.setBackground(new Color(185, 28, 125, 255));
        panelUser.setPreferredSize(new Dimension(getWidth(), 150));
        panelUser.setLayout(null);
        container.add(panelUser, BorderLayout.NORTH);
    }

    public static void setStatePanel(boolean state){
        statePanel = state;
    }

    public static boolean getStatePanel(){
        return statePanel;
    }

}
