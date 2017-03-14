package ng.api

interface Reference<out T : Any> {
    val target: JsClass<out T>
}

fun <R : Reference<Any>> Array<out R>.toTarget(): Array<out JsClass<out Any>>
        = map { reference -> reference.target }.toTypedArray()