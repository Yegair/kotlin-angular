@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

external class Injector {

    companion object {
        val THROW_IF_NOT_FOUND: Any
        val NULL: Injector
    }

    fun get(token: Any): Any
    fun get(token: Any, notFoundValue: Any): Any
}
