@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

external class EmbeddedViewRef<out C> : ViewRef {
    val context: C
    val rootNodes: Array<Any>
}