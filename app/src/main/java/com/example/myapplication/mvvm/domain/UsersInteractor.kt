package com.example.myapplication.mvvm.domain

import com.example.myapplication.mvvm.domain.models.DomainUser

interface UsersInteractor {
    fun getUsers(): List<DomainUser>
}