package com.example.songs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Skeleton of an Android Things activity.
 *
 * Android Things peripheral APIs are accessible through the PeripheralManager
 * For example, the snippet below will open a GPIO pin and set it to HIGH:
 *
 * val manager = PeripheralManager.getInstance()
 * val gpio = manager.openGpio("BCM6").apply {
 *     setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW)
 * }
 * gpio.value = true
 *
 * You can find additional examples on GitHub: https://github.com/androidthings
 */
class Songs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs)
        val metadata: String = "The song is noted for its queer themes, including its sexually explicit homosexual lyrics, taking its name from the gay romance novel and film Call Me by Your Name."
        val artist: String = "Lil Nas X"
        val songName: String = "Montero"
        val yearReleased: Int = 2021
        val genre: String = "Rap"
        val duration: Double = 2.17
        val isTop40: Boolean = true
        var streams: Float = 57.7f

        print(metadata)
        print(artist)
        print(songName)
        print(yearReleased)
        print(genre)
        print(duration)
        print(isTop40)
        print(streams)
    }
}