package com.chev.dicodingeventapp.ui.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chev.dicodingeventapp.R

@Composable
fun EventCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.img_event),
                contentDescription = "Event Image",
                modifier = Modifier
                    .size(80.dp)
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ){
                Text(text = "Event Title", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text(text = "This is Content of Dicoding Event App. It can fit until 2 Lines", fontSize = 10.sp)
            }
        }
    }
}