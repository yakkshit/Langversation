package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.UserImagesRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class SaveUserImageProfileUseCase(private val userImagesRepository: UserImagesRepository) {
    suspend fun execute(newImageUriStr: String): Flow<Response<String>> {
        return userImagesRepository.saveImageProfile(newImageUriStr = newImageUriStr)
    }
}