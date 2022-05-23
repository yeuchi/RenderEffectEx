package com.ctyeung.rendereffectex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

/*
 * learning from Raywenderlich.com
 * https://www.raywenderlich.com/24255307-rendereffect-in-android-12
 * In Android 12, however, Google introduced the RenderEffect API.
 * This enables developers to effortlessly apply graphic effects such as blurs,
 * color filters and more to Views.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}