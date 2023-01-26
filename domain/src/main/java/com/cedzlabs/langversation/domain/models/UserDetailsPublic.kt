package com.cedzlabs.langversation.domain.models

data class UserDetailsPublic(
    var uid: String = "",
    var fullname: String = "",
    var email: String = "",
    var photoProfileUrl: String = ""
)