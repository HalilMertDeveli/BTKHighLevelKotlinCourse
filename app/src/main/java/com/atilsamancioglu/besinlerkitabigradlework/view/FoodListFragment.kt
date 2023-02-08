package com.atilsamancioglu.besinlerkitabigradlework.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.atilsamancioglu.besinlerkitabigradlework.R
import com.atilsamancioglu.besinlerkitabigradlework.adaptor.FoodRecyclerAdaptor
import com.atilsamancioglu.besinlerkitabigradlework.view_model.FoodListViewModel
import kotlinx.android.synthetic.main.fragment_food_list.*


class FoodListFragment : Fragment() {

    private lateinit var viewModel : FoodListViewModel
    private val recyclerFoodAdaptor = FoodRecyclerAdaptor(arrayListOf())


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
        viewModel = ViewModelProviders.of(this).get(FoodListViewModel::class.java)
        viewModel.refreshData()
        foodListRecyclerView.layoutManager= LinearLayoutManager(context)
        foodListRecyclerView.adapter= recyclerFoodAdaptor

        super.onViewCreated(view, savedInstanceState)
    }
    //we are using this method for watch Data
    fun observeLiveData(){

    }


}