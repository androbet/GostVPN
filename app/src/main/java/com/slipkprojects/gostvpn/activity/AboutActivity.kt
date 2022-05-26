package com.slipkprojects.gostvpn.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.slipkprojects.gostvpn.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private val binding by lazy { ActivityAboutBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}