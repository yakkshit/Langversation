package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.FromToUser
import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.MessageRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class DeleteDialogBothUsersUseCase(private val messageRepository: MessageRepository) {
    suspend fun execute(fromToUser: FromToUser): Flow<Response<Boolean>> {
        return messageRepository.deleteDialogBothUsers(fromToUser = fromToUser)
    }
}