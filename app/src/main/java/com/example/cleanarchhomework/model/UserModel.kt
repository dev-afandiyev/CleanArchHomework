package com.example.cleanarchhomework.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.cleanarchhomework.model.utils.DateConverter
import java.sql.Date
import java.util.*

@Entity
data class UserModel(
    val name: String? = null,
    val surname: String? = null,

    // not a working date for the library room
//    @TypeConverters(DateConverter::class)
//    val date: Date? = null,
//    val created: String? = null,
){ @PrimaryKey(autoGenerate = true)
    var id: Long = 0 }