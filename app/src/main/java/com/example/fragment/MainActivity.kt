package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.button)
        val btn2:Button=findViewById(R.id.button2)
        val firstfragment=FragmentFirst()
        val secondfragment=SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.containerFragment, firstfragment)
            commit()
            }

            btn.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.containerFragment, firstfragment)
                    addToBackStack(null)
                    commit()
                }
            }

            btn2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.containerFragment, secondfragment)
                    addToBackStack(null)
                    commit()
                }
            }


    }
}