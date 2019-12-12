package com.example.finalprojectkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.finalprojectkotlin.databinding.AboutMeBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: AboutMeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.about_me)
    }
}
