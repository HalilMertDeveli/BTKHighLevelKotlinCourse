package com.atilsamancioglu.besinlerkitabigradlework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_food_list.*


class FoodListFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        foodListToFoodDetailButton.setOnClickListener {
            val root = FoodListFragmentDirections.actionFoodListFragmentToFoodDetailFragment(2)
            Navigation.findNavController(it).navigate(root)

        }

        super.onViewCreated(view, savedInstanceState)
    }


}