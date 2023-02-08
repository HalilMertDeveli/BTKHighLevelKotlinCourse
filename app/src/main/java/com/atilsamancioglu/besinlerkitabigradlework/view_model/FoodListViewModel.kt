package com.atilsamancioglu.besinlerkitabigradlework.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.atilsamancioglu.besinlerkitabigradlework.model.Food

class FoodListViewModel : ViewModel() {

    private val foods = MutableLiveData<List<Food>>()
    private val foodErrorMessage = MutableLiveData<Boolean>()
    private val foodIsLoading = MutableLiveData<Boolean>()

    fun refreshData() {
        val banana = Food("Banana", "12", "15", "10", "2", "www.test.com")
        val strawberry = Food("strawberry", "200", "21", "22", "2", "www.test.com")
        val cucumber = Food("cucumber", "300", "30", "31", "3", "www.test.com")

        val foodArrayListOf = arrayListOf<Food>(banana, strawberry, cucumber)

        foods.value = foodArrayListOf
        foodErrorMessage.value = false
        foodIsLoading.value = false
    }
}