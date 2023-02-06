package org.myProject.View;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class PostInformation extends JPanel {

    private String title, content, url, teacher, subject, finishDate, initialDate;
    private Image img;
    private String answer;

    //Components
    private JLabel labelTitle, labelImage, labelTeacher, labelSubject;
    private JTextPane textArea;
    private JTextField urlField;
    private JTextField initialDateField, finishDateField;//these should have a hidden border for the student can copy the date

    public PostInformation(String title, String content, String url, String teacher, String subject, String finishDate, String initialDate, Image img) {
        this.title = title;
        this.content = content;
        this.url = url;
        this.teacher = teacher;
        this.subject = subject;
        this.finishDate = finishDate;
        this.initialDate = initialDate;
        this.img = img;
        answer = validateUrlOrImg(this.img, this.url);
        components(answer);
    }

    private String validateUrlOrImg(Image image, String url){
        if(image != null && url != null){
            return "No empty";
        }
        else if(image == null){
            this.img = null;
            return "image empty";
        }
        else if(url == null){
            this.url = null;
            return "url empty";
        }
        else{
            this.img = null;
            this.url = null;
            return "two empty";
        }
    }

    private void components(String answer){
        if(answer.equalsIgnoreCase("No empty")){
            componentsWithImgUrl();
        }
        else if(answer.equalsIgnoreCase("image empty")){
            componentsWithUrl();
        }
        else if(answer.equalsIgnoreCase("url empty")){
            componentsWithImg();
        }
        else{
            componentsDefault();
        }
    }

    private void componentsWithImgUrl(){


    }

    private void componentsWithImg(){


    }

    private void componentsWithUrl(){

    }

    private void componentsDefault(){


    }


}
