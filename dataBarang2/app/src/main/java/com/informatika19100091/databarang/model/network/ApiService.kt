package com.informatika19100091.databarang.model.network

import android.telecom.Call
import com.informatika19100091.databarang.model.ResponseItem
import retrofit2.http.GET


interface ApiService {
    @GET("users")
    fun getData() : retrofit2.Call<List<ResponseItem?>?>
}