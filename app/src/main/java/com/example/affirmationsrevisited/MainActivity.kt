package com.example.affirmationsrevisited

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationsrevisited.adapter.item_adapter
import com.example.affirmationsrevisited.data.Dataclass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Dataclass().loadAffirmation()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = item_adapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}