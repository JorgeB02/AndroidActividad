package com.example.recycleviewactividad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class UserAdapter (
    private val repositorios: MutableList<User>
    ): RecyclerView.Adapter<UserAdapter.UserViewHolder>(){


    //que ocurre cuando se crea
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layaoutinflater = LayoutInflater.from(parent.context)
        val view : View = layaoutinflater.inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    class UserViewHolder(vista_item: View): RecyclerView.ViewHolder(vista_item){
        val tvUserName:TextView = vista_item.findViewById(R.id.name)
        val tvLastName:TextView = vista_item.findViewById(R.id.tv_desc)
        val ivAvatar: ImageView = vista_item.findViewById(R.id.iv_avatar)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       val user : User = repositorios[position]

        holder.tvUserName.text = user.name
        holder.tvLastName.text = user.description

        Picasso.get().load(user.avartarURL).placeholder(R.drawable.th).into(holder.ivAvatar)
    }

    //retornar cuantos repos hay a la funcion onBindViewHolder
    override fun getItemCount(): Int {
        return repositorios.size
    }
}