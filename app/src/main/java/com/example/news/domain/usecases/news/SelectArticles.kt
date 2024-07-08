package com.example.news.domain.usecases.news

import com.example.news.data.local.NewsDao
import com.example.news.domain.model.Article
import com.example.news.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SelectArticles(private val newsRepository: NewsRepository) {

    operator fun invoke(): Flow<List<Article>> {
        return newsRepository.selectArticle()
    }
}