package com.example.stuapp.style

/**
 *
 *@Auther MikuCat
 *@Time 2023/7/10
 */
class CreatePhone : CreateFactory {
    override fun createAppleProduct(): Apple {
        return IP15()
    }

    override fun createMiProduct(): Mi {
        return Mi11()
    }
}