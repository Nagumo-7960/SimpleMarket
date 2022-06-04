package com.example.simplemartket.model

data class Product(
    val id:Int,
    val name:String,
    val imageUrl:String,
    val value:Int
)

val Products = listOf(
    Product(
        id = 0,
        name = "美味しいぶどう",
        imageUrl = "http://drrrkari.com/upimg/8527f47be089844c11330b98f08f3741.jpeg",
        value = 2000
    ),
    Product(
        id = 1,
        name = "売れ残ったみかん",
        imageUrl = "http://drrrkari.com/upimg/b5cbadfaabd2dab869f8079a50e535cc.jpeg",
        value = 3000
    ),
    Product(
        id = 2,
        name = "野山のいちご",
        imageUrl = "http://drrrkari.com/upimg/9d0859d7352e999e596cb352e9048b3a.jpeg",
        value = 2300
    ),
    Product(
        id = 3,
        name = "酸っぱすぎレモン",
        imageUrl = "http://drrrkari.com/upimg/182cab4663233856e1f48aa00622a5e8.jpeg",
        value = 4300
    ),
    Product(
        id = 4,
        name = "伝説のりんご",
        imageUrl = "http://drrrkari.com/upimg/4e4bed1b8874cd19f465b73f7dbddad0.jpeg",
        value = 5300
    )

)