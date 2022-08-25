package com.olvera.firebasewithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user: MutableMap<String, Any> = HashMap()
        user["first"] = "Gonzalo"
        user["last"] = "Olvera"
        user["born"] = 1999


        FirebaseFirestore.getInstance().collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("TAG", "DocumentSnaphot added wit ID: ${documentReference.id}")
            }
            .addOnFailureListener { e -> Log.w("TAG", "Error adding document: $e") }


    }
}