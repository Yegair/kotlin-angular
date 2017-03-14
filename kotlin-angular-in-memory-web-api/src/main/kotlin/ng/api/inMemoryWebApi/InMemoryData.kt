package ng.api.inMemoryWebApi

class InMemoryData private constructor(val collections: Array<Collection>) {

    constructor(name: String, supplier: () -> Array<Any>)
            : this(arrayOf(Collection(name, supplier())))

    fun and(name: String, supplier: () -> Array<Any>): InMemoryData
            = InMemoryData(collections + Collection(name, supplier()))
}

class Collection(val name: String, val values: Array<Any>)