@file:JsModule("ng.http")
@file:JsNonModule

package ng.http

import rxjs.Observable

external internal enum class RequestMethod {
    Get,
    Post,
    Put,
    Delete,
    Options,
    Head,
    Patch
}

external internal enum class ContentType {
    NONE,
    JSON,
    FORM,
    FORM_DATA,
    TEXT,
    BLOB,
    ARRAY_BUFFER
}

external internal enum class ResponseContentType {
    Text,
    Json,
    ArrayBuffer,
    Blobs
}

external internal enum class ResponseType {
    Basic,
    Cors,
    Default,
    Error,
    Opaque,
}

external internal class Headers() {

    constructor(headers: Headers)
    constructor(headers: dynamic)

    fun append(name: String, value: String): Unit
    fun delete(name: String): Unit
    fun forEach(fn: (values: Array<String>, name: String, headers: Map<String, Array<String>>) -> Unit): Unit
    fun get(name: String): String
    fun has(name: String): Boolean
    fun keys(): Array<String>
    fun set(name: String, vararg value: String): Unit
    fun values(): Array<Array<String>>
    fun toJSON(): dynamic
    fun getAll(name: String): Array<String>

    companion object {
        fun fromResponseHeaderString(headersString: String): Headers
    }
}

external internal open class Body {
    fun json(): dynamic
    fun text(): String
    fun arrayBuffer(): dynamic
    fun blob(): dynamic
}

external internal class RequestOptions(
        method: RequestMethod = definedExternally,
        url: String = definedExternally,
        search: String = definedExternally,
        body: Any = definedExternally,
        headers: Headers = definedExternally,
        withCredentials: Boolean = definedExternally,
        responseType: ResponseContentType = definedExternally
) {
    val method: RequestMethod
    val url: String
    val search: String?
    val body: Any?
    val headers: Headers?
    val withCredentials: Boolean?
    val responseType: ResponseContentType
}

external internal class Request(options: RequestOptions) : Body {
    val method: RequestMethod
    val headers: Headers
    val url: String
    val withCredentials: Boolean
    val responseType: ResponseContentType
    fun detectContentType(): ContentType
    fun detectContentTypeFromBody(): ContentType
    fun getBody(): Any
}

external internal class ResponseOptions(
        body: Any = definedExternally,
        status: Int = definedExternally,
        statusText: String = definedExternally,
        headers: Headers = definedExternally,
        type: ResponseType = definedExternally,
        url: String = definedExternally
) {
    val body: Any
    val status: Int
    val statusText: String
    val headers: Headers
    val type: ResponseType
    val url: String
}

external internal class Response(options: ResponseOptions) : Body {
    val status: Int
    val ok: Boolean
    val statusText: String
    val headers: Headers
    val type: ResponseType
    val url: String
}

external internal class Http {

    /* constructor(_backend: ConnectionBackend, _defaultOptions: RequestOptions) */

    fun request(request: Request): Observable<Response>
    fun request(url: String, options: RequestOptions): Observable<Response>
    fun get(url: String): Observable<Response>
    fun get(url: String, options: RequestOptions): Observable<Response>
    fun post(url: String, body: Any): Observable<Response>
    fun post(url: String, body: Any, options: RequestOptions): Observable<Response>
    fun put(url: String, body: Any): Observable<Response>
    fun put(url: String, body: Any, options: RequestOptions): Observable<Response>
    fun delete(url: String): Observable<Response>
    fun delete(url: String, options: RequestOptions): Observable<Response>
    fun patch(url: String, body: Any): Observable<Response>
    fun patch(url: String, body: Any, options: RequestOptions): Observable<Response>
    fun head(url: String): Observable<Response>
    fun head(url: String, options: RequestOptions): Observable<Response>
    fun options(url: String): Observable<Response>
    fun options(url: String, options: RequestOptions): Observable<Response>
}

external internal class HttpModule
