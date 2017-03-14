package ng.api.router

import ng.api.Provider
import kotlin.js.Promise

@Suppress("UnsafeCastFromDynamic")
class Router internal constructor(private val router: ng.router.Router) {

    companion object : Provider<Router>(
            type = Router::class,
            injectInternal = arrayOf(ng.router.Router::class.js)
    )

    fun navigate(commands: Array<*>): Promise<Boolean> {
        return this.router.navigate(commands = commands.map { it -> it as Any }.toTypedArray())
    }
}