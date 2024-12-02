package com.chev.dicodingeventapp.ui.screen.detail

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chev.dicodingeventapp.ui.components.buttons.RegisterButton
import com.chev.dicodingeventapp.ui.components.event_information.EventDetailImage
import com.chev.dicodingeventapp.ui.components.event_information.EventOverview
import com.chev.dicodingeventapp.ui.components.event_information.EventSummary
import com.chev.dicodingeventapp.ui.theme.DicodingEventAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(20.dp)
        ){
            EventDetailImage()

            Spacer(modifier = Modifier.padding(12.dp))

            EventSummary()

            Spacer(modifier = Modifier.padding(12.dp))

            EventOverview()

            Spacer(modifier = Modifier.weight(1f))

            RegisterButton()
        }
    }
}

@Preview
@Composable
private fun DetailScreenPreview() {
    DicodingEventAppTheme {
        DetailsScreen()
    }
}