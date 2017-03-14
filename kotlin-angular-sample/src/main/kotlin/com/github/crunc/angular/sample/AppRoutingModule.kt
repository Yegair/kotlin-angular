package com.github.crunc.angular.sample

import ng.api.Module
import ng.api.router.RouterModule

class AppRoutingModule {

    companion object : Module<AppRoutingModule>(
            type = AppRoutingModule::class,
            imports = arrayOf(RouterModule.forRoot(ROUTES)),
            exports = arrayOf(RouterModule)
    )
}