package com.example.bddlearning.tests.ui.login

import android.util.Patterns
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    fun isEmailValid(username: String) = Patterns.EMAIL_ADDRESS.matcher(username).matches()
    fun isPasswordValid(password: String) = password.length > 5
}