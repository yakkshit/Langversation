package com.cedzlabs.langversation.data.repository

import com.cedzlabs.langversation.data.storage.UserImagesStorage
import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.UserImagesRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class UserImagesRepositoryImpl(private val userImagesStorage: UserImagesStorage) :
    UserImagesRepository {
    override suspend fun saveImageProfile(newImageUriStr: String): Flow<Response<String>> {
        return userImagesStorage.saveImageProfile(newImageUriStr = newImageUriStr)
    }

    override suspend fun deleteImageProfile(): Flow<Response<Boolean>> {
        return userImagesStorage.deleteImageProfile()
    }
}