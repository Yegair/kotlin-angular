package ng.api

import kotlin.reflect.KClass
import kotlin.reflect.KProperty

abstract class Component<out T : Any>(
        type: KClass<out T>,
        inject: Array<out ProviderReference<Any>> = emptyArray(),
        val moduleId: String? = null,
        val selector: String,
        val template: String? = null,
        val templateUrl: String? = null,
        val styles: Array<out String> = emptyArray(),
        val styleUrls: Array<out String> = emptyArray(),
        val inputs: Array<out KProperty<*>> = emptyArray()
) : Metadata<T>, ComponentReference<T> {

    override val target: JsClass<out T> = create(
            type = type.js,
            inject = inject.toTarget(),
            moduleId = moduleId,
            selector = selector,
            template = template,
            templateUrl = templateUrl,
            styles = styles,
            styleUrls = styleUrls,
            inputs = createInputs(inputs)
    )

    companion object {

        fun <T : Any> create(
                type: JsClass<out T>,
                inject: Array<out JsClass<out Any>> = emptyArray(),
                moduleId: String? = null,
                selector: String,
                template: String? = null,
                templateUrl: String? = null,
                styles: Array<out String> = emptyArray(),
                styleUrls: Array<out String> = emptyArray(),
                inputs: Array<out String> = emptyArray()
        ): JsClass<out T> {

            return ng.core.Component(
                    ng.core.ComponentOptions(
                            moduleId = moduleId,
                            selector = selector,
                            template = template,
                            templateUrl = templateUrl,
                            styles = styles,
                            styleUrls = styleUrls,
                            inputs = inputs
                    )
            ).Class(
                    ng.core.ClassDefinition(constructor = inject.plus(type))
            )
        }

        private fun createInputs(inputs: Array<out KProperty<*>>): Array<out String>
                = inputs.map(KProperty<*>::name).toTypedArray()
    }
}