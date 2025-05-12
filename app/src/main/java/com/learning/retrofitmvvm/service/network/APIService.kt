package com.learning.retrofitmvvm.service.network

import com.learning.retrofitmvvm.util.END_POINT
import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET(END_POINT)
    fun getAllPost() : Response<>
}