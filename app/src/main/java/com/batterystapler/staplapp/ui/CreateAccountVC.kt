package com.batterystapler.staplapp.ui

import android.text.InputType
import android.view.Gravity
import android.view.View
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack
import com.lightningkite.kotlin.anko.viewcontrollers.implementations.VCActivity
import org.jetbrains.anko.*

/**
 * Created by Kwuz on 10/8/2016.
 */
class CreateAccountVC (val stack : VCStack): AnkoViewController() {
    override fun createView(ui: AnkoContext<VCActivity>): View = ui.verticalLayout(){
        padding = dip(8)
        textView("Staplr : New User"){
            textSize = 24f
            gravity = Gravity.CENTER
        }
        textView( " << Logout") {
            gravity = Gravity.LEFT
            textSize = 18f
            onClick{
                //go back to Login VC
                stack.pop()
            }
        }
        textView( "Username") {
            gravity = Gravity.LEFT
            textSize = 18f
        }
        editText() {
            //username field?
            textSize = 18f
        }
        textView( "Email") {
            gravity = Gravity.LEFT
            textSize = 18f
        }
        editText() {
            //username field?
            textSize = 18f
        }

        textView("Password"){
            textSize = 18f
        }

        editText(){
            inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            textSize = 18f

        }
        textView("Confirm Password"){
            textSize = 18f
        }

        editText(){
            inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            textSize = 18f

        }
        textView( "Name") {
            gravity = Gravity.LEFT
            textSize = 18f
        }
        editText() {
            //username field?
            textSize = 18f
        }
        button("Create Account") {
            onClick {
                //go to CourseListVC
                stack.push(CourseListVC(stack))
            }
        }
    }
}