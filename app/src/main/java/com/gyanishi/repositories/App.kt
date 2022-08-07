package com.gyanishi.repositories

import android.app.Application
import com.gyanishi.repositories.data.di.DataModule
import com.gyanishi.repositories.domain.di.DomainModule
import com.gyanishi.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
        }
        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}