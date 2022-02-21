package com.example.myapplication.lyambda

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.lyambda.GraphicCardsListFragment
import com.example.myapplication.lyambda.TransferData

class MainActivity : AppCompatActivity() {

    private val transferListener = object :
        TransferData {
        override fun send(obj: Any) {
            Log.e("@@@", obj.toString())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GraphicCardsListFragment.newInstance { card ->
            Log.e("@@@", card.toString())
        }.show(supportFragmentManager, "")
    }

    fun name(): Unit {
        // тело
    }
}