package com.example.cleanarchhomework.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cleanarchhomework.model.UserModel

@Dao
interface IUsersDao {

    @Query("SELECT * FROM usermodel")
    fun getAllUsers(): LiveData<List<UserModel>>

    @Insert
    fun insert(userModel: UserModel?)

}