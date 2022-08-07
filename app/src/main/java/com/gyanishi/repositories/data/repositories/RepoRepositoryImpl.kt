package com.gyanishi.repositories.data.repositories

import com.gyanishi.repositories.core.RemoteException
import com.gyanishi.repositories.data.services.GitHubServices
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val gitHubServices: GitHubServices): RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = gitHubServices.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possivel fazer a busca no momento!")
        }
    }
}