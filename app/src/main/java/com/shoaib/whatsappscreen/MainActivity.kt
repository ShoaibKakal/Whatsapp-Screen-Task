package com.shoaib.whatsappscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.shoaib.whatsappscreen.adapters.UserItemAdapter
import com.shoaib.whatsappscreen.models.UserModel

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val userList = ArrayList<UserModel>()

        userList.add(UserModel(R.drawable.image_1, "Umair Ghora", "Hello! Ghora speaking.", "3:50 pm", "3"))
        userList.add(UserModel(R.drawable.image_2, "Faizan", "Vro CG ka scope ha", "Yesterday", "8"))
        userList.add(UserModel(R.drawable.image_3, "Saad", "khikhikhi", "20/2/2021", "2"))
        userList.add(UserModel(R.drawable.image_4, "Ali", "lorum ipsumm text", "12/3/2021", "6"))
        userList.add(UserModel(R.drawable.image_5, "Aamish", "Okay", "11/3/2021", "9+"))
        userList.add(UserModel(R.drawable.image_6, "Arslan", "Hello peter", "4/3/2021", "1"))
        userList.add(UserModel(R.drawable.image_1, "Umair Ghora", "Hello! Ghora speaking.", "3:50 pm", "3"))
        userList.add(UserModel(R.drawable.image_2, "Faizan", "Vro CG ka scope ha", "Yesterday", "8"))
        userList.add(UserModel(R.drawable.image_3, "Saad", "khikhikhi", "20/2/2021", "2"))
        userList.add(UserModel(R.drawable.image_4, "Ali", "lorum ipsumm text", "12/3/2021", "6"))
        userList.add(UserModel(R.drawable.image_5, "Aamish", "Okay", "11/3/2021", "9+"))
        userList.add(UserModel(R.drawable.image_6, "Arslan", "Hello peter", "4/3/2021", "1"))
        userList.add(UserModel(R.drawable.image_1, "Umair Ghora", "Hello! Ghora speaking.", "3:50 pm", "3"))
        userList.add(UserModel(R.drawable.image_2, "Faizan", "Vro CG ka scope ha", "Yesterday", "8"))
        userList.add(UserModel(R.drawable.image_3, "Saad", "khikhikhi", "20/2/2021", "2"))
        userList.add(UserModel(R.drawable.image_4, "Ali", "lorum ipsumm text", "12/3/2021", "6"))
        userList.add(UserModel(R.drawable.image_5, "Aamish", "Okay", "11/3/2021", "9+"))
        userList.add(UserModel(R.drawable.image_6, "Arslan", "Hello peter", "4/3/2021", "1"))


        val userItemAdapter = UserItemAdapter(userList)
        recyclerView.adapter = userItemAdapter
    }
}