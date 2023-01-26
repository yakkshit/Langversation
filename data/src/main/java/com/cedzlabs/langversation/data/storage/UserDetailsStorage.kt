package com.cedzlabs.langversation.data.storage

import com.cedzlabs.langversation.domain.models.Response
import com.cedzlabs.langversation.domain.models.UserDetails
import com.cedzlabs.langversation.domain.models.UserDetailsPublic
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
interface UserDetailsStorage {
    suspend fun save(userDetails: UserDetails): Flow<Response<Boolean>>

    suspend fun getCurrentUser(): Flow<Response<UserDetails>>

    suspend fun deleteCurrentUser(): Flow<Response<Boolean>>

    suspend fun changeImageProfileUri(newImageUriStr: String): Flow<Response<Boolean>>

    suspend fun changeFullname(newFullname: String): Flow<Response<Boolean>>

    suspend fun changeEmailAddress(newEmail: String): Flow<Response<Boolean>>

    suspend fun changePassword(newPassword: String): Flow<Response<Boolean>>

    suspend fun getUsersList(): Flow<Response<ArrayList<UserDetailsPublic>>>

    suspend fun getUserDetailsPublicOnUid(uid: String): Flow<Response<UserDetailsPublic>>
}