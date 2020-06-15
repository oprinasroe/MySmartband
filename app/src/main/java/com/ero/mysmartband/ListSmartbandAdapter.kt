package com.ero.mysmartband

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list.view.*

class ListSmartbandAdapter(private val mContext: Context, private val listsb: ArrayList<Smartband>) :
    RecyclerView.Adapter<ListSmartbandAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: MainActivity) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(listsb: Smartband) {
            with(itemView) {
                Glide.with(context).load(listsb.foto).into(imageList)
                list_textName.text = listsb.nama
                list_textHarga.text = listsb.harga

                itemView.setOnClickListener {
                    val intent = Intent(mContext, DetailActivity::class.java)
                    intent.putExtra("NAMA", listsb.nama)
                    intent.putExtra("BATERAI", listsb.baterai)
                    intent.putExtra("DESKRIPSI", listsb.deskripsi)
                    intent.putExtra("DISPLAY", listsb.display)
                    intent.putExtra("FITUR", listsb.fitur)
                    intent.putExtra("FOTO", listsb.foto)
                    intent.putExtra("HARGA", listsb.harga)
                    intent.putExtra("LINK", listsb.link)

                    mContext.startActivity(intent)
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listsb.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listsb[position])
    }

    interface OnItemClickCallback {
        fun onItemClicked(listsb: Smartband)
    }

}