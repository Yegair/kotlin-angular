package ng.api

import kotlin.reflect.KClass

interface ComponentReference<out T : Any> : Reference<T> {

    companion object {

        fun <T : Any> of(target: JsClass<out T>): ComponentReference<T> {
            return object : ComponentReference<T> {
                override val target = target
            }
        }

        fun <T : Any> of(target: KClass<out T>): ComponentReference<T> = of(target.js)
    }
}