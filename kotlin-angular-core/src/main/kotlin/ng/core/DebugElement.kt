@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

external class DebugElement(nativeNode: Any, parent: Any, _debugInfo: dynamic) : DebugNode {
    val name: String
    val properties: dynamic
    val attributes: dynamic
    val classes: dynamic
    val styles: dynamic
    val childNodes: Array<DebugNode>
    val nativeElement: Any
    val children: Array<DebugElement>

    fun addChild(child: DebugNode)
    fun removeChild(child: DebugNode)
    fun insertChildrenAfter(child: DebugNode, newChildren: Array<out DebugNode>)
    fun query(predicate: (DebugElement) -> Boolean): DebugElement
    fun queryAll(predicate: (DebugElement) -> Boolean): Array<out DebugElement>
    fun queryAllNodes(predicate: (DebugNode) -> Boolean): Array<out DebugNode>
    fun triggerEventHandler(eventName: String, eventObj: Any)
}