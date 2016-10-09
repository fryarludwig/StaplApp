package com.batterystapler.staplapp.ui

import android.view.Gravity
import android.view.View
import com.batterystapler.staplapp.API
import com.batterystapler.staplapp.models.Course
import com.batterystapler.staplapp.models.Courses
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
    val list = observableListOf <Course>()
    init{
        Courses().GetAllCourses{
            if(it == null)return@GetAllCourses
            list.addAll(it.course_list)
        }
    }
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
                        text = it.course_name
                    }
                }.lparams(matchParent, wrapContent)
            }
        }.lparams(matchParent, 0,1f)
    }

}