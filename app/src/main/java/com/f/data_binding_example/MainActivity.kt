package com.f.data_binding_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        Toast.makeText(this,"Clicked on item",Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MainAdapter(usersList(),this)
    }
    fun usersList() :List<User>
    {
        val usersList = ArrayList<User>()
        usersList.add(User("Bismah","61"))
        usersList.add(User("Tehreem","53"))
        usersList.add(User("Yawar","54.4"))
        return usersList
    }
}
