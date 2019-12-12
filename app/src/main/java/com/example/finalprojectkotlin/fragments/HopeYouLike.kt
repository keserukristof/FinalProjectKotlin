package com.example.finalprojectkotlin.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.example.finalprojectkotlin.R
import com.example.finalprojectkotlin.databinding.FragmentAboutMeeBinding
import com.example.finalprojectkotlin.databinding.FragmentHopeYouLikeBinding

/**
 * A simple [Fragment] subclass.
 */
class HopeYouLike : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentHopeYouLikeBinding>(inflater,
            R.layout.fragment_hope_you_like,container,false)
        return binding.root
    }
    
}
