package org.ferdyhaspin.sayur_manjur_compose.ui.common

/**
 * Created by ferdyhaspin on 22/12/22.
 */

sealed class UiState<out T: Any?> {

    object Loading : UiState<Nothing>()

    data class Success<out T: Any>(val data: T) : UiState<T>()

    data class Error(val errorMessage: String) : UiState<Nothing>()
}