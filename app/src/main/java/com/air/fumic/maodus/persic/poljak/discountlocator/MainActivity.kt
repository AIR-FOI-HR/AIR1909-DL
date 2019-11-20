package com.air.fumic.maodus.persic.poljak.discountlocator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.air.fumic.maodus.persic.poljak.database.MyDb

class MainActivity : AppCompatActivity() {

    var database = MyDb()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database.selectUsers()
    }
}
