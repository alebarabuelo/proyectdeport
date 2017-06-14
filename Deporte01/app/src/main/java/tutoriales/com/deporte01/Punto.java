package tutoriales.com.deporte01;

/**
 * Created by usuario on 05/06/2017.
 */
public class Punto {

    public int numeroSet;
    public int marcadorLocal;
    public int marcadorVisitante;
    public Jugador jugadorPunto;
    public String equipo;
    private int rotacionLocal[];
    private int rotacionVisitante[];

    //CONTRUCTOR
    public Punto(){
        this.rotacionLocal = new int[6];
        this.rotacionVisitante = new int[6];
    }

    //METODOS SET
    public void setRotacionLocal(int p1,int p2, int p3,int p4,int p5,int p6){
        //se cargan las camisetas que hay en cada posicion.
        this.rotacionLocal[0] = p1;
        this.rotacionLocal[1] = p2;
        this.rotacionLocal[2] = p3;
        this.rotacionLocal[3] = p4;
        this.rotacionLocal[4] = p5;
        this.rotacionLocal[5] = p6;
    }

    public void setRotacionVisitante(int p1,int p2, int p3,int p4,int p5,int p6){
        //se cargan las camisetas que hay en cada posicion.
        this.rotacionVisitante[0] = p1;
        this.rotacionVisitante[1] = p2;
        this.rotacionVisitante[2] = p3;
        this.rotacionVisitante[3] = p4;
        this.rotacionVisitante[4] = p5;
        this.rotacionVisitante[5] = p6;
    }

    //METODOS GET
    public int[] getRotacionLocal(){
        return this.rotacionLocal;
    }

    public int[] getRotacionVisitante(){
        return this.rotacionVisitante;
    }

}//fin class
