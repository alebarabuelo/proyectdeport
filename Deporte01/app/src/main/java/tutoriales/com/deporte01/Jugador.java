package tutoriales.com.deporte01;

/**
 * Created by usuario on 05/06/2017.
 */
public class Jugador {

    private String nombre;
    private int numeroCamiseta;
    private String puesto;
    private int posicion;
    private String equipo;

    //---------------CONSTRUCTOR
    public Jugador(){
        this.nombre="";
        this.numeroCamiseta=0;
        this.puesto="Sin definir.";
        this.posicion=0;
        this.equipo="Sin definir.";
    }

    //METODOS SET
    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setNumeroCamiseta(int numero){
        this.numeroCamiseta = numero;
    }

    public void setPuesto(String p){
        this.puesto = p;
    }

    public void setPosicion(int pos){
        this.posicion = pos;
    }

    public void setEquipo(String nombre){
        this.equipo = nombre;
    }

    //METODOS GET
    public String getNombre(){
        return this.nombre;
    }

    public int getNumeroCamiseta(){
        return this.numeroCamiseta;
    }

    public String getPuesto(){
        return this.puesto;
    }

    public int getPosicion(){
        return this.posicion;
    }

    public String getEquipo(){
        return this.equipo;
    }

}//fin class
