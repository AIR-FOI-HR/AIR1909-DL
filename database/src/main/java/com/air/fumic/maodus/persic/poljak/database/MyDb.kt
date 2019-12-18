package com.air.fumic.maodus.persic.poljak.database

import android.util.Log
import com.air.fumic.maodus.persic.poljak.database.entities.*
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MyDb : DAO{

    //connection to database
    val database = FirebaseDatabase.getInstance().reference

    //INSERT functions
    override fun insertUser(user: User){
        database.child("users").child(user.id_user.toString()).setValue(user)
    }

    override fun insertStore(store: Store){
        database.child("store").child(store.id_store.toString()).setValue(store)
    }

    override fun insertProduct(product: Product){
        database.child("product").child(product.id_product.toString()).setValue(product)
    }

    override fun insertOffer(offer: Offer){
        database.child("offer").child(offer.id_offer.toString()).setValue(offer)
    }

    override fun insertDiscount(discount: Discount){
        database.child("discount").child(discount.id_discount.toString()).setValue(discount)
    }

    override fun insertChart(chart: Chart){
        database.child("chart").child(chart.id_chart.toString()).setValue(chart)
    }

    //SELECT * functions
    override fun selectUsers(): MutableList<User> {
        var users_list = mutableListOf<User>()
        val listener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (user: DataSnapshot in dataSnapshot.children){
                    Log.i("users", user.toString())
                    var id_user = user.child("id_user").value.toString().toInt()
                    var username = user.child("username").value.toString()
                    var name = user.child("name").value.toString()
                    var surname = user.child("surname").value.toString()
                    var adress = user.child("adress").value.toString()
                    var emali = user.child("email").value.toString()
                    var password = user.child("password").value.toString()

                    var new_user = User(id_user = id_user, username = username, name = name, surname = surname, adress = adress, email = emali, password = password)
                    users_list.add(new_user)
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.e("error", "Getting data failed.")
            }

        }

        database.child("users").addValueEventListener(listener)
        return users_list
    }

    override fun selectStore(){
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

    override fun selectProduct(){
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

    override fun selectOffer(){
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

    override fun selectDiscount(){
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

    override fun selectChart(){
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
    override fun deleteUser(user_id: Int){
        database.child("users").child(user_id.toString()).removeValue()
    }

    override fun deleteStore(store_id: Int){
        database.child("store").child(store_id.toString()).removeValue()
    }

    override fun deleteProduct(product_id: Int){
        database.child("product").child(product_id.toString()).removeValue()
    }

    override fun deleteOffer(offer_id: Int){
        database.child("users").child(offer_id.toString()).removeValue()
    }

    override fun deleteDiscount(discount_id: Int){
        database.child("discount").child(discount_id.toString()).removeValue()
    }

    override fun deleteChart(chart_id: Int){
        database.child("chart").child(chart_id.toString()).removeValue()
    }
}