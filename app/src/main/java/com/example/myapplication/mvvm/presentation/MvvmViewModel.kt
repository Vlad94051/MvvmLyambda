package com.example.myapplication.mvvm.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.mvvm.data.UsersRepositoryImpl
import com.example.myapplication.mvvm.domain.UsersInteractor
import com.example.myapplication.mvvm.domain.UsersInteractorImpl
import com.example.myapplication.mvvm.domain.UsersRepository
import com.example.myapplication.mvvm.domain.models.DomainUser

class MvvmViewModel() : ViewModel() {

    init {
        loadUsers()
    }

    val usersLiveData: LiveData<List<DomainUser>> get() = _usersLiveData
    private val _usersLiveData = MutableLiveData<List<DomainUser>>()

    private val repository: UsersRepository = UsersRepositoryImpl

    private val interactor: UsersInteractor = UsersInteractorImpl(
        repository = repository
    )

    private fun loadUsers() {
        _usersLiveData.value = interactor.getUsers()
    }
}