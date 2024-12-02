package com.chev.dicodingeventapp.ui.screen.finished

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
import com.chev.dicodingeventapp.ui.components.cards.EventCard
import com.chev.dicodingeventapp.ui.components.searchbar.EventSearchBar
import com.chev.dicodingeventapp.ui.theme.DicodingEventAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FinishedScreen() {

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

            EventSearchBar()

            Spacer(modifier = Modifier.padding(vertical = 12.dp))

            EventCard()
        }
    }
}

@Preview
@Composable
private fun FinishedScreenPreview() {
    DicodingEventAppTheme {
        FinishedScreen()
    }
}