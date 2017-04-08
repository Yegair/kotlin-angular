package ng.api.core.testing

import kotlin.js.Promise

fun async(work: () -> Unit): () -> Promise<Any> {
    return ng.core.testing.async(work)
}
