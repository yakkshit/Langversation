package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.UserAuthRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class RestoreUserByEmailUseCase(private val userAuthRepository: UserAuthRepository) {
    suspend fun execute(email: String): Flow<Response<Boolean>> {
        return userAuthRepository.restorePasswordByEmail(email = email)
    }
}