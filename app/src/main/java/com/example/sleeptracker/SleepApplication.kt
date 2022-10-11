package com.example.sleeptracker

import android.app.Application

class SleepApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}