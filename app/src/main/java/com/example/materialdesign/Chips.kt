package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.ImageSpan
import android.view.LayoutInflater
import com.example.materialdesign.databinding.ActivityChipsBinding
import com.google.android.material.chip.ChipDrawable

class Chips : AppCompatActivity() {
    lateinit var viewBinding:ActivityChipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityChipsBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

    }
}