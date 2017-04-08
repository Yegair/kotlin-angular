package ng.api.core.testing

class ComponentFixture<out T: Any> internal constructor(private val _fixture: ng.core.testing.ComponentFixture<T>) {

    val debugElement get() = _fixture.debugElement
}