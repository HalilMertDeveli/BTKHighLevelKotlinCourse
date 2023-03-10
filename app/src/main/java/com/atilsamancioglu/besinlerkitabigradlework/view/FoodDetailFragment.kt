package com.atilsamancioglu.besinlerkitabigradlework.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.atilsamancioglu.besinlerkitabigradlework.R


class FoodDetailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food_detail, container, false)
    }
    var argumentValue =0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            argumentValue= FoodDetailFragmentArgs.fromBundle(it).foodId
            println("Food Id is $argumentValue")
        }




        super.onViewCreated(view, savedInstanceState)
    }


}