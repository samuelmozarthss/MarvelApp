package com.sams.br.marvelapp.ui.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sams.br.marvelapp.data.model.character.CharacterModel
import com.sams.br.marvelapp.repository.MarvelRepository
import com.sams.br.marvelapp.ui.state.ResourceState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteCharacterViewModel @Inject constructor(
    private val respository: MarvelRepository
) : ViewModel() {

    private val _favorites = MutableStateFlow<ResourceState<List<CharacterModel>>>(ResourceState.Empty())
    val favorites: StateFlow<ResourceState<List<CharacterModel>>> = _favorites

    init {
        fetch()
    }

    private fun fetch() = viewModelScope.launch {
        respository.getAll().collectLatest { characters ->
            if (characters.isNullOrEmpty()) {
                _favorites.value = ResourceState.Empty()
            } else {
                _favorites.value = ResourceState.Success(characters)
            }
        }
    }
    fun delete(characterModel: CharacterModel) = viewModelScope.launch {
        respository.delete(characterModel)
    }

}