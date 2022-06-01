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
        imageUrl = "http://drrrkari.com/upimg/86a50ecc005ef9cc14faf582d4981fc3.jpeg",
        value = 2000
    ),
    Product(
        id = 1,
        name = "売れ残ったみかん",
        imageUrl = "http://drrrkari.com/upimg/de778b1681beb4e5a7a1da2283646240.jpeg",
        value = 3000
    ),
    Product(
        id = 2,
        name = "野山のいちご",
        imageUrl = "http://drrrkari.com/upimg/8ec6eeeb2ea1d0acf8f239ea1421abb4.jpeg",
        value = 2300
    ),
    Product(
        id = 3,
        name = "酸っぱすぎレモン",
        imageUrl = "http://drrrkari.com/upimg/3d509c35af2119102ee0796523cbbb73.jpeg",
        value = 4300
    ),
    Product(
        id = 4,
        name = "伝説のりんご",
        imageUrl = "http://drrrkari.com/upimg/0fca66665e306dda32dab0acfa57cb66.jpeg",
        value = 5300
    )

)