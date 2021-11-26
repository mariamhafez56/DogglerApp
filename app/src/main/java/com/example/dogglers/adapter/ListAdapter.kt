package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.Dogs

class ListAdapter(
    val context : Context ,
    val list : List<Dogs>
) : RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
     val adapterLayout = LayoutInflater.from(parent.context)
         .inflate(R.layout.list_item , parent , false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val dog : Dogs = list[position]

        holder.name.text = context.resources.getString(dog.nameResourse)
        holder.age.text = context.resources.getString(dog.ageResourse)
        holder.hobby.text = context.resources.getString(dog.hobbyResourse)
        holder.image.setImageResource(dog.imageResourse)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image : ImageView = itemView.findViewById(R.id.dog_image)
        var name : TextView =  itemView.findViewById(R.id.dog_name)
        var age : TextView = itemView.findViewById(R.id.age)
        var  hobby : TextView = itemView.findViewById(R.id.hobby)


    }
}