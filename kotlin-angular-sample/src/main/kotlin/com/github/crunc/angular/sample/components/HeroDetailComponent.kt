package com.github.crunc.angular.sample.components

import com.github.crunc.angular.sample.Hero
import com.github.crunc.angular.sample.services.HeroService
import ng.api.Component
import ng.api.core.OnInit
import ng.router.ActivatedRoute
import ng.router.ActivatedRouteRef
import ng.router.params
import rxjs.nonNull

class HeroDetailComponent(
        private val heroService: HeroService,
        private val route: ActivatedRoute
) : OnInit {

    companion object : Component<HeroDetailComponent>(
            type = HeroDetailComponent::class,
            inject = arrayOf(HeroService, ActivatedRouteRef),
            selector = "my-hero-detail",
            templateUrl = "components/HeroDetailComponent.html",
            styleUrls = arrayOf("components/HeroDetailComponent.css"),
            inputs = arrayOf(HeroDetailComponent::hero)
    )

    var hero: Hero? = null


    override fun ngOnInit() {
        route.params
                .map { params -> params.number("id") }
                .nonNull()
                .switchMap { id -> heroService.getHero(id) }
                .subscribe { hero -> this.hero = hero }
    }
}
