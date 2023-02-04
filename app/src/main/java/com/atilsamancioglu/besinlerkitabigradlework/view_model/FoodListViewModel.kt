package com.atilsamancioglu.besinlerkitabigradlework.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.atilsamancioglu.besinlerkitabigradlework.model.Food

class FoodListViewModel: ViewModel() {

    val foods = MutableLiveData<List<Food>>()
    val foodErrorMessage = MutableLiveData<Boolean>()
    val foodIsLooading = MutableLiveData<Boolean>()
}