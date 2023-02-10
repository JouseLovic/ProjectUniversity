package org.myProject.View;

import org.myProject.Controllers.ControllerPostTeacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.Date;

public class PostStudent extends JPanel implements Serializable {

    //Information for the student
    private int ID;
    private String title;
    private String text;
    private int idTeacher;
    private int idGroup;
    private Image img;
    private String url;
    private Date initialDate;
    private Date finishDate;

    //Components
    private JLabel labelTitle, labelImage, labelTeacher, labelSubject;
    private JButton moreButton;
    private JTextPane textArea;

    public PostStudent(int ID, String titulo, String texto,
                       String url,
                       Date initialDate,
                       Date finishisDate,
                       int idTeacher,
                       int idGroup){
        this.ID = ID;
        this.title = titulo;
        this.text = texto;
        this.url = url;
        this.initialDate = initialDate;
        this.finishDate = finishDate;
        this.idTeacher = idTeacher;
        this.idGroup = idGroup;
        this.setOpaque(false);
        init();
    }

    private void init(){
        this.setSize(100,200);
        this.setBackground(Color.WHITE);
        components();
        actions();
    }

    private void components(){




    }


    private void actions(){
        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e) {
                ControllerPostTeacher.damePanel(PostStudent.this);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(new Color(80,80,80));
                ControllerPostTeacher.damePanel(PostStudent.this);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public PostStudent getPanel(){
        return this;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return text;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public Image getImg() {
        return img;
    }

    public String getUrl() {
        return url;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }


    public String getLabelTitle() {//this for the search of a activity
        return labelTitle.getText();
    }

    public String getLabelSubject() {//this same, but for the subjects
        return labelSubject.getText();
    }

    public String getTextArea() {
        return textArea.getText();
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
