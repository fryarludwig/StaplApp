package com.batterystapler.staplapp.models

import com.batterystapler.staplapp.API
import com.google.gson.annotations.SerializedName
import com.lightningkite.kotlin.networking.*
/**
 * Created by fryar on 10/8/2016.
 */
class Course {
    @SerializedName("Name") var course_name = ""
    @SerializedName("Description") var description = ""
    @SerializedName("id") var course_id: Int = -1
    @SerializedName("Students") var student_list: List<Int> = listOf()
    @SerializedName("Chapters") var chapter_list: List<Int> = listOf()
    @SerializedName("Class Identifier") var course_code = ""

    fun CreateNewCourse(callback: (Course?) -> Unit) = API.course_call.gsonPost<Course>(
            data = this,
            onError = {callback(null); true},
            onResult = {this.course_id = it.course_id; callback(it)}
    )
}

class Courses {
    @SerializedName("Courses") var course_list: List<Course> = listOf()

    fun GetAllCourses(callback: (Courses?) -> Unit) = API.course_call.gsonGet<Courses>(
            onError = {callback(null); true},
            onResult = {print(it); callback(it)}
    )
}
