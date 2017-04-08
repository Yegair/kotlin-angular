package ng.api.http

import ng.api.Provider
import rxjs.Observable

class Http internal constructor(private val http: ng.http.Http) {

    companion object : Provider<Http>(
            type = Http::class,
            injectInternal = arrayOf(ng.http.Http::class.js)
    )

    fun get(url: String): Observable<Response> = http.get(url).map(this::mapResponse)

    private fun mapResponse(response: ng.http.Response): Response {
        return Response(response)
    }
}