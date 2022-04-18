package com.example.quizapp.domain.usecases.history

import com.example.quizapp.domain.repositories.history.GetHistoryRepositories
import javax.inject.Inject

class GetHistoryUseCase @Inject constructor(private val repository: GetHistoryRepositories) {

    operator fun invoke() = repository.getHistory()

}