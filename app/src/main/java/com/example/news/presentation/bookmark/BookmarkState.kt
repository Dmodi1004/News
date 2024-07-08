package com.example.news.presentation.bookmark

import com.example.news.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)
