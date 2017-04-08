@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

external class NgZone(options: dynamic) {

    companion object {
        fun isInAngularZone(): Boolean
        fun assertInAngularZone(): Unit
        fun assertNotInAngularZone(): Unit
    }

    fun run(fn: () -> Any): Any
    fun runGuarded(fn: () -> Any): Any
    fun runOutsideAngular(fn: () -> Any): Any
    val onUnstable: EventEmitter<Any>
    val onMicrotaskEmpty: EventEmitter<Any>
    val onStable: EventEmitter<Any>
    val onError: EventEmitter<Any>
    val isStable: Boolean
    val hasPendingMicrotasks: Boolean
    val hasPendingMacrotasks: Boolean
}
