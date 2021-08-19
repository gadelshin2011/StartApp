package com.example.helloactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.helloactivity.databinding.ActivityMainBinding
import com.example.helloactivity.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {
    lateinit var bindingClass :ActivityTest1Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        val message = intent.getStringExtra("key")
        bindingClass.twMessage.text = message


    }

    fun onClickBack(view: View){
        intent.putExtra("key2", bindingClass.tw2.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }




}