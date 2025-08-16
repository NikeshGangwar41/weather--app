package com.example.weatherapp.api

// T refers to the type of data we expect to receive from the API
sealed class NetworkResponse<out  T> {
    data class Success<out T>(val data: T) : NetworkResponse<T>()
    data class Error(val message: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}