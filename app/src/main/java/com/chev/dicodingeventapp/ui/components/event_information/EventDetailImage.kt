package com.chev.dicodingeventapp.ui.components.event_information

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.chev.dicodingeventapp.R

@Composable
fun EventDetailImage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .size(
                height = 250.dp,
                width = 400.dp
            )
            .clip(RoundedCornerShape(8.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(painter = painterResource(id = R.drawable.img_event), contentDescription = "Event Image")
    }
}