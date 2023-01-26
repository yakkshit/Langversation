package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.models.UserDetailsPublic
import com.cedzlabs.langversation.domain.repository.UserDetailsRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class GetUsersListUseCase(private val userDetailsRepository: UserDetailsRepository) {
    suspend fun execute(): Flow<Response<ArrayList<UserDetailsPublic>>> {
        return userDetailsRepository.getUsersList()
    }
}