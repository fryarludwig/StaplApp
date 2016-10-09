package com.batterystapler.staplapp

import com.batterystapler.staplapp.models.Course
import com.lightningkite.kotlin.networking.NetEndpoint
import com.lightningkite.kotlin.networking.NetInterface
import com.lightningkite.kotlin.networking.gsonGet

/**
 * Created by fryar on 10/8/2016.
 */
object API : NetInterface(){

    init{
        onError += {
            println(it)
        }
    }
    val root = NetEndpoint(this, "http://api.batterystapler.com")
    val user_call = root.sub("user")
    val course_call = root.sub("course/")
    val chapter_call = root.sub("chapter")
    val stapl_call = root.sub("stapl")
}
