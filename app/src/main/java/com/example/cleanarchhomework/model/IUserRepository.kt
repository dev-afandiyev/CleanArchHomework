package com.example.cleanarchhomework.model

import androidx.lifecycle.LiveData

interface IUserRepository {

    fun getAllItem(): LiveData<List<UserModel>>
    fun insert(userModel: UserModel)

}