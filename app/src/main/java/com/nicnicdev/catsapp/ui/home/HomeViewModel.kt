package com.nicnicdev.catsapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicnicdev.catsapp.domain.CatsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class HomeState(
    val catImageUrl: String = "",
    val isLoading: Boolean = false
)

class HomeViewModel(
    private val repository : CatsRepository,
): ViewModel(){
    private val _homeState = MutableStateFlow(HomeState())
    val homeState: StateFlow<HomeState> = _homeState

    fun getCatImage() {
        viewModelScope.launch(Dispatchers.IO){
            _homeState.emit(HomeState(isLoading = true))
            val cat = repository.getCats().first().url
            _homeState.value = _homeState.value.copy(
                catImageUrl = cat,
                isLoading = false
            )
        }
    }
}