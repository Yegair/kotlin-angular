@file:JsModule("ng")
@file:JsQualifier("core.testing")
@file:JsNonModule

package ng.core.testing

import kotlin.js.Promise

external internal fun async(work: () -> Unit): () -> Unit

external interface TestingModuleOptions {
    val declarations: Array<out JsClass<out Any>>
}

external internal class TestBed {

    companion object {
        fun configureTestingModule(options: dynamic): TestBed
    }

    fun compileComponents(): Promise<Any>
}
