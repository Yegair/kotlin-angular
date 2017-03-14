package ng.api

abstract class DirectModuleReference(override val target: JsClass<out Any>) : ModuleReference<Any> {

//    constructor(target: JsClass<out Any>): this(target as JsClass<Any>)
}