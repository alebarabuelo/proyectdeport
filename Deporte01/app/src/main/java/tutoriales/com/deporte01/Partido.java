package tutoriales.com.deporte01;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by usuario on 05/06/2017.
 */
public class Partido {

    public String fechaPartido;
    public String equipoLocal;
    public String equipoVisitante;
    public int setPartido;
    public int setLocal;
    public int setVisitante;
    public int marcadorLocal;
    public int marcadorVisitante;

    //CONSTRUCTOR
    public Partido(){
        this.setFecha();//cargo la fecha
        this.equipoLocal="";
        this.equipoVisitante="";
        this.setPartido=1;
        this.setLocal=0;
        this.setVisitante=0;
        this.marcadorLocal=0;
        this.marcadorVisitante=0;
    }

    //---------------------------METODOS SET
    public void setFecha(){
        Date fechaActual = new Date();
        DateFormat formatoFecha = DateFormat.getDateInstance();
        this.fechaPartido = formatoFecha.format(fechaActual);
    }


}//fin class
