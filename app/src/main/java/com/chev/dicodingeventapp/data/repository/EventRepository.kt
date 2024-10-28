package com.chev.dicodingeventapp.data.repository

import com.chev.dicodingeventapp.data.api.DicodingEventAPI
import com.chev.dicodingeventapp.data.dataclass.EventsModel
import retrofit2.Response
import javax.inject.Inject

class EventRepository @Inject constructor(private val dicodingEventAPI: DicodingEventAPI) {
    suspend fun getEvents(): Response<List<EventsModel>> {
        return dicodingEventAPI.getEvents()
    }
}
