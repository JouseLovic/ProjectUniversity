package Testeo;

import org.junit.Test;
import org.myProject.Services.ServiceCalification;

public class AppTest {

    @Test
    public void saveTitlesSettings() {


    }

    @Test
    public void saveThemeSettings(){

    }

    @Test
    public void validateTimePost(){



    }

    @Test
    public void receivedAMessageServer(){


    }

    @Test
    public void calculateCalification(){
        String activdades[] = {"Taller","Examen escrito","Exposicion","Trabajo","Exposicion final"};
        double porcentaje[] = {0.10, 0.20, 0.15,0.10,0.30};
        float total[] = {17.5F, 14.3F, 0, 0F,0F};

        float resultado = new ServiceCalification().calculaNota(activdades, porcentaje, total);
    }

    @Test
    public void shouldCreateRegisterGroup(){


        //esta es una prueba para crear un registro en la base de datos
    }


}