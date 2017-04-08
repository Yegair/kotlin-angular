@file:JsModule("ng.router")
@file:JsNonModule

package ng.router

import rxjs.Observable
import kotlin.js.*

external internal class RouterModule {

    companion object {
        internal fun forRoot(routes: dynamic): JsClass<*>
    }
}

external internal class Router {

    fun navigate(commands: Array<Any>): Promise<Boolean>
}

external class ActivatedRoute {

    val snapshot: ActivatedRouteSnapshot
    @JsName("params") internal val _params: Observable<dynamic>
}

external class ActivatedRouteSnapshot {

    val params: dynamic
    val queryParams: dynamic
}