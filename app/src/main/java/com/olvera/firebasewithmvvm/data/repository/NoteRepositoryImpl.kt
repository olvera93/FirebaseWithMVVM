package com.olvera.firebasewithmvvm.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.olvera.firebasewithmvvm.data.model.Note
import com.olvera.firebasewithmvvm.util.UiState
import java.util.*

class NoteRepositoryImpl(
    val database: FirebaseFirestore
): NoteRepository {

    override fun getNotes(): UiState<List<Note>> {
        //We will get data from firebase
        val data = listOf<Note>()

        if (data.isEmpty()) {
            return UiState.Failure("Data is Empty")
        } else {
            return UiState.Success(data)
        }
    }
}