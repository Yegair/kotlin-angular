package com.github.crunc.angular.sample.services

import com.github.crunc.angular.sample.Hero
import ng.api.inMemoryWebApi.InMemoryData
import ng.api.inMemoryWebApi.InMemoryDbService

class InMemoryDataService : InMemoryDbService() {
    override fun createData(): InMemoryData {
        val data = InMemoryData("heroes") {
            arrayOf(
                    Hero(id = 11, name = "Mr. Nice"),
                    Hero(id = 12, name = "Narco"),
                    Hero(id = 13, name = "Bombasto"),
                    Hero(id = 14, name = "Celeritas"),
                    Hero(id = 15, name = "Magneta"),
                    Hero(id = 16, name = "RubberMan"),
                    Hero(id = 17, name = "Dynama"),
                    Hero(id = 18, name = "Dr IQ"),
                    Hero(id = 19, name = "Magma"),
                    Hero(id = 20, name = "Tornado")
            )
        }

        console.log(data)

        return data
    }
}