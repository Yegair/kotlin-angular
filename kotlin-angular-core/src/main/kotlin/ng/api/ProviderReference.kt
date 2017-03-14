package ng.api

import kotlin.reflect.KClass

interface ProviderReference<out T : Any> : Reference<T> {

    companion object {

        fun <T : Any> of(target: JsClass<out T>): ProviderReference<T> {
            return object : ProviderReference<T> {
                override val target = target
            }
        }

        fun <T : Any> of(target: KClass<out T>): ProviderReference<T>  = of(target.js)
    }
}