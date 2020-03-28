package com.example.familiavelasco.mexico

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var acumulador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview  = findViewById<ListView>(R.id.listVie)
        var list = mutableListOf<Model>()
        list.add(Model("Nachos"," Precio: $4.500",R.drawable.nachos))
        list.add(Model("Quesadillas","Precio:$4.000",R.drawable.quesadillas))
        list.add(Model("Tacos","Precio:$5.000",R.drawable.tacos))
        list.add(Model("Burritos","Precio:$8.000",R.drawable.burritos))

        listview.adapter=MyAdapter(this,R.layout.fila,list)

        var precio0 = 4500
        var precio1 = 4000
        var precio2 = 5000
        var precio3 = 8000

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->

            if(position==0){
                acumulador = acumulador + precio0
            Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
            if(position==1){
                acumulador = acumulador + precio1
                Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
            if(position==2){
                acumulador = acumulador + precio2
                Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
            if(position==3){
                acumulador = acumulador + precio3
                Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
        }
    }

    public fun comprar(view: View){
        Toast.makeText(this@MainActivity, "PAGO TOTAL = $"+acumulador,Toast.LENGTH_LONG).show()
        acumulador = 0;
    }

    public fun reiniciar(view: View){
        Toast.makeText(this@MainActivity, "Cuenta Reiniciada",Toast.LENGTH_SHORT).show()
        acumulador = 0;
    }
}

