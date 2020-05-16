package com.cr7.bismillah.data

import retrofit2.Call
import retrofit2.http.GET

interface NextMatchService {
    @GET("eventss")
    fun getNextMatch(): Call<List<Event>>
}