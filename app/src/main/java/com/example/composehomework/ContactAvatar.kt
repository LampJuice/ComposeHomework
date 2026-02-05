package com.example.composehomework

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContactAvatar(
    contact: Contact,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier.size(96.dp),
        contentAlignment = Alignment.Center
    ){
        if(contact.imageRes != null){
            Image(
                painter = painterResource(id = contact.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )


        } else{
            Icon(
                painter = painterResource(R.drawable.circle),
                contentDescription = null,
                tint = Color.LightGray,
                modifier = Modifier.fillMaxSize()

            )
            Text(
                text = "${contact.name.take(1)}${contact.familyName.take(1)}",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,

            )
        }
    }

}