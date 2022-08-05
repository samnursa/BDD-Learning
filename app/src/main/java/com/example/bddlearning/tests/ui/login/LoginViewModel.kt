package com.example.bddlearning.tests.ui.login

import androidx.core.util.PatternsCompat
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    fun isEmailValid(username: String) = PatternsCompat.EMAIL_ADDRESS.matcher(username).matches()
    fun isPasswordValid(password: String) = password.length > 5
}