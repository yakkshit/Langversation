package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.UserAuthRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class SignOutUserAuthUseCase(private val userAuthRepository: UserAuthRepository) {
    suspend fun execute(): Flow<Response<Boolean>> {
        return userAuthRepository.signOut()
    }
}