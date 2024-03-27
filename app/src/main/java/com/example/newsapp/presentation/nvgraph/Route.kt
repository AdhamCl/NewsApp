package com.example.newsapp.presentation.nvgraph

import com.example.newsapp.util.Constant.APP_START_NAVIGATION
import com.example.newsapp.util.Constant.BOOKMARK_SCREEN
import com.example.newsapp.util.Constant.DETAILS_SCREEN
import com.example.newsapp.util.Constant.HOME_SCREEN
import com.example.newsapp.util.Constant.NEWS_NAVIGATION
import com.example.newsapp.util.Constant.NEWS_NAVIGATION_SCREEN
import com.example.newsapp.util.Constant.ON_BOARDING_SCREEN
import com.example.newsapp.util.Constant.SEARCH_SCREEN


sealed class Route (
    val route: String
){

    object OnBoardingScreen: Route(ON_BOARDING_SCREEN)
    object HomeScreen: Route(HOME_SCREEN)
    object SearchScreen: Route(SEARCH_SCREEN)
    object BookmarkScreen: Route(BOOKMARK_SCREEN)
    object DetailsScreen: Route(DETAILS_SCREEN)
    object AppStartNavigation: Route(APP_START_NAVIGATION)
    object NewsNavigation: Route(NEWS_NAVIGATION)
    object NewsNavigatorScreen : Route(NEWS_NAVIGATION_SCREEN)
}