package com.care.dino.stickyheader

import java.io.Serializable
import com.google.gson.annotations.SerializedName

class Data (@SerializedName("day") var dayOrTitle: String? = null,
            @SerializedName("date") var date: String? = null,
            @SerializedName("subheading") var subHeading: String? = null,
            @SerializedName("time") var time: String? = null,
            @SerializedName("location") var location: String? = null,
            @SerializedName("type") var type: Int? = null,
            var position: Int? = null) : Serializable