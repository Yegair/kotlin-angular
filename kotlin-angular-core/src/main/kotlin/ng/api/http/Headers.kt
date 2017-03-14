package ng.api.http

class Headers internal constructor(private val _headers: ng.http.Headers) {

    operator fun get(name:String): Header
        = Header(name, _headers.getAll(name))
}