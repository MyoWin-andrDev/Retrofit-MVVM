package com.learning.retrofitmvvm.service.network

import com.learning.retrofitmvvm.model.dto.response.ResponseItem
import com.learning.retrofitmvvm.util.GET_POST
import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET(GET_POST)
    fun getAllPost() : Response<List<ResponseItem>>
}