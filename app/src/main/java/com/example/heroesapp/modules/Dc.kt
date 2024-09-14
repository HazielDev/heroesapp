package com.example.heroesapp.modules

data class Dc(val id:Int, val name:String, val image:String, val info:String = "info"){
    companion object{
        val marvels = mutableListOf<Dc>(
            Dc(1,"Iron Man","https://static.vecteezy.com/system/resources/thumbnails/019/607/567/small_2x/fast-food-vector-clipart-design-graphic-clipart-design-free-png.png"
                ,"info 2"),
            Dc(2,"Capitan America","https://i.pinimg.com/originals/23/c7/ba/23c7ba22eaf3de0cf11ef32cecf4d8fd.png"),
            Dc(3,"Thor","https://png.pngtree.com/png-vector/20230329/ourmid/pngtree-pizza-italian-pie-italian-food-png-image_6673167.png"),
            Dc(4,"Quick Silver","https://images.vexels.com/media/users/3/181353/isolated/preview/1f0da6687abc94f096fef731e614292f-mexico-food-color-illustration.png"),
            Dc(5,"War Machine","https://cdn-icons-png.flaticon.com/512/7593/7593369.png"),
        )
    }
}
