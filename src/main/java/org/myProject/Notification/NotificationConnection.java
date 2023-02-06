package org.myProject.Notification;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NotificationConnection extends JPanel {

    private String title;
    private Icon icon;
    private int index;

    public NotificationConnection(){

        this.setSize(200,70);
        this.setLayout(new GridBagLayout());
        this.setOpaque(false);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //metodo ControllerPanels.setIndex(index), esto hara que al oprimir, vayamos directo a actividades
            }//esto es igual para cada panel de notificacion
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }
        });

        title = "La conexión a internet es inestable\nhasta que se conecte a una red\nse usara el servicio local";
        index = 6;
    }

    public void setTitle(String texto){//El profesor "+nombreProfesor+"Ha respondido tu pregunta. Haz que el servidor te devuelva esos datos
        this.title = texto;
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

