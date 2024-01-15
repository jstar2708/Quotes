package com.example.quotes

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.quotes.models.Quote

object DataManager {

    var data : ArrayList<Quote> = ArrayList()
    var currentPage = mutableStateOf(Pages.LISTING)
    var isDataLoaded = mutableStateOf(false)
    var currentQuote: Quote? = null

    fun switchPages(quote: Quote?) {
        currentQuote = quote
        if (currentPage.value == Pages.LISTING) {
            currentPage.value = Pages.DETAIL
        }
        else {
            currentPage.value = Pages.LISTING
        }
    }

    fun loadData() {
        val list = ArrayList<Quote>()
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        list.add(
            Quote(
                "If you are going through hell, keep going.",
                "Winston Churchill"
            )
        )
        data.clear()
        data.addAll(list)
        isDataLoaded.value = true
    }
}

enum class Pages {
    LISTING, DETAIL
}