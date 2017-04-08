package ng.core

external interface ClassBuilder {
    fun <T : Any> Class(definition: ClassDefinition): JsClass<out T>
}
