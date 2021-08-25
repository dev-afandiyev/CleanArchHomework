package com.example.cleanarchhomework.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.cleanarchhomework.model.UserModel
import com.example.cleanarchhomework.model.UsersRepository

class UserCreateViewModel(application: Application) : AndroidViewModel(application) {

    private val usersRepository: UsersRepository = UsersRepository(application)
    val insertUsersState: MutableLiveData<UserModel> = MutableLiveData<UserModel>()

    fun insert(name: String, surname: String) {
        usersRepository.insert(UserModel(name, surname))
    }

}