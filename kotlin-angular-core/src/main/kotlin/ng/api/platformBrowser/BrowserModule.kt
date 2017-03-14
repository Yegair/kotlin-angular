package ng.api.platformBrowser

import ng.api.ModuleReference

class BrowserModule {

    companion object : ModuleReference<Any> {
        override val target: JsClass<Any>  = ng.platformBrowser.BrowserModule::class.js as JsClass<Any>
    }
}