package com.example.blogcat.data.model

data class Post(
    //@Exclude @JvmField
    //var id: String = "",
    //@ServerTimestamp
    //var created_at: Date? = null,
    val post_image: String = "",
    val profile_picture: String = "",
    val post_description: String = "",
    //val poster: Poster? = null,
    //val likes: Long = 0,
    //@Exclude @JvmField
    //var liked: Boolean = false)
)