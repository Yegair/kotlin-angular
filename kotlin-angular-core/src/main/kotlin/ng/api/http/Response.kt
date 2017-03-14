package ng.api.http

class Response internal constructor(private val _response: ng.http.Response) {

    val status: Int get() = _response.status
    val ok: Boolean get() = _response.ok
    val statusText: String get() = _response.statusText
    val headers: Headers get() = Headers(_response.headers)

    inline fun <reified T> body(): T {
        return json()
    }

    fun json(): dynamic = _response.json()
}