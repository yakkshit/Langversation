package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.UserDetailsRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class ChangeUserDetailsPasswordUseCase(private val userDetailsRepository: UserDetailsRepository) {
    suspend fun execute(newPassword: String): Flow<Response<Boolean>> {
        return userDetailsRepository.changePassword(newPassword = newPassword)
    }
}