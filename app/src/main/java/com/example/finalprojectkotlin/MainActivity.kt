package com.example.finalprojectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.finalprojectkotlin.databinding.ActivityMainBinding
import com.example.finalprojectkotlin.model.Author

class MainActivity : AppCompatActivity() {

    //Create binding object
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var author = Author()
        author.name = "Keserű Kristóf"
        author.neptun = "OO8RQV"
        binding.author = author

        val goToAboutMe : Button = findViewById(R.id.button_go_to_about_me)
        goToAboutMe.setOnClickListener {
            val intent = Intent(this, AboutActivity :: class.java)
            startActivity(intent)
        }
    }
}
