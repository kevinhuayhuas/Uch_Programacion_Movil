package com.example.appcalculadroae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Declaramos Globalmente
    /*
    La variable "btnSuma" se debe inicializar y si no sabemos si puede ser null o no,
    agregamos al final del tipo de dato el símbolo del signo de interrogación "?".
    Lo que le dice esto a Kotlin es: "bueno..., esta variable de tipo String podría tener
    un valor o podría ser null ¿quien sabe?".
    val button: Button = findViewById(R.id.button_send);
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSuma: Button = findViewById(R.id.btnSuma);
        var btnResta:Button = findViewById(R.id.btnResta);
        var btnDivision:Button = findViewById(R.id.btnDivision);
        var btnMultiplicaacion :Button= findViewById(R.id.btnMultiplicaacion);

        var txtNumero1:EditText = findViewById(R.id.txtNumero1);
        var txtNumero2: EditText = findViewById(R.id.txtNumero2);

        var txtRespuesta:TextView = findViewById(R.id.txtRespuesta);

        btnSuma.setOnClickListener {
            var numero1 = txtNumero1.text.toString().toDouble();
            var numero2 = txtNumero2.text.toString().toDouble();
            var rpt = calcularOperacion("suma",numero1,numero2);
            txtRespuesta.setText(rpt);
        }

        btnResta.setOnClickListener {
            var numero1 = txtNumero1.text.toString().toDouble();
            var numero2 = txtNumero2.text.toString().toDouble();
            var rpt = calcularOperacion("resta",numero1,numero2);
            txtRespuesta.setText(rpt);
        }

        btnMultiplicaacion.setOnClickListener {
            var numero1 = txtNumero1.text.toString().toDouble();
            var numero2 = txtNumero2.text.toString().toDouble();
            var rpt = calcularOperacion("multiplicacion",numero1,numero2);
            txtRespuesta.setText(rpt);
        }

        btnDivision.setOnClickListener {
            var numero1 = txtNumero1.text.toString().toDouble();
            var numero2 = txtNumero2.text.toString().toDouble();
            var rpt = calcularOperacion("division",numero1,numero2);
            txtRespuesta.setText(rpt);
        }

    }



    //Metodos
    fun calcularOperacion (operacion:String,n1:Double,n2:Double): String{
        var respuesta:Double=0.0;
        when (operacion) {
            "suma" -> {
                respuesta = n1 + n2;
            }
            "resta" -> {
                respuesta = n1 - n2;
            }
            "multiplicacion" -> {
                respuesta = n1 * n2;
            }
            "division" -> {
                respuesta = n1 / n2;
            }
            else -> {

            }
        }
            var cadenaN=respuesta.toString();
            /*val index = cadenaN.indexOf(".");
             if (index == -1) {
                 return cadenaN;
             } else {
                return  cadenaN.substring(index + 1).toString();
             }*/
        return cadenaN;
    }
    fun esEntero(numero:Int):Boolean {
        if (numero % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }


}