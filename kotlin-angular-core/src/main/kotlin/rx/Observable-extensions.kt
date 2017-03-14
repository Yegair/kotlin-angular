package rx

fun <T> Observable<T?>.nonNull(): Observable<T> = filter { value: T? -> value != null }
        .map { value: T? -> value as T }