package com.example.familiavelasco.mexico

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview  = findViewById<ListView>(R.id.listVie)
        var list = mutableListOf<Model>()
        list.add(Model("Nachos"," Precio: $4.500",R.drawable.nachos))
        list.add(Model("Quesadillas","Precio:$4.000",R.drawable.Quesadillas))
        list.add(Model("Tacos","Precio:$5.000",R.drawable.Tacos))
        list.add(Model("Burritos","Precio:$8.000",R.drawable.Burritos))

        listview.adapter=MyAdapter(this,R.layout.fila,list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->

            if(position==0){
            Toast.makeText(this@MainActivity, "description1",Toast.LENGTH_LONG).show()
            }
            if(position==1){
                Toast.makeText(this@MainActivity, "description2",Toast.LENGTH_LONG).show()
            }
            if(position==2){
                Toast.makeText(this@MainActivity, "description3",Toast.LENGTH_LONG).show()
            }
            if(position==3){
                Toast.makeText(this@MainActivity, "description4",Toast.LENGTH_LONG).show()
            }

        }

    }

}

