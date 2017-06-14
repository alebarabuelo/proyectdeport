package tutoriales.com.deporte01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;//importar para utilizar métodos personales
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public TextView tvMarcadorLocal;
    public TextView tvMarcadorVisitante;
    public TextView tvSetPartido;
    public TextView tvSetLocal;
    public TextView tvSetVisitante;
    public int formacionLocal[][]=new int[2][3];
    public int formacionVisitante[][]=new int[2][3];
    public int ultimoPunto=0;
    public TextView tvPosicion1;
    public TextView tvPosicion2;
    public TextView tvPosicion3;
    public TextView tvPosicion4;
    public TextView tvPosicion5;
    public TextView tvPosicion6;
    public TextView tvPosicion1v;
    public TextView tvPosicion2v;
    public TextView tvPosicion3v;
    public TextView tvPosicion4v;
    public TextView tvPosicion5v;
    public TextView tvPosicion6v;
    public ArrayList<Punto> listaPuntos = new ArrayList<Punto>();
    public Punto nuevoPunto;
    public Partido nuevoPartido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NUEVO PARTIDO
        this.nuevoPartido = new Partido();
        //inicializo el marcador
        //this.marcadorLocal=0;
        //this.marcadorVisitante=0;
        this.tvMarcadorLocal = (TextView)findViewById(R.id.textViewMarcadorLocal);
        this.tvMarcadorVisitante = (TextView)findViewById(R.id.textViewMarcadorVisitante);
        this.tvSetPartido = (TextView)findViewById(R.id.textViewSetPartido);
        this.tvSetLocal = (TextView)findViewById(R.id.textViewSetLocal);
        this.tvSetVisitante = (TextView)findViewById(R.id.textViewSetVisitante);

        this.tvSetPartido.setText(Integer.toString(this.nuevoPartido.setPartido));

        formacionLocal[1][2]= 1;//posicion 1;
        formacionLocal[0][2]= 2;//posicion 2;
        formacionLocal[0][1]= 3;//posicion 3;
        formacionLocal[0][0]= 4;//posicion 4;
        formacionLocal[1][0]= 5;//posicion 5;
        formacionLocal[1][1]= 6;//posicion 6;

        formacionVisitante[1][2]= 11;//posicion 1;
        formacionVisitante[0][2]= 22;//posicion 2;
        formacionVisitante[0][1]= 33;//posicion 3;
        formacionVisitante[0][0]= 44;//posicion 4;
        formacionVisitante[1][0]= 55;//posicion 5;
        formacionVisitante[1][1]= 66;//posicion 6;


        this.tvPosicion1 = (TextView)findViewById(R.id.textViewPosicion1);
        this.tvPosicion2 = (TextView)findViewById(R.id.textViewPosicion2);
        this.tvPosicion3 = (TextView)findViewById(R.id.textViewPosicion3);
        this.tvPosicion4 = (TextView)findViewById(R.id.textViewPosicion4);
        this.tvPosicion5 = (TextView)findViewById(R.id.textViewPosicion5);
        this.tvPosicion6 = (TextView)findViewById(R.id.textViewPosicion6);

        this.tvPosicion1v = (TextView)findViewById(R.id.textViewPosicion1v);
        this.tvPosicion2v = (TextView)findViewById(R.id.textViewPosicion2v);
        this.tvPosicion3v = (TextView)findViewById(R.id.textViewPosicion3v);
        this.tvPosicion4v = (TextView)findViewById(R.id.textViewPosicion4v);
        this.tvPosicion5v = (TextView)findViewById(R.id.textViewPosicion5v);
        this.tvPosicion6v = (TextView)findViewById(R.id.textViewPosicion6v);
    }

    //AUMENTAR PUNTAJE LOCAL
    public void aumentar_puntaje_local(View view){
        //this.marcadorLocal++;
        this.nuevoPartido.marcadorLocal++;
        this.tvMarcadorLocal.setText(Integer.toString(this.nuevoPartido.marcadorLocal));
        if(ultimoPunto==22){
            rotar_formacion_local(view);
            actualizar_formacion(view);
        }
        this.ultimoPunto=11;
    }

    //AUMENTAR PUNTAJE VISITANTE
    public void aumentar_puntaje_visitante(View view){
        //this.marcadorVisitante++;
        this.nuevoPartido.marcadorVisitante++;
        this.tvMarcadorVisitante.setText(Integer.toString(this.nuevoPartido.marcadorVisitante));
        if(ultimoPunto==11){
            rotar_formacion_visitante(view);
            actualizar_formacion(view);
        }
        this.ultimoPunto=22;
    }

    public void rotar_formacion_local(View view){
        int pos1=formacionLocal[1][2];
        int pos2=formacionLocal[0][2];
        int pos3=formacionLocal[0][1];
        int pos4=formacionLocal[0][0];
        int pos5=formacionLocal[1][0];
        int pos6=formacionLocal[1][1];
        formacionLocal[1][2]= pos6;//posicion 1;
        formacionLocal[0][2]= pos1;//posicion 2;
        formacionLocal[0][1]= pos2;//posicion 3;
        formacionLocal[0][0]= pos3;//posicion 4;
        formacionLocal[1][0]= pos4;//posicion 5;
        formacionLocal[1][1]= pos5;//posicion 6
    }

    public void rotar_formacion_visitante(View view){
        int pos1=formacionVisitante[1][2];
        int pos2=formacionVisitante[0][2];
        int pos3=formacionVisitante[0][1];
        int pos4=formacionVisitante[0][0];
        int pos5=formacionVisitante[1][0];
        int pos6=formacionVisitante[1][1];
        formacionVisitante[1][2]= pos6;//posicion 1;
        formacionVisitante[0][2]= pos1;//posicion 2;
        formacionVisitante[0][1]= pos2;//posicion 3;
        formacionVisitante[0][0]= pos3;//posicion 4;
        formacionVisitante[1][0]= pos4;//posicion 5;
        formacionVisitante[1][1]= pos5;//posicion 6
    }

    public void actualizar_formacion(View view){
        this.tvPosicion1.setText(Integer.toString(formacionLocal[1][2]));
        this.tvPosicion2.setText(Integer.toString(formacionLocal[0][2]));
        this.tvPosicion3.setText(Integer.toString(formacionLocal[0][1]));
        this.tvPosicion4.setText(Integer.toString(formacionLocal[0][0]));
        this.tvPosicion5.setText(Integer.toString(formacionLocal[1][0]));
        this.tvPosicion6.setText(Integer.toString(formacionLocal[1][1]));

        this.tvPosicion1v.setText(Integer.toString(formacionVisitante[1][2]));
        this.tvPosicion2v.setText(Integer.toString(formacionVisitante[0][2]));
        this.tvPosicion3v.setText(Integer.toString(formacionVisitante[0][1]));
        this.tvPosicion4v.setText(Integer.toString(formacionVisitante[0][0]));
        this.tvPosicion5v.setText(Integer.toString(formacionVisitante[1][0]));
        this.tvPosicion6v.setText(Integer.toString(formacionVisitante[1][1]));
    }

    public void finalizar_set(View view){
        if(this.nuevoPartido.marcadorLocal != this.nuevoPartido.marcadorVisitante){
            if(this.nuevoPartido.marcadorLocal > this.nuevoPartido.marcadorVisitante){
                this.nuevoPartido.setLocal++;
                this.tvSetLocal.setText(Integer.toString(this.nuevoPartido.setLocal));
            }else
            if(this.nuevoPartido.marcadorVisitante > this.nuevoPartido.marcadorLocal){
                this.nuevoPartido.setVisitante++;
                this.tvSetVisitante.setText(Integer.toString(this.nuevoPartido.setVisitante));
            }
            this.nuevoPartido.setPartido++;
            this.tvSetPartido.setText(Integer.toString(this.nuevoPartido.setPartido));
            //limpio los marcadores
            this.nuevoPartido.marcadorLocal=0;
            this.nuevoPartido.marcadorVisitante=0;
            this.tvMarcadorLocal.setText(Integer.toString(this.nuevoPartido.marcadorLocal));
            this.tvMarcadorVisitante.setText(Integer.toString(this.nuevoPartido.marcadorVisitante));
            //limpio ultimo punto
            this.ultimoPunto=0;
        }else{
            //no hay ganador aun.
        }


    }

}//fin class
