package com.batterystapler.staplapp

import com.batterystapler.staplapp.models.Course
import com.lightningkite.kotlin.networking.NetEndpoint
import com.lightningkite.kotlin.networking.NetInterface
import com.lightningkite.kotlin.networking.gsonGet

/**
 * Created by fryar on 10/8/2016.
 */
object API : NetInterface(){
    val root = NetEndpoint(this, "http://api.batterystapler.com/api")
    val user_call = root.sub("/user")
    val course_call = root.sub("/course")
    val chapter_call = root.sub("/chapter")
    val stapl_call = root.sub("/stapl")
//
//    fun GetAllCourses(callback: (Array<Course>?) -> Unit) = course_call.gsonGet<Array<Course>>(
//            onError = {callback(null); true},
//            onResult = {print(it); callback(it)}
//    )
}
