package com.gyanishi.repositories.data.services

import com.gyanishi.repositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user:String): List<Repo>
}