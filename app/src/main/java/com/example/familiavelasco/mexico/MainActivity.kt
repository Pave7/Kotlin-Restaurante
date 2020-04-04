package com.example.familiavelasco.mexico

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

// librerias

class MainActivity : AppCompatActivity() { // Clase principal que encierra la funcionalidad de las imagenes  y de la operación basica
    var acumulador = 0  //Se inicializa el acumulador

    override fun onCreate(savedInstanceState: Bundle?) {// es una clase abstracta  parecido a java
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview  = findViewById<ListView>(R.id.listVie) // trae la funcionalidad de la interfaz actvity_main.xml
        var list = mutableListOf<Model>() // se implementa la interfaz de la clase "Model"  donde  el  mutableListOf es la colección de los elementos que conforman el menú
        list.add(Model("Nachos"," Precio: $4.500",R.drawable.nachos)) //Se coloca el titulo del plato y el precio con la respectiva imagen
        list.add(Model("Quesadillas","Precio:$4.000",R.drawable.quesadillas))//Se coloca el titulo del plato y el precio con la respectiva imagen
        list.add(Model("Tacos","Precio:$5.000",R.drawable.tacos))//Se coloca el titulo del plato y el precio con la respectiva imagen
        list.add(Model("Burritos","Precio:$8.000",R.drawable.burritos))//Se coloca el titulo del plato y el precio con la respectiva imagen

        listview.adapter=MyAdapter(this,R.layout.fila,list) //Se llama las variable de la clase MyAdapter para que funciones las imagenes y los precios dentro de la ListView
        // precios de los platos
        var precio0 = 4500
        var precio1 = 4000
        var precio2 = 5000
        var precio3 = 8000

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long -> // Esto representa el posicionamiento cuando el usuario le da clic dependiendo de las imagenes

            if(position==0){ 
                acumulador = acumulador + precio0  //Se suma el valor acumulado más el precio del plato
            Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
            if(position==1){
                acumulador = acumulador + precio1 //Se suma el valor acumulado más el precio del plato
                Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
            if(position==2){
                acumulador = acumulador + precio2 //Se suma el valor acumulado más el precio del plato
                Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
            if(position==3){
                acumulador = acumulador + precio3 //Se suma el valor acumulado más el precio del plato
                Toast.makeText(this@MainActivity, "Valor acumulado = $"+acumulador,Toast.LENGTH_SHORT).show()
            }
        }
    }

    //Método para mostrar el valor total de la compra y reinicializa el acumulador
    public fun comprar(view: View){
        Toast.makeText(this@MainActivity, "PAGO TOTAL = $"+acumulador,Toast.LENGTH_LONG).show()
        acumulador = 0;     // se reinicializa el acumulador
    }

    //Método para reinicializar el contador
    public fun reiniciar(view: View){
        Toast.makeText(this@MainActivity, "Cuenta Reiniciada",Toast.LENGTH_SHORT).show()
        acumulador = 0; // Se reinicializa el acumulador
    }
}

