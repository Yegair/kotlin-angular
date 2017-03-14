package com.github.crunc.angular.sample.components

import ng.api.Component

class AppComponent {

    companion object : Component<AppComponent>(
            type = AppComponent::class,
            selector = "my-app",
            templateUrl = "components/AppComponent.html",
            styleUrls = arrayOf("components/AppComponent.css")
    )

    val title = "Tour of Heroes"
}