package com.example.recycleviewactividad

import com.google.gson.annotations.SerializedName
import org.intellij.lang.annotations.Language
import java.io.FileDescriptor

data class ResultResponser(

    @SerializedName("node_id")
    val nodeID: String,
    val name: String,

    @SerializedName( "full_name")
    val fullName: String,

    val owner: Owner,

    @SerializedName( "description")
    val description: String,



    @SerializedName( "watchers_count")
    val language: String,

    @SerializedName( "open_issues_count")
    val license: License,


    @SerializedName( "is_template")
    val topics: List<String>,

)
data class License (
    val key: String,
    val name: String,

    @SerializedName( "spdx_id")
    val spdxID: String,

    val url: String,

    @SerializedName( "node_id")
    val nodeID: String
)

data class Owner (
    @SerializedName( "avatar_url")
    val avatarURL: String,

)


