package com.batterystapler.staplapp.ui

import android.view.Gravity
import android.view.View
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack
import com.lightningkite.kotlin.anko.viewcontrollers.implementations.VCActivity
import org.jetbrains.anko.*

/**
 * Created by Kwuz on 10/8/2016.
 */
class ForgotPasswordVC (val stack : VCStack): AnkoViewController(){
    override fun createView(ui: AnkoContext<VCActivity>): View = ui.verticalLayout(){
        textView("Staplr : Forgot Password"){
            textSize = 24f
            gravity = Gravity.CENTER
        }
        textView( " << Back") {
            gravity = Gravity.LEFT
            textSize = 18f
            onClick{
                //go back to Login VC
                stack.pop()
            }

            textView( "Email") {
                gravity = Gravity.LEFT
                textSize = 18f
            }
            editText() {
                //username field?
                textSize = 18f
            }
            button("Send Recovery Email"){

                onClick{
                    //do something helpful
                }
            }
        }
        }
}