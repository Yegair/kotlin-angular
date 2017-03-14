@file:JsModule("Rx")
@file:JsNonModule

package rx

external class Observable<out T> : Subscribable<T> {

    override fun subscribe(next: (value: T) -> Unit): AnonymousSubscription

    fun filter(predicate: (value: T) -> Boolean): Observable<T>
    fun first(predicate: (value: T) -> Boolean): Observable<T>
    fun <R> map(project: (value: T) -> R): Observable<R>
    fun <R> mergeMap(project: (value: T) -> Observable<R>): Observable<R>

    fun <R> switchMap(project: (value: T) -> Subscribable<R>): Observable<R>

    companion object {

        fun <T> empty(): Observable<T>
        fun <T> from(subscribable: Subscribable<T>): Observable<T>
        fun <T> from(values: Array<T>): Observable<T>
        fun <T> of(vararg values: T): Observable<T>
    }
}