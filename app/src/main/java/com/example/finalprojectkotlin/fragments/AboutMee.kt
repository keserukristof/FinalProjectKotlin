package com.example.finalprojectkotlin.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.example.finalprojectkotlin.R
import com.example.finalprojectkotlin.databinding.FragmentAboutMeeBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutMee : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutMeeBinding>(inflater,
            R.layout.fragment_about_mee,container,false)
        return binding.root
    }
}
