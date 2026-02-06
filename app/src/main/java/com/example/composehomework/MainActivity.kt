package com.example.composehomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactDetails(
                contact = Contact(
                    name = "Иван",
                    surname = "Иванович",
                    familyName = "Петров",
                    isFavorite = true,
                    phone = "+7 978 85 58 222",
                    address = "Москва, ул. Ленина, д. 10",
                    email = "james.c.mcreynolds@example-pet-store.com"
                )
            )
        }

    }
}