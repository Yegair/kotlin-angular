package ng.router

import ng.api.ProviderReference
import rxjs.Observable

val ActivatedRouteRef: ProviderReference<ActivatedRoute>
    get() = ProviderReference.of(ActivatedRoute::class.js)

interface Params {

    fun get(name: String): String?
    fun string(name: String): String?
    fun int(name: String): Int?
    fun number(name: String): Number?
}

val ActivatedRoute.params: Observable<Params> get() {

    return _params.map { obj: dynamic ->

        object : Params {

            @Suppress("UnsafeCastFromDynamic")
            override fun get(name: String): String?
                    = obj[name]

            override fun string(name: String): String?
                    = get(name)

            override fun int(name: String): Int?
                    = get(name)?.toInt()

            override fun number(name: String): Number?
                    = int(name) as Number
        }
    }
}
