package com.example.composehomework

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContactDetails(contact: Contact) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.weight(1f))

            ContactAvatar(contact = contact)

            Spacer(modifier = Modifier.weight(1f))

        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Text(
                text = buildString {
                    append(contact.name)
                    contact.surname?.let { append(" $it") }
                },
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )


        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Text(

                text = contact.familyName,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium
            )

            if (contact.isFavorite) {
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = painterResource(id = android.R.drawable.star_big_on),
                    contentDescription = null,
                    tint = Color.Yellow
                )


            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        InfoRow(
            title = stringResource(R.string.phone),
            value = contact.phone

        )

        InfoRow(
            title = stringResource(R.string.address),
            value = contact.address

        )
        contact.email?.let {
            InfoRow(
                title = stringResource(R.string.email),
                value = it
            )
        }

    }
}