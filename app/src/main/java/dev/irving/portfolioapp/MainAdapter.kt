package dev.irving.portfolioapp

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val dataSet: List<String>) : RecyclerView.Adapter<MainViewHolder>() {

    var itemListener: ItemListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val textView = TextView(parent.context)
        return MainViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
        holder.textView.setOnClickListener { itemListener?.onClickItemListener(dataSet[position]) }
    }

    override fun getItemCount(): Int = dataSet.size

    interface ItemListener {
        fun onClickItemListener(item: String)
    }
}

class MainViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
