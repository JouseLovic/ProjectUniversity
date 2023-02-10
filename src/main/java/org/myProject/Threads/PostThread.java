package org.myProject.Threads;

import org.myProject.Entities.Teacher;
import org.myProject.Services.ServiceConnection;
import org.myProject.Services.ServiceDBPost;
import org.myProject.View.PostStudent;

import java.util.List;

public class PostThread extends Thread{

    private ServiceDBPost servicePost;
    private int id;

    @Override
    public void run() {

        while(true) {
            try{
                Thread.sleep(500);
                if(ServiceConnection.getStateConnection()){
                    List<PostStudent> listPostS = ServiceDBPost.getPostActual();
                    List<PostStudent> listPostDBS = ServiceDBPost.getPostStudent();
                    for(PostStudent post: listPostDBS){
                        id = post.getID();
                        for(PostStudent panel: listPostS) {
                            if (panel.getID() != id) {
                                //hay que llamar a un metodo del controller que actualice o notifique
                                break;
                            } else {

                            }
                            if (panel.getID() == id &&
                                    !panel.getTitle().equalsIgnoreCase(post.getTitle()) ||
                                    !panel.getContent().equalsIgnoreCase(post.getContent())) {
                                //hay que llamar a un metodo del controller que actualice o notifique que se ha cambiado algo dentro de los post
                                break;
                            }
                        }
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

