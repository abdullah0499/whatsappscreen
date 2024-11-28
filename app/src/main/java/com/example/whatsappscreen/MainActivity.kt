package com.example.whatsappscreen

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappscreen.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize RecyclerView
        val localTime = getCurrentTimeString()
        val userList = listOf(
            User(R.drawable.build, "Abdullah", "ok", localTime),
            User(R.drawable.user, "Umar", "ok", localTime),
            User(R.drawable.build, "Ahad", "ok", localTime),
            User(R.drawable.user, "Neatroots", "ok", localTime),
            User(R.drawable.build, "Bright", "ok", localTime),
            User(R.drawable.user, "Cheats", "ok", localTime),
            User(R.drawable.build, "Null", "ok", localTime),
            User(R.drawable.user, "Wahid", "ok", localTime),
            User(R.drawable.build, "Hamid", "ok", localTime),
            User(R.drawable.user, "Darussalam", "ok", localTime),
            User(R.drawable.build, "Ali", "ok", localTime),
            User(R.drawable.user, "Aamir", "ok", localTime),
            User(R.drawable.build, "Asim", "ok", localTime),
            User(R.drawable.user, "Any", "ok", localTime),
            User(R.drawable.build, "Other", "ok", localTime),
            User(R.drawable.user, "Waitor", "ok", localTime),
            User(R.drawable.build, "Groups", "ok", localTime)
        )
        adapter = RvAdapter(userList)
        binding.rv.adapter = adapter
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.setHasFixedSize(true)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.tab_chats -> {
                    Toast.makeText(this, "Chats Selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.tab_calls -> {
                    Toast.makeText(this, "Calls Selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.tab_updates -> {
                    Toast.makeText(this, "Updates Selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.tab_tools -> {
                    Toast.makeText(this, "Tools Selected", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        val allTextView: TextView = findViewById(R.id.all)
        allTextView.setOnClickListener {
            Toast.makeText(this, "All clicked", Toast.LENGTH_SHORT).show()
        }
        val unread: TextView = findViewById(R.id.unread)
        unread.setOnClickListener {
            Toast.makeText(this, "Unread clicked", Toast.LENGTH_SHORT).show()
        }
        val fav: TextView = findViewById(R.id.favourites)
        fav.setOnClickListener {
            Toast.makeText(this, "Favourits clicked", Toast.LENGTH_SHORT).show()
        }
        val grp: TextView = findViewById(R.id.Groups)
        grp.setOnClickListener {
            Toast.makeText(this, "Groups clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getCurrentTimeString(): String {
        val dateFormat = SimpleDateFormat("hh:mm a", Locale.getDefault())
        Log.d("Time", "getCurrentTimeString: ${"Time"}")
        return dateFormat.format(Date())
    }
}

