package com.example.myapplication.mvvm.domain

import com.example.myapplication.mvvm.domain.models.User

interface UsersRepository {
    fun getUsers(): List<User>
}