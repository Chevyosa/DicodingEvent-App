package com.chev.dicodingeventapp.data.api

import com.chev.dicodingeventapp.data.dataclass.DetailsModel
import com.chev.dicodingeventapp.data.dataclass.EventsModel
import retrofit2.Response
import retrofit2.http.GET

interface DicodingEventAPI {
    @GET("events")
    suspend fun getEvents(): Response<List<EventsModel>>

    @GET("details")
    suspend fun getDetails(): List<DetailsModel>
}