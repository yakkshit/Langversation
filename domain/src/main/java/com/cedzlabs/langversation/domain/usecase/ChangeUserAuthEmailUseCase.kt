package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.models.UserAuth
import com.cedzlabs.langversation.domain.repository.UserAuthRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class ChangeUserAuthEmailUseCase(private val userAuthRepository: UserAuthRepository) {
    suspend fun execute(userAuth: UserAuth, newEmail: String): Flow<Response<Boolean>> {
        return userAuthRepository.changeEmail(userAuth = userAuth, newEmail = newEmail)
    }
}