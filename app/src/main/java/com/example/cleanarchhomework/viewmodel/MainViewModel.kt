package com.example.cleanarchhomework.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.cleanarchhomework.model.UserModel
import com.example.cleanarchhomework.model.UsersRepository

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val usersRepo: UsersRepository = UsersRepository(application)

    fun getAllUsers(): LiveData<List<UserModel>> {
        return usersRepo.getAllItem()
    }

}