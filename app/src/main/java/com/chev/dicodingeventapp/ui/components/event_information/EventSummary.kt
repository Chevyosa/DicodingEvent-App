package com.chev.dicodingeventapp.ui.components.event_information

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chev.dicodingeventapp.R

@Composable
fun EventSummary() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Event Title", fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = "Event Owner", fontWeight = FontWeight.Medium, fontSize = 16.sp)
        Spacer(modifier = Modifier.padding(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Row {
                Image(painter = painterResource(id = R.drawable.ic_event_time), contentDescription = "Event Time")
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
                Text(text = "09.00")
            }
            Spacer(modifier = Modifier.padding(horizontal = 12.dp))
            Row {
                Image(painter = painterResource(id = R.drawable.ic_event_quota), contentDescription = "Event Quota")
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
                Text(text = "200 Left")
            }
        }
    }
}