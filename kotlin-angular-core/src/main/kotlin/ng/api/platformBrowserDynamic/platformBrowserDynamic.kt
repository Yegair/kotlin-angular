package ng.api.platformBrowserDynamic

import ng.api.ModuleReference

interface PlatformBrowserDynamic {
    fun <T : Any> bootstrapModule(module: ModuleReference<T>)
}

fun platformBrowserDynamic(): PlatformBrowserDynamic {

    val platformRef = ng.platformBrowserDynamic.platformBrowserDynamic()

    return object : PlatformBrowserDynamic {
        override fun <T : Any> bootstrapModule(module: ModuleReference<T>) {
            platformRef.bootstrapModule(module.target)
        }
    }
}
