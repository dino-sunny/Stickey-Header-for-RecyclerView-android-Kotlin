package com.care.dino.stickyheader

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.header_layout.view.*
import kotlinx.android.synthetic.main.item_layout.view.*

class StickyAdapter(val  items: ArrayList<Data>, val  context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
        StickHeaderItemDecoration.StickyHeaderInterface {

    private val HEADING = 1
    private val NORMAL = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val itemView: View

        when (viewType) {
            HEADING -> {
                itemView = LayoutInflater.from(parent.context)
                        .inflate(R.layout.header_layout, parent, false)
                return HeaderHolder(itemView)
            }

            NORMAL -> {
                itemView = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_layout, parent, false)
                return PostHolder(itemView)
            }

            else -> {
                itemView = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_layout, parent, false)
                return PostHolder(itemView)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (getItemViewType(position)) {

            HEADING -> {
                (holder as HeaderHolder).heading.text = items[position].dayOrTitle
                holder.date.text = items[position].date
            }

            NORMAL -> {
                (holder as PostHolder).subheading.text = items[position].subHeading
                 holder.time.text = items[position].time
                 holder.location.text = items[position].location
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        //Set the view according to the data type
        return if (items[position].type!! == 1) HEADING else NORMAL
    }

    override fun getHeaderPositionForItem(itemPosition: Int): Int {
        var itemOne = itemPosition
        var headerPosition = 0
        do {
            if (this.isHeader(itemOne)) {
                headerPosition = itemOne
                break
            }
            itemOne -= 1
        } while (itemOne >= 0)
        return headerPosition
    }

    override fun getHeaderLayout(headerPosition: Int): Int {
        return if (items[headerPosition].type == 1)
            R.layout.header_layout
        else {

            //Use different layout if any other title view
            R.layout.header_layout
        }
    }

    override fun bindHeaderData(header: View, headerPosition: Int) {
        header.title?.text = items[headerPosition].dayOrTitle
        header.date?.text = items[headerPosition].date
    }

    override fun isHeader(itemPosition: Int): Boolean {
        return items[itemPosition].type == 1 || items[itemPosition].type == 1
    }

    class PostHolder(view: View) : RecyclerView.ViewHolder(view){
        val subheading = view.textView!!
        val time = view.textView2!!
        val location = view.textView3!!
    }

    class HeaderHolder(view: View) : RecyclerView.ViewHolder(view){
        val heading = view.title!!
        val date = view.date!!
    }
}