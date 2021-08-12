package com.roes.randomluckcalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.roes.randomluckcalculator.databinding.FragmentCalculationBinding


class CalculationFragment : Fragment() {

    private lateinit var binding: FragmentCalculationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_calculation, container, false)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_calculation, container, false)


        binding.button.setOnClickListener() {
            
        }

        return binding.root

    }

}