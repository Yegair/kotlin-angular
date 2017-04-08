@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

import rxjs.Subject

external class EventEmitter<T : Any>(isAsync: Boolean) : Subject<T> {

    constructor()

    fun emit(value: T?)
}
