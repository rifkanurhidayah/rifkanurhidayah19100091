package com.informatika19100091.databarang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.informatika19100091.databarang.model.ResponseItem
import com.informatika19100091.databarang.model.network.koneksi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        koneksi.service.getData().enqueue(object : Callback<List<ResponseItem?>?>{
            override fun onResponse(
                call: Call<List<ResponseItem?>?>,
                response: Response<List<ResponseItem?>?>
            ) {
                if (response.isSuccessful){
                    Log.d("pesan", response.body().toString())
                }
            }

            override fun onFailure(call: Call<List<ResponseItem?>?>, t: Throwable) {
               Log.d("pesan1",  t.localizedMessage)
            }
        })
    }
}