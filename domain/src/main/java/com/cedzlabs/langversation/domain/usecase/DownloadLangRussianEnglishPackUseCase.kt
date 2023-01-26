package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.TranslateRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class DownloadLangRussianEnglishPackUseCase(private val translateRepository: TranslateRepository) {
    suspend fun execute(): Flow<Response<Boolean>> {
        return translateRepository.downloadLangRussianEnglishPack()
    }
}