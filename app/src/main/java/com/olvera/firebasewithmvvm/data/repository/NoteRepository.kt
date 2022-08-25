package com.olvera.firebasewithmvvm.data.repository

import com.olvera.firebasewithmvvm.data.model.Note

interface NoteRepository {

    fun getNotes(): List<Note>
}