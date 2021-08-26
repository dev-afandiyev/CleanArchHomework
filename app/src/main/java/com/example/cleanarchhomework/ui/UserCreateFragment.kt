package com.example.cleanarchhomework.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProviders
import com.example.cleanarchhomework.R
import com.example.cleanarchhomework.viewmodel.UserCreateViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.sql.Date

class UserCreateFragment : BottomSheetDialogFragment() {

    private lateinit var et_Name: EditText
    private lateinit var et_Surname: EditText
    private lateinit var button: Button
    private lateinit var usersViewModel: UserCreateViewModel
    private lateinit var date: Date

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (dialog as BottomSheetDialog).behavior.state = BottomSheetBehavior.STATE_EXPANDED
        val view = inflater.inflate(R.layout.fragment_user_create, container, false)

        et_Name = view.findViewById(R.id.et_name)
        et_Surname = view.findViewById(R.id.et_surname)
        button = view.findViewById(R.id.bt_add_user)

        usersViewModel = ViewModelProviders.of(this).get(UserCreateViewModel::class.java)
        usersViewModel.insertUsersState.observe(this){
            et_Name.setText(it.name)
            et_Surname.setText(it.surname)
        }

        button.setOnClickListener {
            usersViewModel.insert(et_Name.text.toString(), et_Surname.text.toString())
        }

        return view
    }

}