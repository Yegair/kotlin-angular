@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

import org.w3c.dom.events.EventListener

external open class DebugNode(nativeNode: Any, parent: DebugNode, _debugInfo: dynamic) {
    val nativeNode: Any
    val listeners: Array<out EventListener>
    val parent: DebugElement
    val injector: Injector
    val componentInstance: Any
    val context: Any
    val references: dynamic
    val providerTokens: Array<out Any>
    val source: String
}