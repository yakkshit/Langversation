package com.cedzlabs.langversation.domain.usecase

import com.cedzlabs.langversation.domain.models.FromToUser
import com.cedzlabs.langversation.domain.models.Message
import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.repository.MessageRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
class ListenFromToUserMessagesUseCase(private val messageRepository: MessageRepository) {
    suspend fun execute(fromToUser: FromToUser): Flow<Response<Message>> {
        return messageRepository.listenFromToUserMessages(fromToUser = fromToUser)
    }
}