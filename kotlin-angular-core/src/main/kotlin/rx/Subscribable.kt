@file:JsModule("Rx")
@file:JsNonModule

package rx

external interface Subscribable<out T> {

    fun subscribe(next: (value: T) -> Unit): AnonymousSubscription
}