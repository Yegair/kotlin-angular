package ng.api.inMemoryWebApi

import kotlin.js.Json

abstract class InMemoryDbService {

    abstract fun createDb(): Json
}

