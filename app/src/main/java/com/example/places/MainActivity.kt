package com.example.places

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import androidx.recyclerview.widget.GridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var gridView: GridView
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        val users = ArrayList<User>()
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        users.add(User("https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        users.add(User("https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))




        userAdapter = UserAdapter(this, users)


        gridView.adapter = userAdapter
    }

}