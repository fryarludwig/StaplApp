package com.batterystapler.staplapp

import android.view.Gravity
import android.view.View
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.implementations.VCActivity
import org.jetbrains.anko.*

/**
 * Created by fryar on 10/8/2016.
 */
class TestVC : AnkoViewController(){
    override fun createView(ui: AnkoContext<VCActivity>): View = ui.verticalLayout(){
        textView("StaplApp") {
            textSize = 18f
            gravity = Gravity.CENTER
            padding = dip(8)
        }

    }
}
