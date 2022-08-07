package com.gyanishi.repositories.domain

import com.gyanishi.repositories.core.UseCase
import com.gyanishi.repositories.data.model.Repo
import com.gyanishi.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository): UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}
