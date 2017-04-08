package com.github.crunc.angular.sample.services

import com.github.crunc.angular.sample.Hero
import ng.api.Provider
import ng.api.http.Http
import rxjs.Observable

class HeroService(private val http: Http) {

    companion object : Provider<HeroService>(
            type = HeroService::class,
            inject = arrayOf(Http)
    )

    fun getHeroes(): Observable<Array<Hero>> {
        return http.get("api/heroes")
                .map { res -> res.json()["data"] }
    }

    fun getAllHeroes(): Observable<Hero> = getHeroes()
            .mergeMap(Observable.Companion::from)

    fun getHero(heroId: Number): Observable<Hero> = getAllHeroes()
            .first { hero ->
                hero.id == heroId
            }
}
