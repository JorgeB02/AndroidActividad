
package com.example.recycleviewactividad

data class User(
    val name:String?,
    val avartarURL : String?,
    val description : String?,
    val license: String?,
    val topics: List<String>?,
    val language: String?
)

fun ResultResponser.toUser():User{
    return User(
        this.name,
        this.owner.avatarURL,
        this.description,
        this.license?.name,
        this.topics,
        this.language
    )
}

fun Array<ResultResponser>.toUser():List<User>{
    return this.map { it.toUser() }
}