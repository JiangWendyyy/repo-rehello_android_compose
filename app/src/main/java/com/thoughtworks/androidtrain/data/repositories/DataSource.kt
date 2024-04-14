package com.thoughtworks.androidtrain.data.repositories

import androidx.lifecycle.LiveData
import com.thoughtworks.androidtrain.model.entity.Tweet
import kotlinx.coroutines.flow.Flow


interface DataSource {
    fun fetchTweets(): Flow<List<Tweet>>
}