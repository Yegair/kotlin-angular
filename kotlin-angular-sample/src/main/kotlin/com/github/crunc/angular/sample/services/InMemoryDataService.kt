package com.github.crunc.angular.sample.services

import ng.api.inMemoryWebApi.InMemoryDbService
import kotlin.js.Json
import kotlin.js.json

class InMemoryDataService : InMemoryDbService() {
    override fun createDb(): Json = json(
            "heroes" to arrayOf(
                    json("id" to 11, "name" to "Mr. Nice"),
                    json("id" to 12, "name" to "Narco"),
                    json("id" to 13, "name" to "Bombasto"),
                    json("id" to 14, "name" to "Celeritas"),
                    json("id" to 15, "name" to "Magneta"),
                    json("id" to 16, "name" to "RubberMan"),
                    json("id" to 17, "name" to "Dynama"),
                    json("id" to 18, "name" to "Dr IQ"),
                    json("id" to 19, "name" to "Magma"),
                    json("id" to 20, "name" to "Tornado")
            )
    )
}