@file:JsModule("Rx")
@file:JsNonModule

package rx

external interface AnonymousSubscription {
    fun unsubscribe(): Unit
}