package com.batterystapler.staplapp.models

import com.batterystapler.staplapp.API
import com.lightningkite.kotlin.networking.*


/**
 * Created by fryar on 10/8/2016.
 */
class User {
    var username = ""
    var email = ""
    var name = ""
    var user_id = -1
    var course_ids : List<Int> = listOf()

    //receiver.(parameters)->returnType

    fun CreateNewUser(callback: (User?) -> Unit)  = API.root.gsonPost<User>(
            data = this,
            onError = {callback(null); true},
            onResult = {this.user_id = it.user_id; callback(it)}
    )

}
