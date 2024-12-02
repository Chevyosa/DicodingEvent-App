package com.chev.dicodingeventapp.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chev.dicodingeventapp.ui.components.cards.EventCard
import com.chev.dicodingeventapp.ui.theme.DicodingEventAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
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
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Text(
                    text = "Dicoding Event",
                    fontSize = 24.sp
                )
                Text(
                    text = "Recommended Events for You!",
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.padding(bottom = 12.dp))

            EventCard()
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    DicodingEventAppTheme {
        HomeScreen()
    }
}