package ng.api.core.testing

fun async(work: () -> Unit): () -> Unit {
    return ng.core.testing.async(work)
}
