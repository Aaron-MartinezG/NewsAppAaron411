package com.aaronmg.newsapp.models

import com.aaronmg.newsapp.R

data class NewsEntry(
    val titleRes: Int,
    val date: String,
    val img: String
)

val newsList = listOf(
    NewsEntry(R.string.noticia1, "marzo 08 - 2026", "https://ichef.bbci.co.uk/ace/ws/640/cpsprodpb/4530/live/9c595130-bff4-11f0-8e9b-27a91d3b730a.jpg.webp"),
    NewsEntry(R.string.noticia2, "marzo 10 - 2026", "https://static.wikia.nocookie.net/amor-de-otro-mundo/images/b/b0/Cleopatra.png/revision/latest/thumbnail/width/360/height/360?cb=20221211124811&path-prefix=es"),
    NewsEntry(R.string.noticia3, "marzo 11 - 2026", "https://play-lh.googleusercontent.com/d2zqBFBEymSZKaVg_dRo1gh3hBFn7_Kl9rO74xkDmnJeLgDW0MoJD3cUx0QzZN6jdsg=w240-h480-rw"),
    NewsEntry(R.string.noticia4, "marzo 11 - 2026", "https://static.wikia.nocookie.net/astronomia/images/3/3d/Marte.jpg/revision/latest?cb=20181127012016")
)