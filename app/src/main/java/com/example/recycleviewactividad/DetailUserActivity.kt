package com.example.recycleviewactividad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)
        val userID : String? = intent.extras?.getString("userId")

        if(userID == null){
            finish()
        }

  /*      var user: User? = null
        (application as App).users.forEach { forUser ->
            if (forUser.id == userID){
                user = forUser
                return@forEach
            }
        }
        if(user == null){
            finish()
        }


        val tvFirstName: TextView = findViewById(R.id.tv_firstname)
        val tvLastName: TextView = findViewById(R.id.tv_lastname)
        val ivAvatar: ImageView = findViewById(R.id.imageView3)


        tvFirstName.text = user?.firstName
        tvLastName.text = user?.lastName

        ivAvatar.imageFromUrl(user?.imageUrl!!)*/
    }
}