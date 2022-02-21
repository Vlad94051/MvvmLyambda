package com.example.myapplication.mvvm.data

import com.example.myapplication.mvvm.domain.models.User
import com.example.myapplication.mvvm.domain.UsersRepository

object UsersRepositoryImpl: UsersRepository {
   private lateinit var usersList: List<User>

   override fun getUsers(): List<User> {
        return usersList
    }
}