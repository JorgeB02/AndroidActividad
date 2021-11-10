package com.example.recycleviewactividad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    private lateinit var adapte : UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvUser:RecyclerView = findViewById(R.id.rv_user)


        val app = (application as App)
        val users = app.users

        val arrayRepos = Gson().fromJson(RecyclerFakeData.repositoriesJson, Array<ResultResponser>::class.java)

        users.addAll(arrayRepos.toUser())
        adapte = UserAdapter(users)

        rvUser.adapter = adapte
        val layaoutRv = LinearLayoutManager(this)
        rvUser.layoutManager = layaoutRv
    }
}