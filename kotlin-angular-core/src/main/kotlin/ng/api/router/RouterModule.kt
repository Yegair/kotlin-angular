package ng.api.router

import ng.api.ComponentReference
import ng.api.DirectModuleReference
import ng.api.Module
import ng.api.ModuleReference

class Route(
        val path: String,
        val redirectTo: String? = null,
        val pathMatch: String? = null,
        val component: ComponentReference<*>? = null
)

typealias Routes = Array<Route>

private val RouterModuleRef = ModuleReference.of(ng.router.RouterModule::class.js)

class RouterModule {

    companion object : DirectModuleReference(ng.router.RouterModule::class.js) {

        private fun routeOptions(route: Route): dynamic {
            val opts: dynamic = js("({})")

            opts["path"] = route.path

            if (route.redirectTo != null) {
                opts["redirectTo"] = route.redirectTo
            }

            if (route.pathMatch != null) {
                opts["pathMatch"] = route.pathMatch
            }

            if (route.component != null) {
                opts["component"] = route.component.target
            }

            return opts
        }

        fun forRoot(routes: Routes): ModuleReference<*> {

            val opts = routes.map(RouterModule.Companion::routeOptions).toTypedArray()

            val module: JsClass<out RouterModule> = Module.create(
                    type = RouterModule::class.js,
                    providers = arrayOf(Router.target),
                    imports = arrayOf(ng.router.RouterModule.forRoot(opts)),
                    exports = arrayOf(ng.router.RouterModule::class.js)
            )

            return ModuleReference.of(module)
        }
    }
}