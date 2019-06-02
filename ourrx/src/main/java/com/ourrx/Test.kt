package com.ourrx

import android.content.Context
import android.widget.Toast

fun showTestToast(context: Context) {
    Toast.makeText(
        context,
        " Toast from OurRx library",
        Toast.LENGTH_LONG
    ).show()
}