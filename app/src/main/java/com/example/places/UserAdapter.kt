package com.example.places

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

class UserAdapter(context: Context, users: ArrayList<User>)
    : ArrayAdapter<User>(context, 0, users) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val user = getItem(position)

        val cv = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false)

        val profilePic = cv.findViewById(R.id.profilePic) as ImageView

        Glide.with(context)
            .load(user?.url)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(profilePic)


            return cv
    }
}