package com.aaronmg.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaronmg.newsapp.models.NewsEntry
import com.aaronmg.newsapp.models.newsList
import com.aaronmg.newsapp.ui.theme.NewsAppTheme

@Composable
fun NewsItem(news: NewsEntry) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(200.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Blue)
            .padding(20.dp)
            .padding(top = 20.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(id = news.titleRes),
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.White
            )
            Text(
                text = news.date,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color.White
            )
        }
    }
}

@Preview()
@Composable
fun NewsItemPreview(){
    NewsAppTheme() {
        NewsItem(
            newsList[2]
        )
    }
}