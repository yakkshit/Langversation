package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.models.UserDetails
import com.cedzlabs.langversation.domain.repository.UserDetailsRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class SaveUserDetailsUseCase(private val userDetailsRepository: UserDetailsRepository) {
    suspend fun execute(userDetails: UserDetails): Flow<Response<Boolean>> {
        return userDetailsRepository.save(userDetails = userDetails)
    }
}