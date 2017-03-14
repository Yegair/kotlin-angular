package com.github.crunc.angular.sample

import com.github.crunc.angular.sample.components.DashboardComponent
import com.github.crunc.angular.sample.components.HeroDetailComponent
import com.github.crunc.angular.sample.components.HeroesComponent
import ng.api.router.Route

val ROUTES = arrayOf(
        Route(path = "", redirectTo = "/dashboard", pathMatch = "full"),
        Route(path = "dashboard", component = DashboardComponent),
        Route(path = "detail/:id", component = HeroDetailComponent),
        Route(path = "heroes", component = HeroesComponent)
)
