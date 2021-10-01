package com.shoaib.whatsappscreen.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shoaib.whatsappscreen.R
import com.shoaib.whatsappscreen.models.UserModel

class UserItemAdapter(val userList: ArrayList<UserModel>) : RecyclerView.Adapter<UserItemAdapter.ItemMessage>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMessage {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user_message_layout, parent, false)
        return ItemMessage(view)
    }

    override fun onBindViewHolder(holder: ItemMessage, position: Int) {
        holder.bindData(userList[position])
    }

    override fun getItemCount(): Int {
        Log.d("TestTag", "getItemCount: ${userList.size}")
        return userList.size
    }

    class ItemMessage(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.profile_image)
        val userName = view.findViewById<TextView>(R.id.tv_userName)
        val message = view.findViewById<TextView>(R.id.tv_message)
        val date = view.findViewById<TextView>(R.id.tv_date)
        val mesgCount = view.findViewById<TextView>(R.id.tv_msgCount)


        fun bindData(userModel: UserModel)
        {
            Log.d("TestTag", "getItemCount: Called")

            image.setImageResource(userModel.image)
            userName.text = userModel.name
            message.text = userModel.message
            date.text = userModel.date
            mesgCount.text = userModel.msgCount
        }
    }

}