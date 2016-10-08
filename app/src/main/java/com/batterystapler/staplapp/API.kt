package com.batterystapler.staplapp

import com.lightningkite.kotlin.networking.NetEndpoint
import com.lightningkite.kotlin.networking.NetInterface

/**
 * Created by fryar on 10/8/2016.
 */
object API : NetInterface(){
    val root = NetEndpoint(this, "http://api.batterystapler.com/api")
    val user_call = root.sub("user")
}
