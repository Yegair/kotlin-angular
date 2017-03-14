package ng.api.router

interface Params {

    operator fun <T : Any> get(name: String): T
}