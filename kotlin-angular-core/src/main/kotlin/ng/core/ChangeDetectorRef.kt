@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

external open class ChangeDetectorRef {
    fun markForCheck(): Unit
    fun detach(): Unit
    fun detectChanges(): Unit
    fun checkNoChanges(): Unit
    fun reattach(): Unit
}