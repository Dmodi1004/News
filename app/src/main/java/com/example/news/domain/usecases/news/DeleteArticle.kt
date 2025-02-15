package com.example.news.domain.usecases.news

import com.example.news.data.local.NewsDao
import com.example.news.domain.model.Article
import com.example.news.domain.repository.NewsRepository

class DeleteArticle(private val newsRepository: NewsRepository) {

    suspend operator fun invoke(article: Article) {
        newsRepository.deleteArticle(article)
    }
}