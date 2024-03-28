package com.example.newsapp.data.remote.dataToObject

import com.example.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)