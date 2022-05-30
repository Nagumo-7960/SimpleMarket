package com.example.simplemartket.model

data class Product(
    val id:Int,
    val name:String,
    val imageUrl:String,
    val value:Int
)

val Products = listOf(
    Product(
        id = 1,
        name = "季節の美味しいぶどう",
        imageUrl = "https://d.kuku.lu/bef40a330",
        value = 2000
    ),
    Product(
        id = 2,
        name = "売れ残ったみかん",
        imageUrl = "https://d.kuku.lu/e9c62ac40",
        value = 3000
    ),
    Product(
        id = 3,
        name = "野山のいちご",
        imageUrl = "https://d.kuku.lu/c3a650705",
        value = 2300
    )
)