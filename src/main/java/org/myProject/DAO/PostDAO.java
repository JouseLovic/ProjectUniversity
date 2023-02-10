package org.myProject.DAO;

import java.sql.Connection;
import org.myProject.Entities.DB;
import org.myProject.View.PostStudent;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class PostDAO {

    public synchronized List<PostStudent> getPostStudent(int idGroup){

        Connection connection = DB.getInstance();
        List<PostStudent> listPost = new LinkedList<>();
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = connection.prepareStatement("Select * from post where idGroup = ?");
            ps.setInt(1, idGroup);
            rs = ps.executeQuery();

            while(rs.next()){

                PostStudent post = new PostStudent(rs.getInt(1),
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(5),
                        rs.getDate(6),
                        rs.getInt(7),
                        rs.getInt(8));
                listPost.add(post);
            }
            ps.close();
            rs.close();
            connection.close();
            return listPost;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }






}
