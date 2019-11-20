package com.air.fumic.maodus.persic.poljak.database

import android.util.Log
import com.air.fumic.maodus.persic.poljak.database.entities.*
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MyDb{

    //connection to database
    val database = FirebaseDatabase.getInstance().reference

    //INSERT functions
    fun insertUser(user: User){
        database.child("users").child(user.id_user.toString()).setValue(user)
    }

    fun insertStore(store: Store){
        database.child("store").child(store.id_store.toString()).setValue(store)
    }

    fun insertProduct(product: Product){
        database.child("product").child(product.id_product.toString()).setValue(product)
    }

    fun insertOffer(offer: Offer){
        database.child("offer").child(offer.id_offer.toString()).setValue(offer)
    }

    fun insertDiscount(discount: Discount){
        database.child("discount").child(discount.id_discount.toString()).setValue(discount)
    }

    fun insertChart(chart: Chart){
        database.child("chart").child(chart.id_chart.toString()).setValue(chart)
    }

    //SELECT * functions
    fun selectUsers(){
        val listener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values
                val post = dataSnapshot.value
                Log.i("querry", post.toString())
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.e("error", "Getting data failed.")
            }

        }

        database.child("users").addValueEventListener(listener)
    }

    fun selectStore(){
        val listener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values
                val post = dataSnapshot.value
                Log.i("querry", post.toString())
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.e("error", "Getting data failed.")
            }

        }

        database.child("store").addValueEventListener(listener)
    }

    fun selectProduct(){
        val listener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values
                val post = dataSnapshot.value
                Log.i("querry", post.toString())
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.e("error", "Getting data failed.")
            }

        }

        database.child("product").addValueEventListener(listener)
    }

    fun selectOffer(){
        val listener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values
                val post = dataSnapshot.value
                Log.i("querry", post.toString())
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.e("error", "Getting data failed.")
            }

        }

        database.child("offer").addValueEventListener(listener)
    }

    fun selectDiscount(){
        val listener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values
                val post = dataSnapshot.value
                Log.i("querry", post.toString())
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.e("error", "Getting data failed.")
            }

        }

        database.child("discount").addValueEventListener(listener)
    }

    fun selectChart(){
        val listener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values
                val post = dataSnapshot.value
                Log.i("querry", post.toString())
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.e("error", "Getting data failed.")
            }

        }

        database.child("chart").addValueEventListener(listener)
    }

    //DELETE functions
    fun deleteUser(user_id: Int){
        database.child("users").child(user_id.toString()).removeValue()
    }

    fun deleteStore(store_id: Int){
        database.child("store").child(store_id.toString()).removeValue()
    }

    fun deleteProduct(product_id: Int){
        database.child("product").child(product_id.toString()).removeValue()
    }

    fun deleteOffer(offer_id: Int){
        database.child("users").child(offer_id.toString()).removeValue()
    }

    fun deleteDiscount(discount_id: Int){
        database.child("discount").child(discount_id.toString()).removeValue()
    }

    fun deleteChart(chart_id: Int){
        database.child("chart").child(chart_id.toString()).removeValue()
    }
}