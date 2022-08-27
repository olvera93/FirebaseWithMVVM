package com.olvera.firebasewithmvvm.note

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.olvera.firebasewithmvvm.data.model.Note
import com.olvera.firebasewithmvvm.data.repository.NoteRepository
import com.olvera.firebasewithmvvm.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    val repository: NoteRepository
): ViewModel() {

    private val _notes = MutableLiveData<UiState<List<Note>>>()
    val note: LiveData<UiState<List<Note>>>
        get() = _notes

    fun getNotes() {
        _notes.value = UiState.Loading
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            _notes.value = repository.getNotes()
        }, 2000)
    }

}