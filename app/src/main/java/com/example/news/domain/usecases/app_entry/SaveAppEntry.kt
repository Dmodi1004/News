package com.example.news.domain.usecases.app_entry

import com.example.news.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager,
) {

    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}