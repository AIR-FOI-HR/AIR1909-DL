package com.example.core

import com.air.fumic.maodus.persic.poljak.database.entities.User

interface DataLoadedListener {
    fun onDataLoaded(
        users: List<User>
    )
}