package com.cr7.bismillah.data


import com.google.gson.annotations.SerializedName

data class NextEventItem(
    @SerializedName("events")
    val events: List<Event>
)