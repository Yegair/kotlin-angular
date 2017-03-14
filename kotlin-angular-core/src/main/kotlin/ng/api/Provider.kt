package ng.api

import ng.core.ClassDefinition
import kotlin.reflect.KClass

abstract class Provider<out T : Any> internal constructor(
        type: KClass<out T>,
        injectInternal: Array<JsClass<out Any>>
) : Metadata<T>, ProviderReference<T> {

    constructor(type: KClass<T>) :
            this(type, emptyArray<ProviderReference<Any>>())

    constructor(type: KClass<T>, inject: Array<out ProviderReference<Any>>) :
            this(type, inject.map(ProviderReference<*>::target).toTypedArray())

    override val target: JsClass<out T> = ng.core.Injectable()
            .Class(ClassDefinition(constructor = createCtor(type, injectInternal)))

    private fun createCtor(type: KClass<out T>, inject: Array<out JsClass<out Any>>): Array<out JsClass<out Any>>
            = inject.plus(type.js)
}