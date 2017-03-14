package ng.core

internal class ClassDefinition(val constructor: Array<out JsClass<out Any>>) {
    constructor(type: JsClass<out Any>) : this(arrayOf(type))
}

internal class NgModuleOptions(
        val providers: Array<out JsClass<out Any>> = emptyArray(),
        val declarations: Array<out JsClass<out Any>> = emptyArray(),
        val imports: Array<out JsClass<out Any>> = emptyArray(),
        val exports: Array<out JsClass<out Any>> = emptyArray(),
        val entryComponents: Array<out JsClass<out Any>> = emptyArray(),
        val bootstrap: Array<out JsClass<out Any>> = emptyArray()
)

internal class ComponentOptions(
        val moduleId: String? = null,
        val selector: String,
        val template: String? = null,
        val templateUrl: String? = null,
        val styles: Array<out String> = emptyArray(),
        val styleUrls: Array<out String> = emptyArray(),
        val inputs: Array<out String> = emptyArray()
)