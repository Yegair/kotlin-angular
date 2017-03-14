package ng.api.forms

import ng.api.ModuleReference

class FormsModule {

    companion object : ModuleReference<Any> {
        override val target: JsClass<Any> = ng.forms.FormsModule::class.js as JsClass<Any>
    }
}