package com.example.myapplication.mvvm.domain

import com.example.myapplication.mvvm.domain.models.DomainUser

class UsersInteractorImpl(private val repository: UsersRepository) : UsersInteractor {

    override fun getUsers(): List<DomainUser> {
        return repository.getUsers().map { user ->
            DomainUser(
                name = user.name,
                secondName = user.name + "2"
            )
        }

    }
}