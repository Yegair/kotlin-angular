@file:JsModule(NgCoreModule)
@file:JsNonModule

package ng.core

import kotlin.js.*

external interface PlatformRef {
    fun <T : Any> bootstrapModule(moduleRef: JsClass<out T>): Promise<dynamic>
}

