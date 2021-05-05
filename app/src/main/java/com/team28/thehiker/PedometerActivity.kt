package com.team28.thehiker

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class PedometerActivity  : AppCompatActivity(), SensorEventListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedometer)
        supportActionBar?.hide()
    }

    fun updateStepCounter (steps : Int){
        val steps_text = findViewById<TextView>(R.id.txtViewSteps)
        steps_text.text= steps.toString()
    }

    override fun onSensorChanged(event: SensorEvent?) {
        event?.values?.get(0)?.let { updateStepCounter(it.toInt()) }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("Not yet implemented")
    }


}