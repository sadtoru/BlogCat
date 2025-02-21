package com.example.blogcat.data.model

import com.google.firebase.Timestamp

data class Post(
    //@Exclude @JvmField
    //var id: String = "",
    //@ServerTimestamp
    //var created_at: Date? = null,
    val profile_picture: String = "",
    val profile_name: String = "",
    val post_timestamp: Timestamp? = null,
    val post_image: String = "",
    //val poster: Poster? = null,
    //val likes: Long = 0,
    //@Exclude @JvmField
    //var liked: Boolean = false)
)