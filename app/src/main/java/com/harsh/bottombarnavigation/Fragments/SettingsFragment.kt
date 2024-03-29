package com.harsh.bottombarnavigation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.harsh.bottombarnavigation.R
import com.harsh.bottombarnavigation.databinding.FragmentHomeBinding
import com.harsh.bottombarnavigation.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
 lateinit var binding: FragmentSettingsBinding
 override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     binding = FragmentSettingsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

    }
}