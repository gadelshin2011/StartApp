package com.example.helloactivity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.helloactivity.databinding.ActivityTest1Binding
import com.example.helloactivity.databinding.ActivityTest2Binding

class TestActivity2: AppCompatActivity() {
    lateinit var bindingClass : ActivityTest2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        val mess = intent.getStringExtra(R.string.key2.toString())
        bindingClass.twMessage2.text = mess



    }

    fun onClickBack2(view: View){
        intent.putExtra(R.string.key2.toString(), bindingClass.twBack.text.toString())
        setResult(RESULT_OK, intent)
        finish()


    }





}