package com.chev.dicodingeventapp.ui.screen.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.chev.dicodingeventapp.data.api.NetworkResponse
import com.chev.dicodingeventapp.viewmodel.EventViewModel

@Composable
fun HomeScreen(viewModel: EventViewModel = hiltViewModel()) {
    val eventState = viewModel.event.value

    when (eventState) {
        is NetworkResponse.Loading -> {
            CircularProgressIndicator()
        }
        is NetworkResponse.Success -> {
            LazyColumn {
                items(eventState.data) { event ->
                    Text(event.name)
                }
            }
        }
        is NetworkResponse.Error -> {
            Text("Error: ${eventState.message}")
        }
    }
}
