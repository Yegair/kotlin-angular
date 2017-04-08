package ng.core

class ComponentOptions(
        val moduleId: String? = null,
        val selector: String,
        val template: String? = null,
        val templateUrl: String? = null,
        val styles: Array<out String> = emptyArray(),
        val styleUrls: Array<out String> = emptyArray(),
        val inputs: Array<out String> = emptyArray()
)