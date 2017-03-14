@file:JsModule("ng")
@file:JsQualifier("inMemoryWebApi")
@file:JsNonModule

package ng.inMemoryWebApi

external internal abstract class InMemoryDbService {

    abstract fun createDb(): dynamic
}

external internal class InMemoryWebApiModule {

    companion object {
        fun forRoot(dbCreator: JsClass<out Any>): JsClass<out Any>
        fun forRoot(dbCreator: JsClass<out Any>, options: dynamic): JsClass<out Any>
    }
}