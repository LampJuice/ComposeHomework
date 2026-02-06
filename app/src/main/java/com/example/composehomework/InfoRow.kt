package com.example.composehomework

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun InfoRow(title: String, value: String)  {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
        ,
        verticalAlignment = Alignment.CenterVertically

    ){
        Text(
            text = title,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.End,

            color = Color.Gray,
            fontStyle = FontStyle.Italic

        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = value,
            modifier = Modifier.weight(1f),
            fontWeight = FontWeight.Medium
        )
    }
}