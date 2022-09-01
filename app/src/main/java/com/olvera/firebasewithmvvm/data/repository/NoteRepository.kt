package com.olvera.firebasewithmvvm.data.repository

import com.olvera.firebasewithmvvm.data.model.Note
import com.olvera.firebasewithmvvm.util.UiState

interface NoteRepository {

    fun getNotes(result: (UiState<List<Note>>) -> Unit)

    fun addNote(note:Note, result: (UiState<String>) -> Unit)
}