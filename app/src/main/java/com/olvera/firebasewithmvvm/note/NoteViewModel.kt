package com.olvera.firebasewithmvvm.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.olvera.firebasewithmvvm.data.model.Note
import com.olvera.firebasewithmvvm.data.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    val repository: NoteRepository
): ViewModel() {

    private val _notes = MutableLiveData<List<Note>>()
    val note: LiveData<List<Note>>
        get() = _notes

    fun getNotes() {
        _notes.value = repository.getNotes()
    }

}