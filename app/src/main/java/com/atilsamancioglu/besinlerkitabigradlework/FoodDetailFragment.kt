package com.atilsamancioglu.besinlerkitabigradlework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_food_detail.*


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

        foodDetailToFoodListFragment.setOnClickListener {
            val root = FoodDetailFragmentDirections.actionFoodDetailFragmentToFoodListFragment()
            Navigation.findNavController(it).navigate(root)
        }


        super.onViewCreated(view, savedInstanceState)
    }


}