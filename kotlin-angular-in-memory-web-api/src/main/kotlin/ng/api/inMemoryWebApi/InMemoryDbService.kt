package ng.api.inMemoryWebApi

abstract class InMemoryDbService {

    abstract fun createData(): InMemoryData

    fun createDb(): dynamic {

        val data = createData()
        val db: dynamic = js("({})")

        data.collections.forEach {

            val values: dynamic = js("([])")

            it.values.forEach {

                values.push(it)
            }

            db[it.name] = values
        }

        console.log(db)

        return db
    }
}

