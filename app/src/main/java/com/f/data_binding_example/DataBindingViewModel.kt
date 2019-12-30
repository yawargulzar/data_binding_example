package com.f.data_binding_example

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel


class DataBindingViewModel : ViewModel() {
    private val _stateUser = MutableLiveData<List<User>>()
    val stateUser : LiveData<List<User>>
    get() = _stateUser

    fun setUser(){
        val usersList = ArrayList<User>()
        usersList.add(User("Bismah","61"))
        usersList.add(User("Tehreem","53"))
        usersList.add(User("Yawar","54.4"))
        _stateUser.value = usersList
    }
}