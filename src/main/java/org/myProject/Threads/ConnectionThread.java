package org.myProject.Threads;

import java.sql.Connection;
import org.myProject.Entities.DB;
import org.myProject.Services.ServiceConnection;

public class ConnectionThread extends Thread{

    @Override
    public void run() {

            while(true){
                try {
                    Thread.sleep(300);
                    Connection connection = DB.getInstance();

                     if(connection ==null){
                         ServiceConnection.setStateConnection(false);
                     }
                     else{
                         ServiceConnection.setStateConnection(true);
                     }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}

