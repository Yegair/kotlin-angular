package ng.api.core.testing

import ng.api.ComponentReference
import ng.api.toTarget
import kotlin.js.Promise

class TestBed internal constructor(private val _testBed: ng.core.testing.TestBed) {

    fun compileComponents(): Promise<Any> {
        return _testBed.compileComponents()
    }

    companion object {

        fun configureTestingModule(
                declarations: Array<ComponentReference<Any>> = emptyArray()
        ): TestBed {

            val options: dynamic = js("({})")

            if (!declarations.isEmpty()) {
                options.declarations = declarations.toTarget()
            }

            return TestBed(ng.core.testing.TestBed.configureTestingModule(options))
        }

        fun <T: Any> createComponent(reference: ComponentReference<T>): ComponentFixture<T> {
            val fixture = ng.core.testing.TestBed.createComponent(reference.target)
            return ComponentFixture(fixture)
        }
    }
}