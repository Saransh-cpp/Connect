package com.example.connect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.connect.daos.PostDao
import kotlinx.android.synthetic.main.activity_create_post.*

class CreatePost : AppCompatActivity() {

    private lateinit var postDao: PostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postDao = PostDao()

        postButton.setOnClickListener {
            val input = postInput.text.toString().trim()
            if (input.isNotEmpty()) {
                postDao.addPost(input)
                finish()
            }
        }
    }
}