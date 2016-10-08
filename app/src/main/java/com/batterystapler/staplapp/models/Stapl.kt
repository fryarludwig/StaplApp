package com.batterystapler.staplapp.models

import com.batterystapler.staplapp.API
import com.lightningkite.kotlin.networking.gsonPost

/**
 * Created by fryar on 10/8/2016.
 */
class Stapl {
    var stapl_id: Int = -1
    var title = ""

    fun CreateNewStapl(callback: (Stapl?) -> Unit) = API.stapl_call.gsonPost<Stapl>(
            data = this,
            onError = {callback(null); true},
            onResult = {this.stapl_id = it.stapl_id; callback(it)}
    )
}
