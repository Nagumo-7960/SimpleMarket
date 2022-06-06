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
        imageUrl = "https://image.shutterstock.com/image-photo/great-offer-portrait-excited-black-600w-2029029173.jpg",
        value = 2000
    ),
    Product(
        id = 1,
        name = "売れ残ったみかん",
        imageUrl = "https://image.shutterstock.com/image-photo/focused-young-african-businessman-wear-600w-1626375430.jpg",
        value = 3000
    ),
    Product(
        id = 2,
        name = "野山のいちご",
        imageUrl = "https://image.shutterstock.com/image-photo/handsome-unshaven-young-darkskinned-male-600w-640011838.jpg",
        value = 2300
    ),
    Product(
        id = 3,
        name = "酸っぱすぎレモン",
        imageUrl = "https://image.shutterstock.com/image-photo/head-shot-african-man-wear-600w-1694685313.jpg",
        value = 4300
    ),
    Product(
        id = 4,
        name = "伝説のりんご",
        imageUrl = "https://image.shutterstock.com/image-photo/portrait-african-american-businessman-standing-600w-1907879224.jpg",
        value = 5300
    )

)