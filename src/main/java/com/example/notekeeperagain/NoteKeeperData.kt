package com.example.notekeeperagain


data class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
//        return super.toString()
        return title
    }
}

data class NoteInfo(var course: CourseInfo, var title: String, var text: String)