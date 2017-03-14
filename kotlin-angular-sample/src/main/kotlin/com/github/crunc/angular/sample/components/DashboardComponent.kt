package com.github.crunc.angular.sample.components

import com.github.crunc.angular.sample.Hero
import com.github.crunc.angular.sample.services.HeroService
import ng.api.Component
import ng.api.core.OnInit

class DashboardComponent(private val heroService: HeroService) : OnInit {

    companion object : Component<DashboardComponent>(
            type = DashboardComponent::class,
            inject = arrayOf(HeroService),
            selector = "my-dashboard",
            templateUrl = "components/DashboardComponent.html",
            styleUrls = arrayOf("components/DashboardComponent.css")
    )

    var heroes: Array<Hero> = emptyArray()

    override fun ngOnInit() {
        heroService.getHeroes().subscribe { result ->
            heroes = result.slice(IntRange(1, 5))
                    .toTypedArray()
        }
    }
}