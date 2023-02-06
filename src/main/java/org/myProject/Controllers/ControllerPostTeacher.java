package org.myProject.Controllers;

import org.myProject.View.PostStudent;

import javax.swing.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class ControllerPostTeacher {

    private static PostStudent panelP;
    private static PostStudent panelCreado;
    private static ArrayList<PostStudent> listaPaneles = new ArrayList<>();
    private static int ID;
    private static int positionX = 100, positionAux;

    public static void damePanel(PostStudent panel){
        ID = panel.getID();
        panelP = panel.getPanel();
    }

    public static PostStudent creaPanel(JPanel panel, int ID, String title, String texto){
        PostStudent PanelPrueba = new PostStudent(ID, title, texto);
        PanelPrueba.setBounds(50+positionX,150,100,200);
        PanelPrueba.setVisible(true);
        positionX +=130;
        panel.add(PanelPrueba);
        panel.revalidate();
        panel.repaint();
        return PanelPrueba;

    }


    public static void eliminaPanel(JPanel panelContainer) {

        if(ID == -1 || ID == 0){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun post");
        }
        else{
            try {
                for (PostStudent prueba : listaPaneles) {
                    if (prueba.getID() == ID) {
                        positionX -= 130;
                        panelContainer.remove(panelP);
                        listaPaneles.remove(panelP);
                        System.out.println(listaPaneles.size());
                        panelP = null;
                        ID = -1;
                        panelContainer.revalidate();
                        panelContainer.repaint();
                        break;//Esto evito la excepción
                    }
                }
            }catch (ConcurrentModificationException ex){
                JOptionPane.showMessageDialog(null, "Tiro un error");
            }

        }

    }
    public static void setListaPaneles(PostStudent panel) {
        ControllerPostTeacher.listaPaneles.add(panel);
        System.out.println(listaPaneles.size());
    }
}
