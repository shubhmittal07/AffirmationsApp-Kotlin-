package com.example.affirmationsrevisited.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationsrevisited.R
import com.example.affirmationsrevisited.model.affirmation

class item_adapter(private val context: Context, private val dataset: List<affirmation>)
    :RecyclerView.Adapter<item_adapter.ItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): item_adapter.ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).
                inflate(R.layout.list_item, parent,false)
        return ItemViewHolder(adapterLayout)
    }

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onBindViewHolder(holder: item_adapter.ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceID)

    }

    override fun getItemCount() : Int
    {
        return dataset.size
    }
}