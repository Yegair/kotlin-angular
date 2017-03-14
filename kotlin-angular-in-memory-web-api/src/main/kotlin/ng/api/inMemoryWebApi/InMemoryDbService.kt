package ng.api.inMemoryWebApi

import kotlin.js.Json

abstract class InMemoryDbService {

    abstract fun createDb(): Json

//    fun createDb(): Json {
//
//        val data = createData()
//        val db: dynamic = js("({})")
//
//        data.collections.forEach {
//
//            val values: dynamic = js("([])")
//
//            it.values.forEach {
//
//                values.push(it)
//            }
//
//            db[it.name] = values
//        }
//
//        console.log(db)
//
//        return db
//    }
}

