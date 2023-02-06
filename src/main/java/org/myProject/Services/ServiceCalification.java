package org.myProject.Services;

public class ServiceCalification {
    public synchronized float calculaNota(String[] actividades, double[] porcentaje, float[] notasSacadas){

        float notaSacada = 0;

        for(int i=0; i<actividades.length;i++) {
            float nota = notasSacadas[i];
            notaSacada += (nota);
        }

        notaSacada /= actividades.length;
        System.out.printf("%.2f %n",notaSacada);
        return notaSacada;
    }//el orden ni importa, ya que siempre será el primero por el primero, el segundo por el segundo, etc
}

