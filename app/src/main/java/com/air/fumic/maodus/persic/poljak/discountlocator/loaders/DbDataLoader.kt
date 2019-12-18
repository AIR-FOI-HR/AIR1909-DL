package com.air.fumic.maodus.persic.poljak.discountlocator.loaders

import com.air.fumic.maodus.persic.poljak.database.MyDb
import com.example.core.DataLoadedListener
import com.example.core.DataLoader

class DbDataLoader: DataLoader {
    var data_loaded = false

    override fun loadData(listener: DataLoadedListener) {
        var database = MyDb()

        var users = database.selectUsers()
        data_loaded = true

        listener.onDataLoaded(users)
    }

    override fun isDataLoaded(): Boolean {
        return data_loaded
    }
}