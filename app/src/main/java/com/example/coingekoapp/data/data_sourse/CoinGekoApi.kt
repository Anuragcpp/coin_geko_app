package com.example.coingekoapp.data.data_sourse

import retrofit2.http.GET

interface CoinGekoApi {

    @GET("/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&sparkline=false")
    suspend fun getAllCoins()

}