package com.github.crunc.angular.sample.components

import jasmine.beforeEach
import jasmine.describe
import jasmine.it
import ng.api.core.testing.TestBed
import ng.api.core.testing.async

val spec = describe("HeroDetailComponent") {

    beforeEach { ->
        async {
            TestBed.configureTestingModule(
                    declarations = arrayOf(HeroDetailComponent)
            ).compileComponents()
        }
    }

    it("should run") { ->
        console.log("running...")
    }
}