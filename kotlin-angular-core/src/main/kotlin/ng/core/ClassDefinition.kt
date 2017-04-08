package ng.core

class ClassDefinition(val constructor: Array<out JsClass<out Any>>) {
    constructor(type: JsClass<out Any>) : this(arrayOf(type))
}

