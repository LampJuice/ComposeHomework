package com.example.composehomework.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composehomework.Contact
import com.example.composehomework.ContactDetails
import com.example.composehomework.R

@Preview(showBackground = true)
@Composable
fun ContactDetailsPreviewWithPhoto() {
    ContactDetails(
        contact = Contact(
            name = "Ольга",
            familyName = "Парашютова",
            imageRes = R.drawable.avatar,
            phone = "+7 978 85 58 222",
            address = "Санкт-Петербург, ул. Вернадского, д. 5"
        )
    )
}