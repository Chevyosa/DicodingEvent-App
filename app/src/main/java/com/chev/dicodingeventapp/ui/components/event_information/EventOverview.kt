package com.chev.dicodingeventapp.ui.components.event_information

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EventOverview() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        Text(text = "Event Overview", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)

        Spacer(modifier = Modifier.padding(8.dp))

        Text(text = "Event Description Here")
    }
}