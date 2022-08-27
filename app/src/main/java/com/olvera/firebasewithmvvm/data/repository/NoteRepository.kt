package com.olvera.firebasewithmvvm.data.repository

import com.olvera.firebasewithmvvm.data.model.Note
import com.olvera.firebasewithmvvm.util.UiState

interface NoteRepository {

    fun getNotes(): UiState<List<Note>>
}