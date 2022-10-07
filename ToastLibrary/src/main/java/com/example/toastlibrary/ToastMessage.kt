package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

public class ToastMessage {
    fun simpleToast(context: Context,msg:String){

        Toast.makeText(context,msg+"Coming from",Toast.LENGTH_SHORT).show()

    }
}