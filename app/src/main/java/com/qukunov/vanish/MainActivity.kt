package com.qukunov.vanish

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.qukunov.vanish.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.delete.setOnClickListener {
            main()
        }


    }

    fun main() {
        val filePath = "example.txt" // Replace with the path to your file


        val file = File(filePath)
        val result = file.delete()

        if (result) {
            println("File deleted successfully.")
        } else {
            println("Error occurred while deleting the file or file does not exist.")
        }
    }
}