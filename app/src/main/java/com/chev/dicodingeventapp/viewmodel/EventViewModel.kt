package com.chev.dicodingeventapp.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chev.dicodingeventapp.data.api.NetworkResponse
import com.chev.dicodingeventapp.data.dataclass.EventsModel
import com.chev.dicodingeventapp.data.repository.EventRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventViewModel @Inject constructor(
    private val repository: EventRepository
) : ViewModel() {

    private val _event = mutableStateOf<NetworkResponse<List<EventsModel>>>(NetworkResponse.Loading)
    val event: State<NetworkResponse<List<EventsModel>>> = _event

    init {
        fetchEvents()
    }

    private fun fetchEvents() {
        viewModelScope.launch {
            _event.value = NetworkResponse.Loading

            try {
                val response = repository.getEvents()

                if (response.isSuccessful && response.body() != null) {
                    _event.value = NetworkResponse.Success(response.body()!!)
                } else {
                    _event.value = NetworkResponse.Error("Error: ${response.message()}")
                }
            } catch (e: Exception) {
                _event.value = NetworkResponse.Error("Exception: ${e.message}")
            }
        }
    }
}

