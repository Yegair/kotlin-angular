@file:JsModule("ng")
@file:JsQualifier("core.testing")
@file:JsNonModule

package ng.core.testing

import ng.core.*
import kotlin.js.*

external internal fun async(work: () -> Unit): () -> Promise<Any>

external interface TestingModuleOptions {
    val declarations: Array<out JsClass<out Any>>
}

external internal class TestBed {

    companion object {
        fun configureTestingModule(options: dynamic): TestBed
        fun <T : Any> createComponent(reference: JsClass<T>): ComponentFixture<T>
    }

    fun compileComponents(): Promise<Any>
}

external internal class ComponentFixture<out T : Any>(componentRef: ComponentRef<T>, ngZone: NgZone, _autoDetect: Boolean) {

    val componentRef: ComponentRef<T>
    val ngZone: NgZone
    val changeDetectorRef: ChangeDetectorRef
    val elementRef: ElementRef
    val debugElement: DebugElement
    val componentInstance: T
    val nativeElement: Any

    fun detectChanges(): Unit
    fun detectChanges(checkNoChanges: Boolean): Unit
    fun checkNoChanges(): Unit
    fun autoDetectChanges(): Unit
    fun autoDetectChanges(autoDetect: Boolean)
    fun isStable(): Boolean
    fun whenStable(): Promise<Boolean>
    fun destroy(): Unit
}
