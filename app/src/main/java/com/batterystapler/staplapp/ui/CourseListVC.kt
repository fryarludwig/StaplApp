package com.batterystapler.staplapp.ui

import android.view.Gravity
import android.view.View
import com.lightningkite.kotlin.anko.lifecycle
import com.lightningkite.kotlin.anko.observable.adapter.listAdapter
import com.lightningkite.kotlin.anko.verticalRecyclerView
import com.lightningkite.kotlin.anko.viewcontrollers.implementations.VCActivity
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack
import com.lightningkite.kotlin.observable.list.observableListOf
import com.lightningkite.kotlin.observable.property.bind
import org.jetbrains.anko.*


/**
 * Created by Kwuz on 10/8/2016.
 */
class CourseListVC(val stack: VCStack) : AnkoViewController() {
    val list = observableListOf("test1","text2","asdfa;slkdf")
    override fun createView(ui: AnkoContext<VCActivity>): View = ui.verticalLayout() {
        padding = dip(8)
        textView("Staplr : Student : CourseList"){
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
        button("Create New Course"){
            onClick{
                //create Course
            }
        }

        verticalRecyclerView(){
            adapter = listAdapter(list) {itemobs->
                textView(){
                    lifecycle.bind(itemobs){
                        textSize = 18f
                        padding = dip(24)
                        text = it
                    }
                }.lparams(matchParent, wrapContent)
            }
        }.lparams(matchParent, 0,1f)
    }

}