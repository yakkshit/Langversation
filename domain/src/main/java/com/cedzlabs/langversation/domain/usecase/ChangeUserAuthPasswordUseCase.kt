package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.models.UserAuth
import com.cedzlabs.langversation.domain.repository.UserAuthRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class ChangeUserAuthPasswordUseCase(private val userAuthRepository: UserAuthRepository) {
    suspend fun execute(userAuth: UserAuth, newPassword: String): Flow<Response<Boolean>> {
        return userAuthRepository.changePassword(userAuth = userAuth, newPassword = newPassword)
    }
}