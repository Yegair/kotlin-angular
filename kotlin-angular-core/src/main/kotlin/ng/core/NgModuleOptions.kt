package ng.core

class NgModuleOptions(
        val providers: Array<out JsClass<out Any>> = emptyArray(),
        val declarations: Array<out JsClass<out Any>> = emptyArray(),
        val imports: Array<out JsClass<out Any>> = emptyArray(),
        val exports: Array<out JsClass<out Any>> = emptyArray(),
        val entryComponents: Array<out JsClass<out Any>> = emptyArray(),
        val bootstrap: Array<out JsClass<out Any>> = emptyArray()
)