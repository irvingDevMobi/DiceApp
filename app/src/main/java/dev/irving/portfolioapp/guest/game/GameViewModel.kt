package dev.irving.portfolioapp.guest.game

import androidx.lifecycle.ViewModel
import timber.log.Timber

class GameViewModel : ViewModel() {
    init {
        Timber.d("Init GameViewModel")
    }

    override fun onCleared() {
        super.onCleared()
        Timber.d("OnCleared GameViewModel")
    }
}
