package org.myProject.Services;

import org.myProject.DAO.PostDAO;
import org.myProject.Entities.DB;
import org.myProject.Entities.Student;
import org.myProject.View.PostStudent;
import java.util.*;

public class ServiceDBPost {

    private String title;
    private PostStudent postS;
    private int id;
    private String content;
    private String url;
    private byte[] img;
    private int idTeacher;
    private int idGroup;
    private Date initialDate, finishDate;
    private String selectedUser;

    private static List<PostStudent> listPost;
    private static PostDAO post;

    public ServiceDBPost(String user){
        if(user.equalsIgnoreCase("Student") || user.equalsIgnoreCase("Estudiante")){
            user = "Student";
        }
        else if(user.equalsIgnoreCase("Teacher") || user.equalsIgnoreCase("Profesor")){
            user = "Teacher";
        }

        else if(user.equalsIgnoreCase("Admin") || user.equalsIgnoreCase("Developer")){
            user = "Admin";
        }
    }

    public static List<PostStudent> getPostStudent(){
        post = new PostDAO();
        listPost = post.getPostStudent(Student.getIdGroup());
        return listPost;
    }

    public static List<PostStudent> getPostActual(){
        return listPost;
    }

    public static void getPostTeacher(){




    }




}

