@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

external class ComponentRef<out C : Any> {
    val location: ElementRef
    val injector: Injector
    val instance: C
    val hostView: ViewRef
    val changeDetectorRef: ChangeDetectorRef
    val componentType: JsClass<out C>
    fun destroy(): Unit
    fun onDestroy(callback: () -> Unit): Unit
}