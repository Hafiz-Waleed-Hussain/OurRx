package com.ourrxlibraryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ourrx.showTestToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        showTestToast(this)
    
    }
}
