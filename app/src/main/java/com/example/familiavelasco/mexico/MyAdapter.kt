package com.example.familiavelasco.mexico

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
// librerias


class MyAdapter (var mCtx: Context, var resources :Int, var items: List <Model>): ArrayAdapter<Model>(mCtx,resources,items) { // funcionalidad de listview posicionamiento de los elementos dentro de la lista
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {// es una clase abstracta  parecido a java
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resources, null)


        val imageView : ImageView = view.findViewById(R.id.image)// es la identificacion de los elementos xml
        val titleTextView: TextView = view.findViewById(R.id.textView1)// es la identificacion de los elementos xml
        val descriptionTextView: TextView = view.findViewById(R.id.textView2)// es la identificacion de los elementos xml

        var mItem:Model=items[position] // es la posicion de los elementos que conforma la lista
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text=mItem.description


        return view
    }
}