package com.cedzlabs.langversation.data.repository

import com.cedzlabs.langversation.data.storage.TranslateStorage
import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.TranslateRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class TranslateRepositoryImpl(private val translateStorage: TranslateStorage) :
    TranslateRepository {
    override suspend fun downloadLangRussianEnglishPack(): Flow<Response<Boolean>> {
        return translateStorage.downloadLangRussianEnglishPack()
    }

    override suspend fun translateRussianEnglishText(text: String): Flow<Response<String>> {
        return translateStorage.translateRussianEnglishText(text = text)
    }

    override suspend fun translateEnglishRussianText(text: String): Flow<Response<String>> {
        return translateStorage.translateEnglishRussianText(text = text)
    }

    override suspend fun languageIdentifier(text: String): Flow<Response<String>> {
        return translateStorage.languageIndentifier(text = text)
    }
}