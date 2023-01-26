package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.models.UserDetailsPublic
import com.cedzlabs.langversation.domain.repository.UserDetailsRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class GetUserDetailsPublicOnUidUseCase(private val userDetailsRepository: UserDetailsRepository) {
    suspend fun execute(uid: String): Flow<Response<UserDetailsPublic>> {
        return userDetailsRepository.getUserDetailsPublicOnUid(uid = uid)
    }
}