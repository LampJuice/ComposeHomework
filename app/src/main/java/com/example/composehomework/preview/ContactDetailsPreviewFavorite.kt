package com.example.composehomework.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composehomework.Contact
import com.example.composehomework.ContactDetails

@Preview(showBackground = true)
@Composable
fun ContactDetailsPreviewFavorite() {
    ContactDetails(
        contact = Contact(
            name = "Иван",
            surname = "Иванович",
            familyName = "Петров",
            isFavorite = true,
            phone = "+7 978 85 58 222",
            address = "Москва, ул. Ленина, д. 10",
            email = "robert.houghwout.jackson@examplepetstore.com"
        )
    )
}