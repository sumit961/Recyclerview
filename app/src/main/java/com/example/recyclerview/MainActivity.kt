package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var nameList: MutableList<MyModel> = mutableListOf()
    private lateinit var sampleAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load sample data
        loadData()

        // Initialize the adapter
        sampleAdapter = MyAdapter(nameList)

        // Set up RecyclerView
        binding.rvMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = sampleAdapter
        }
    }

    // Function to load sample data into nameList
    private fun loadData() {
        nameList.add(MyModel(1, "name"))
        nameList.add(MyModel(2, "apple "))
        nameList.add(MyModel(3, "banana"))
        nameList.add(MyModel(4, "orange"))
        nameList.add(MyModel(5, "kiwi"))
        nameList.add(MyModel(6, "mango"))
    }
}
