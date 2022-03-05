package com.conamobile.countryselector

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edt)

        showKeyboard(editText)

    }
    fun showKeyboard(editText: EditText) {
        editText.requestFocus()
        editText.postDelayed({
            val keyboard = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            keyboard.showSoftInput(editText, 0)
        }, 5000)
    }
}