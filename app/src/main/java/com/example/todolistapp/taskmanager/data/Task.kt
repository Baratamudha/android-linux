package com.example.todolistapp.taskmanager.data

data class Task(
    val id: Int,
    val title: String,
    val body: String? = null,
    val startTime: String,
    val endTime: String
)
val taskList = listOf(
    Task(
        id = 1,
        title = "Do Laundry",
        body = "Wash You Cloth",
        startTime = "10.00",
        endTime = "11.00"
    ),
    Task(
        2,
        "Clean Kitchen",
        "Wash dishes, wipe counters, and mop the floor",
        "11:30",
        "12:30"
    ),
    Task(
        3,
        "Vacuum Living Room",
        "Clean carpets and furniture",
        "13:00",
        "14:00"
    ),
    Task(
        4,
        "Water Plants",
        "Water indoor and outdoor plants",
        "15:00",
        "16:00"
    ),
)

