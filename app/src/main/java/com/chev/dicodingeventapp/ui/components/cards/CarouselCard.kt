package com.chev.dicodingeventapp.ui.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chev.dicodingeventapp.R

@Composable
fun CarouselCard() {

    val events = listOf(
        "Event 1",
        "Event 2",
        "Event 3",
        "Event 4",
        "Event 5"
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {

        items(events.take(5)) { event ->
            Card(
                modifier = Modifier
                    .width(128.dp)
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .fillMaxWidth(),
                        painter = painterResource(id = R.drawable.img_event),
                        contentDescription = "Event Image"
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = event, fontSize = 12.sp)
                }
            }
        }
    }
}