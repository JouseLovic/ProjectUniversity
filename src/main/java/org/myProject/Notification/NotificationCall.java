package org.myProject.Notification;

import javax.swing.*;
import java.awt.*;

public class NotificationCall extends JPanel{

    private JPanel panelCall;
    private NotificationUpdate updateN;
    private NotificationConnection answerN;
    private NotificationConfirmed confirmedN;

    public NotificationCall(JPanel panel){

        this.setSize(210,500);
        this.setLayout(new FlowLayout());
        this.setOpaque(false);
        this.setBackground(new Color(100,100,100, 100));
        panelCall = this;

        updateN = new NotificationUpdate();
        answerN = new NotificationConnection();
        confirmedN = new NotificationConfirmed();
    }

    public void showNotificationUpdate(){
        updateN.setVisible(true);
        panelCall.add(updateN);
    }

    public void showNotificationAnswer(){
        answerN.setVisible(true);
        panelCall.add(answerN);
    }

    public void showNotificationConfirmed(){
        confirmedN.setVisible(true);
        panelCall.add(confirmedN);
    }

    public void hideNotificationUpdate(){
        panelCall.remove(updateN);
    }

    public void hideNotificationAnswer(){
        panelCall.remove(answerN);
    }

    public void hideNotificationConfirmed(){
        panelCall.remove(confirmedN);
    }

    public void showNotifications(JPanel panel){
        panelCall.setVisible(true);
        panel.add(panelCall);
    }

    public void hideNotifications(JPanel panel){
        panelCall.setVisible(false);
        panel.remove(panelCall);
    }

    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(this.getBackground());
        g2.fillRoundRect(0,0, this.getWidth(), this.getHeight(), 20,20);
        //los dos ultimos son que tan redondeado estara el borde
        super.paintComponent(graphics);
    }



}

