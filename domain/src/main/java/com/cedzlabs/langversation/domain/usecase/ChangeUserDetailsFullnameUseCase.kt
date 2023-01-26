package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.UserDetailsRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class ChangeUserDetailsFullnameUseCase(private val userDetailsRepository: UserDetailsRepository) {
    suspend fun execute(newFullname: String): Flow<Response<Boolean>> {
        return userDetailsRepository.changeFullname(newFullname = newFullname)
    }
}