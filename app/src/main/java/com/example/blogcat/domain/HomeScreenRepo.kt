package com.example.blogcat.domain

import com.example.blogcat.core.Resource
import com.example.blogcat.data.model.Post

interface HomeScreenRepo {
    suspend fun getLatestPosts(): Resource<List<Post>>
}