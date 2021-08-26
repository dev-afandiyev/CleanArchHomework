package com.example.cleanarchhomework.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanarchhomework.R
import com.example.cleanarchhomework.model.UserModel
import java.text.SimpleDateFormat
import java.util.*

class UsersAdapter : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

   private val usersList = mutableListOf<UserModel>()

    fun setList(userView: List<UserModel>) {
        usersList.clear()
        usersList.addAll(userView)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = usersList[position]

        holder.name.text = currentItem.name
        holder.surname.text = currentItem.surname

        val dateFormat = SimpleDateFormat("dd/MM/yyyy")
        val currentDate = dateFormat.format(Date().time)

        holder.date.text = currentDate
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val surname: TextView = itemView.findViewById(R.id.surname)
        val date: TextView = itemView.findViewById(R.id.date)
    }

}