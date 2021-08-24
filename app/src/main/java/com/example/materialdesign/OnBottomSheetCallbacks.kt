package com.example.materialdesign

import android.view.View

interface OnBottomSheetCallbacks {
    fun onStateChanged(bottomSheet: View, newState: Int)
}