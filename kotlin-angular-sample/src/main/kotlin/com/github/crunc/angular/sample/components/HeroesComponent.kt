package com.github.crunc.angular.sample.components

import com.github.crunc.angular.sample.Hero
import com.github.crunc.angular.sample.services.HeroService
import ng.api.Component
import ng.api.core.OnInit
import ng.api.router.Router

class HeroesComponent(
        private val heroService: HeroService,
        private val router: Router
) : OnInit {

    companion object : Component<HeroesComponent>(
            type = HeroesComponent::class,
            inject = arrayOf(HeroService, Router),
            selector = "my-heroes",
            templateUrl = "components/HeroesComponent.html",
            styleUrls = arrayOf("components/HeroesComponent.css")
    )

    var heroes: Array<Hero> = arrayOf()
    var selectedHero: Hero? = null

    private fun getHeroes() {

        heroService.getAllHeroes()
                .subscribe { hero -> console.log("Hero: $hero") }

        heroService.getHeroes().subscribe { result ->
            heroes = result
        }
    }

    override fun ngOnInit() {
        getHeroes()
    }

    val onSelect = { hero: Hero ->
        this.selectedHero = hero
    }

    val gotoDetail = {
        router.navigate(arrayOf("/detail", selectedHero?.id))
    }
}