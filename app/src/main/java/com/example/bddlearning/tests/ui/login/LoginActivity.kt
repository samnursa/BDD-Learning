package com.example.bddlearning.tests.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.bddlearning.R
import com.example.bddlearning.databinding.ActivityLoginBinding
import com.example.bddlearning.utils.afterTextChanged

class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        init()
    }

    private fun init(){
        binding.etEmail.afterTextChanged {
            if(loginViewModel.isEmailValid(it)){
                binding.layoutEmail.apply {
                    isErrorEnabled = false
                    error = null
                }
            } else {
                binding.layoutEmail.apply {
                    isErrorEnabled = true
                    error = getString(R.string.invalid_email)
                }
            }
        }

        binding.etPassword.afterTextChanged {
            if(loginViewModel.isPasswordValid(it)){
                binding.layoutPassword.apply {
                    isErrorEnabled = false
                    error = null
                }
            } else {
                binding.layoutPassword.apply {
                    isErrorEnabled = true
                    error = getString(R.string.invalid_password)
                }
            }
        }
    }
}