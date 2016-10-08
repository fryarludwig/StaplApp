package com.batterystapler.staplapp.models

import com.batterystapler.staplapp.API
import com.google.gson.annotations.SerializedName
import com.lightningkite.kotlin.networking.gsonPost

/**
 * Created by fryar on 10/8/2016.
 */
class Chapter {
    var chapter_id: Int = -1
    @SerializedName("name") var name = ""
    var descripption = ""
    var stapl_list: List<Int> = listOf()

    fun CreateNewChapter(callback: (Chapter?) -> Unit) = API.chapter_call.gsonPost<Chapter>(
            data = this,
            onError = {callback(null); true},
            onResult = {this.chapter_id = it.chapter_id; callback(it)}
    )
}
