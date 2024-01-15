package com.example.quotes.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.quotes.models.Quote

@Composable
fun QuoteListScreen(data: ArrayList<Quote>, onClick: (quote: Quote)-> Unit) {
    Column {
        Text (
            modifier = Modifier.fillMaxWidth(1f),
            text = "Quotes App",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall)

        QuoteList(data = data, onClick)
    }
}