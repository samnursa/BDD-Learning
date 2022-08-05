package com.example.bddlearning.tests.ui.login

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class LoginViewModelTest {

    private lateinit var viewModel: LoginViewModel

    @Before
    fun setUp() {
        viewModel = LoginViewModel()
    }

    @Test
    fun isEmailValid() {
        assertTrue(viewModel.isEmailValid("espresso@spoon.com"))
    }

    @Test
    fun isPasswordValid() {
        assertTrue(viewModel.isPasswordValid("bananacake"))
    }

    @Test
    fun isEmailInvalid() {
        assertFalse(viewModel.isEmailValid("test"))
    }

    @Test
    fun isPasswordInvalid() {
        assertFalse(viewModel.isPasswordValid("1234"))
    }
}