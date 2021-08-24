package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.materialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.btnBottomBar.setOnClickListener {
            startActivity(Intent(this,BottomBar::class.java))
        }
        viewBinding.btnTopBar.setOnClickListener {
            startActivity(Intent(this,TopBar::class.java))
        }
        viewBinding.btnBackdrop.setOnClickListener {
            startActivity(Intent(this,BackDrop::class.java))
        }
        viewBinding.btnCards.setOnClickListener {
            startActivity(Intent(this,Cards::class.java))
        }
        viewBinding.btnChips.setOnClickListener {
            startActivity(Intent(this,Chips::class.java))
        }
        viewBinding.btnNavRail.setOnClickListener {
            startActivity(Intent(this,NavigationRail::class.java))
        }
    }
}