package dev.irving.portfolioapp.sleep.quality

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.irving.portfolioapp.sleep.database.SleepDatabaseDao

class SleepQualityViewModelFactory(
    private val sleepNightKey: Long,
    private val dataSource: SleepDatabaseDao
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SleepQualityViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SleepQualityViewModel(sleepNightKey, dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}
