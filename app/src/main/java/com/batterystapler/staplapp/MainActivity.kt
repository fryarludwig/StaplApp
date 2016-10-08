package com.batterystapler.staplapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack

import com.lightningkite.kotlin.anko.viewcontrollers.implementations.VCActivity

class MainActivity : VCActivity() {

    val stack = VCStack()

    init{stack.push(TestVC())}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        attach(stack)
    }
}
