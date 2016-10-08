package com.batterystapler.staplapp.models

import com.batterystapler.staplapp.API
import com.lightningkite.kotlin.networking.*
/**
 * Created by fryar on 10/8/2016.
 */
class Course {
    var course_name = ""
    var description = ""
    var course_id: Int = -1
    var student_list: List<Int> = listOf()
    var chapter_list: List<Int> = listOf()
    var instructor_list: List<Int> = listOf()

    fun CreateNewCourse(callback: (Course?) -> Unit) = API.course_call.gsonPost<Course>(
            data = this,
            onError = {callback(null); true},
            onResult = {this.course_id = it.course_id; callback(it)}
    )

}
