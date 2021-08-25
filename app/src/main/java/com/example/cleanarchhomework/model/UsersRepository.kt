package com.example.cleanarchhomework.model

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.cleanarchhomework.db.IUsersDao
import com.example.cleanarchhomework.db.UsersDatabase

class UsersRepository(application: Application?) : IUserRepository {
    private val usersDao: IUsersDao?

    init {
        val database = application?.let { UsersDatabase.getInstance(it) }
        usersDao = database!!.usersDao()
    }

    override fun getAllItem(): LiveData<List<UserModel>> {
       return usersDao?.getAllUsers()!!
    }

    override fun insert(userModel: UserModel) {
        usersDao?.insert(userModel)
    }

}