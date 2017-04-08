@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

external open class ViewRef : ChangeDetectorRef {
    val destroyed: Boolean
    fun destroy(): Unit
    fun onDestroy(callback: () -> Unit): Any
}