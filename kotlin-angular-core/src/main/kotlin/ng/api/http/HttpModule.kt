package ng.api.http

import ng.api.Module
import ng.api.ModuleReference

class HttpModule {

    companion object : Module<HttpModule>(
            type = HttpModule::class,
            imports = arrayOf(ModuleReference.of(ng.http.HttpModule::class)),
            exports = arrayOf(ModuleReference.of(ng.http.HttpModule::class)),
            providers = arrayOf(Http)
    )
}