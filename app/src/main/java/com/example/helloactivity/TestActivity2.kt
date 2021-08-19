package com.example.helloactivity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloactivity.databinding.ActivityTest2Binding

class TestActivity2:AppCompatActivity() {
    lateinit var bindingClass: ActivityTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)

    }





}