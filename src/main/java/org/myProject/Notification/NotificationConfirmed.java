package org.myProject.Notification;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NotificationConfirmed extends JPanel {

    private String title;
    private Icon icon;
    private int index;

    public NotificationConfirmed(){

        this.setSize(200,70);
        this.setOpaque(false);
        this.setLayout(new GridBagLayout());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //metodo ControllerPanels.setIndex(index), esto hara que al oprimir, vayamos directo a actividades
            }//controllerPanels.setComboIndex(2), para que tenga sentido
            //esto es igual para cada panel de notificacion
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }
        });

        title = "Un profesor ha confirmado la entrega\nde una de sus actividades";
        index = 4;//esto es porque en el tabbed todos los paneles van a estar, solo que serán invisibles para el usuario
    }

    public String getTitle(){ return title; }

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

