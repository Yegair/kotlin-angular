@file:JsModule("ng")
@file:JsQualifier("core")
@file:JsNonModule

package ng.core

import kotlin.js.*

external internal interface ClassBuilder {
    fun <T : Any> Class(definition: ClassDefinition): JsClass<out T>
}

external internal fun NgModule(options: NgModuleOptions): ClassBuilder

external internal fun Component(options: ComponentOptions): ClassBuilder

external internal fun Injectable(): ClassBuilder

external internal interface PlatformRef {
    fun <T : Any> bootstrapModule(moduleRef: JsClass<out T>): Promise<dynamic>
}
