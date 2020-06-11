package dev.irving.portfolioapp

import android.app.Application
import timber.log.Timber

class PortfolioApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
