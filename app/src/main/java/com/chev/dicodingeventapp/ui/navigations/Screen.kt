package com.chev.dicodingeventapp.ui.navigations

import com.chev.dicodingeventapp.R

sealed class Screen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {
    object Home : Screen(
        "home_screen",
        title = "Home",
        icon = R.drawable.ic_bottom_home,
        icon_focused = R.drawable.ic_bottom_home_focused
    )
    object Finished : Screen(
        "finished_screen",
        title = "Finished",
        icon = R.drawable.ic_bottom_finished,
        icon_focused = R.drawable.ic_bottom_finished_focused
    )
    object Detail : Screen(
        "detail_screen/{itemId}",
        title = "Detail",
        icon = R.drawable.ic_detail,
        icon_focused = R.drawable.ic_detail
    ) {
        fun createRoute(itemId: String) = "detail_screen/$itemId"
    }
}
