package com.cedzlabs.langversation.data.storage

import com.cedzlabs.langversation.domain.models.FromToUser
import com.cedzlabs.langversation.domain.models.Message
import com.cedzlabs.langversation.domain.models.Response
import kotlinx.coroutines.flow.Flow

interface MessageStorage {
    suspend fun save(message: Message): Flow<Response<Boolean>>

    suspend fun saveLatestMessage(message: Message): Flow<Response<Boolean>>

    suspend fun listenFromToUserMessages(fromToUser: FromToUser): Flow<Response<Message>>

    suspend fun deleteDialogBothUsers(fromToUser: FromToUser): Flow<Response<Boolean>>

    suspend fun deleteLatestMessageBothUsers(fromToUser: FromToUser): Flow<Response<Boolean>>

    suspend fun getLatestMessages(fromUserUid: String): Flow<Response<ArrayList<Message>>>
}