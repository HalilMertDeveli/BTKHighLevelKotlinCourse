package com.atilsamancioglu.besinlerkitabigradlework.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atilsamancioglu.besinlerkitabigradlework.R
import com.atilsamancioglu.besinlerkitabigradlework.model.Food
import kotlinx.android.synthetic.main.food_recycler_row.view.*
import java.util.zip.Inflater


class FoodRecyclerAdaptor(val foodList : ArrayList<Food>) : RecyclerView.Adapter<FoodRecyclerAdaptor.FoodViewHolder>() {
    class FoodViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.food_recycler_row,parent,false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.itemView.foodNameInFoodList.text = foodList[position].foodName //recycler row 'lar da ki field lar
        holder.itemView.foodCalorieInFoodList.text = foodList[position].foodCalorie
        //Image  view will be add
    }

    //we wrote this function for refreshing  food list data
    fun updateFoodList ( newFoodList : List<Food>) {
        foodList.clear()
        foodList.addAll(newFoodList)
        notifyDataSetChanged()
    }
}