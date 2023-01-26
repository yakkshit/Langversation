package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.Message
import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.MessageRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class GetLatestMessagesUseCase(private val messageRepository: MessageRepository) {
    suspend fun execute(fromUserUid: String): Flow<Response<ArrayList<Message>>> {
        return messageRepository.getLatestMessages(fromUserUid = fromUserUid)
    }
}