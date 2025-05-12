package com.learning.retrofitmvvm.repository

import android.util.Log
import com.learning.retrofitmvvm.service.network.APIService
import com.learning.retrofitmvvm.service.network.RetrofitInstance

class PostRepository {
    val apiService = RetrofitInstance.getInstance().create(APIService::class.java)

    suspend fun getAllPost(){
        try {
            val response = apiService.getAllPost()
            if(response.isSuccessful && response.body() != null){

            }
            else{
                Log.e("ResponseError", "Something Went Wrong !!!. ${response.errorBody().toString()}")
            }
        }catch (e : Exception){
            Log.e("Error", e.message.toString())
        }
    }
}