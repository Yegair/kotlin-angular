package ng.api

import kotlin.reflect.KClass

interface ModuleReference<out T : Any> : Reference<T> {

    companion object {

        fun <T : Any> of(target: JsClass<out T>): ModuleReference<T> {
            return object : ModuleReference<T> {
                override val target = target
            }
        }

        fun <T : Any> of(target: KClass<out T>): ModuleReference<T>
                = of(target.js)
    }
}