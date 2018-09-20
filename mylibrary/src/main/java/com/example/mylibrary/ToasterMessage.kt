package com.example.mylibrary

import android.content.Context
import android.widget.Toast
@Suppress("unused")
class ToasterMessage {

    fun s(c: Context, message: String) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()

    }
}