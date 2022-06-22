package com.example.simplemartket.model

data class Product(
    val id:Int,
    val name:String,
    val imageUrl:String,
    val value:Int,
    val explanation:String,
    var favorite:Boolean
)

val Products = listOf(
    Product(
        id = 0,
        name = "季節の美味しいぶどう",
        imageUrl = "https://pakutaso.cdn.rabify.me/shared/img/thumb/shimarisu_C101537.jpg.webp?d=1420",
        value = 2000,
        explanation = "美味しい季節に採れたぶどうを、しっかりと冷凍し、美味しさを閉じ込めました！まるで採れたてかのような味わいをご堪能ください",
        favorite = false
    ),
    Product(
        id = 1,
        name = "売れ残ったみかん",
        imageUrl = "https://pakutaso.cdn.rabify.me/shared/img/thumb/shimarisu_C101532.jpg.webp?d=1420",
        value = 3000,
        explanation = "このみかん、美味すぎるが故に残った",
        favorite = false
    ),
    Product(
        id = 2,
        name = "野山に生えまくったいちご",
        imageUrl = "https://pakutaso.cdn.rabify.me/shared/img/thumb/mitte20614029.jpg.webp?d=1420",
        value = 2300,
        explanation = "毒はない",
        favorite = false
    ),
    Product(
        id = 3,
        name = "酸っぱすぎレモン",
        imageUrl = "https://pakutaso.cdn.rabify.me/shared/img/thumb/PAKUIMGL9540.jpg.webp?d=1420",
        value = 4300,
        explanation = "シゲキックスくらいすっぱい",
        favorite = false
    ),
    Product(
        id = 4,
        name = "伝説のりんご",
        imageUrl = "https://pakutaso.cdn.rabify.me/shared/img/thumb/PED_narandaapple.jpg.webp?d=1420",
        value = 5300,
        explanation = "食べると勇者になれると噂",
        favorite = false
    )

)