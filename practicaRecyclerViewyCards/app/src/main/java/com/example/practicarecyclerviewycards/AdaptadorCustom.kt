package com.example.practicarecyclerviewycards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorCustom: RecyclerView.Adapter<AdaptadorCustom.ViewHolder>() {

    val titles = arrayOf("Barbara", "Mokita", "Camilin", "Programacion")

    val details = arrayOf("Kotlin", "Python", "JavaScript", "Java")

    val images = arrayOf(R.drawable.ic_launcher_foreground,
                         R.drawable.ic_launcher_foreground,
                         R.drawable.ic_launcher_foreground,
                         R.drawable.ic_launcher_foreground)


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(ViewHolder: ViewHolder, i: Int) {
        ViewHolder.itemTitle.text = titles[i]
        ViewHolder.itemDetail.text = details[i]
        ViewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

        }
    }
}