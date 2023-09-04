package com.example.hotel.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotel.R

//https://run.mocky.io/v3/35e0d18e-2521-4f1b-a575-f0fe366f66e3

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hotelFragment = HotelFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, hotelFragment).commit()
    }
}