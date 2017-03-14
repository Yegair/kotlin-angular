package ng.api

import kotlin.reflect.KClass

abstract class Module<out T : Any>(
        type: KClass<out T>,
        providers: Array<out ProviderReference<Any>> = emptyArray(),
        declarations: Array<out ComponentReference<out Any>> = emptyArray(),
        imports: Array<out ModuleReference<*>> = emptyArray(),
        exports: Array<out ModuleReference<*>> = emptyArray(),
        entryComponents: Array<out ComponentReference<*>> = emptyArray(),
        bootstrap: Array<out ComponentReference<*>> = emptyArray()
) : Metadata<T>, ModuleReference<T> {

    override val target: JsClass<out T> = create(
            type = type.js,
            providers = providers.toTarget(),
            declarations = declarations.toTarget(),
            imports = imports.toTarget(),
            exports = exports.toTarget(),
            entryComponents = entryComponents.toTarget(),
            bootstrap = bootstrap.toTarget()
    )

    companion object {

        fun <T : Any> create(
                type: JsClass<out T>,
                providers: Array<out JsClass<out Any>> = emptyArray(),
                declarations: Array<out JsClass<out Any>> = emptyArray(),
                imports: Array<out JsClass<out Any>> = emptyArray(),
                exports: Array<out JsClass<out Any>> = emptyArray(),
                entryComponents: Array<out JsClass<out Any>> = emptyArray(),
                bootstrap: Array<out JsClass<out Any>> = emptyArray()
        ): JsClass<out T> {
            return ng.core.NgModule(
                    ng.core.NgModuleOptions(
                            providers = providers,
                            declarations = declarations,
                            imports = imports,
                            exports = exports,
                            entryComponents = entryComponents,
                            bootstrap = bootstrap
                    )
            ).Class(ng.core.ClassDefinition(type))
        }
    }
}