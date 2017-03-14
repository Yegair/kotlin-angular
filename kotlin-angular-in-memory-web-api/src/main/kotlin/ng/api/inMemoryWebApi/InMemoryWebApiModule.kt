package ng.api.inMemoryWebApi

import ng.api.DirectModuleReference
import ng.api.Module
import ng.api.ModuleReference
import kotlin.reflect.KClass

class InMemoryWebApiModule {

    companion object : DirectModuleReference(ng.inMemoryWebApi.InMemoryWebApiModule::class.js) {

        fun <T : InMemoryDbService> forRoot(
                dbCreator: KClass<out T>,
                options: Options? = null
        ): ModuleReference<Any> {

            val forRoot = when (options) {
                is Options -> ng.inMemoryWebApi.InMemoryWebApiModule.forRoot(dbCreator.js, asOptions(options))
                else -> ng.inMemoryWebApi.InMemoryWebApiModule.forRoot(dbCreator.js)
            }

            val ref = Module.create(
                    type = InMemoryWebApiModule::class.js,
                    imports = arrayOf(forRoot),
                    exports = arrayOf(ng.inMemoryWebApi.InMemoryWebApiModule::class.js)
            )

            return ModuleReference.Companion.of(ref)
        }

        private fun asOptions(options: Options): dynamic {

            val opts: dynamic = Any()

            if (options.delay is Number) {
                opts.delay = options.delay
            }

            return opts
        }
    }

    inner class Options(
            val delay: Number? = null
    )
}