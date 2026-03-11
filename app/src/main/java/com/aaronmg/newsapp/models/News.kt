package com.aaronmg.newsapp.models

import com.aaronmg.newsapp.R

data class NewsEntry(
    val titleRes: Int,
    val date: String
)

val newsList = listOf(
    NewsEntry(R.string.noticia1, "marzo 08 - 2026"),
    NewsEntry(R.string.noticia2, "marzo 10 - 2026"),
    NewsEntry(R.string.noticia3, "marzo 11 - 2026"),
    NewsEntry(R.string.noticia4, "marzo 11 - 2026")
)