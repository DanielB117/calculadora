package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var pant: EditText? = null
    var operan1 = 0.0
    var operan2 = 0.0
    var res = 0.0
    var ope = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pant = findViewById<View>(R.id.caja) as EditText
    }

    fun bt1(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "1"
        pant!!.setText(cap)
    }

    fun bt2(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "2"
        pant!!.setText(cap)
    }

    fun bt3(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "3"
        pant!!.setText(cap)
    }

    fun bt4(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "4"
        pant!!.setText(cap)
    }

    fun bt5(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "5"
        pant!!.setText(cap)
    }

    fun bt6(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "6"
        pant!!.setText(cap)
    }

    fun bt7(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "7"
        pant!!.setText(cap)
    }

    fun bt8(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "8"
        pant!!.setText(cap)
    }

    fun bt9(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "9"
        pant!!.setText(cap)
    }

    fun bt0(v: View?) {
        var cap = pant!!.text.toString()
        cap = cap + "0"
        pant!!.setText(cap)
    }

    fun btpunt(v: View?) {
        var cap = pant!!.text.toString()
        cap = "$cap."
        pant!!.setText(cap)
    }
    fun buttom(v: View?) {
        var cap = pant!!.text.toString()
        cap = "$cap -"
        pant!!.setText(cap)
    }



    fun suma(v: View?) {
        try {
            val aux1 = pant!!.text.toString()
            operan1 = aux1.toDouble()
        } catch (nfe: NumberFormatException) {
        }
        pant!!.setText("")
        ope = 1
    }

    fun resta(v: View?) {
        try {
            val aux1 = pant!!.text.toString()
            operan1 = aux1.toDouble()
        } catch (nfe: NumberFormatException) {
        }
        pant!!.setText("")
        ope = 2
    }

    fun multiplicacion(v: View?) {
        try {
            val aux1 = pant!!.text.toString()
            operan1 = aux1.toDouble()
        } catch (nfe: NumberFormatException) {
        }
        pant!!.setText("")
        ope = 3
    }

    fun division(v: View?) {
        try {
            val aux1 = pant!!.text.toString()
            operan1 = aux1.toDouble()
        } catch (nfe: NumberFormatException) {
        }
        pant!!.setText("")
        ope = 4
    }



    fun porcentaje(v: View?) {
        try {
            val aux1 = pant!!.text.toString()
            operan1 = aux1.toDouble()
        } catch (nfe: NumberFormatException) {
        }
        pant!!.setText("")
        ope = 5
    }


    fun igual(v: View?) {
        try {
            val aux2 = pant!!.text.toString()
            operan2 = aux2.toDouble()
        } catch (nfe: NumberFormatException) {
        }
        pant!!.setText("")
        if (ope == 1) {
            res = operan1 + operan2
        } else if (ope == 2) {
            res = operan1 - operan2
        } else if (ope == 3) {
            res = operan1 * operan2
        } else if (ope == 4) {
            if (operan2 == 0.0) {
                pant!!.setText("Numero no se puede dividir para 0")
            } else {
                res = operan1 / operan2
            }
        } else if (ope == 5) {
            res = operan2 * (operan1 / 100.0)


        }
        pant!!.setText("" + res)
        operan1 = res
    }

    fun clear(v: View?) {
        pant!!.setText("")
        operan1 = 0.0
        operan2 = 0.0
        res = 0.0
    }

    fun borrar(v: View?) {
        if (pant!!.text.toString() != "") {
            pant!!.setText(pant!!.text.subSequence(0, pant!!.text.length - 1).toString() + "")
        }
    }

}

