package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    // Propertiess of all Categories available in Json file that we will get from meal-database api
    val idCategory : String,
    val strCategory: String,
    val strCategoryThumb : String,
    val strCategoryDescription: String
) : Parcelable

data class CategoriesResponse(
    val categories: List<Category> // "categories" is taken from the json file which contains a
                                    // list of "categories"
)
