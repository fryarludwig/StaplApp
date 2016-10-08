package com.batterystapler.staplapp.ui

import android.text.InputType
import android.view.Gravity
import android.view.View
import com.lightningkite.kotlin.anko.observable.bindString
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack
import com.lightningkite.kotlin.anko.viewcontrollers.implementations.VCActivity
import com.lightningkite.kotlin.observable.property.StandardObservableProperty
import org.jetbrains.anko.*

/**
 * Created by Kwuz on 10/8/2016.
 */
class LoginVC (val stack : VCStack): AnkoViewController() {
    val usernameObs = StandardObservableProperty("")
    var passwordObs = StandardObservableProperty("")
    override fun createView(ui: AnkoContext<VCActivity>): View = ui.verticalLayout(){
        padding = dip(8)
        textView("Staplr"){
            textSize = 24f
            gravity = Gravity.CENTER
        }
        textView( "Username") {
            gravity = Gravity.LEFT
            textSize = 18f
        }
        editText() {
            //username field?
            textSize = 18f
            bindString(usernameObs)
        }

        textView("Password"){
            textSize = 18f
            bindString(passwordObs)
        }

        editText(){
            inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            textSize = 18f

        }

        button("Login") {
            onClick {
                //go to CourseListVC
                stack.push(CourseListVC(stack))
            }
        }

        space() {
        }.lparams(height = dip(62))


        button("Create Account"){
            onClick{
                //create account
                stack.push(CreateAccountVC(stack))
            }
        }

        button("Forgot Password"){
            onClick{
                //forgot password functionality
                stack.push(ForgotPasswordVC(stack))
            }
        }
    }


}