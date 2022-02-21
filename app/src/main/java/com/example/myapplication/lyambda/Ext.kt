package com.example.myapplication.lyambda

import android.view.inputmethod.EditorInfo
import android.widget.EditText

fun EditText.setOnSearchImeOptionClickListener(action: () -> Unit) {
    setOnEditorActionListener { _, event, _ ->
        if(event == EditorInfo.IME_ACTION_SEARCH) {
            action()
            return@setOnEditorActionListener true
        }
        return@setOnEditorActionListener false
    }
}