package com.example.footbalmatch.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.footbalmatch.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val ViewPager =findViewById<ViewPager>(R.id.viewPager)

        ViewPager.adapter = FragmentAdapter(this, supportFragmentManager)
        TabLayout.setupWithViewPager(viewPager)
    }
}
