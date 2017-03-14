package ng.api.http

class Header (val name: String, private val values: Array<out String>) {

    constructor(name:String, vararg values: String) : this(name, values)

}