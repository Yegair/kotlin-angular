package com.github.crunc.angular.sample

import com.github.crunc.angular.sample.components.AppComponent
import com.github.crunc.angular.sample.components.DashboardComponent
import com.github.crunc.angular.sample.components.HeroDetailComponent
import com.github.crunc.angular.sample.components.HeroesComponent
import com.github.crunc.angular.sample.services.HeroService
import com.github.crunc.angular.sample.services.InMemoryDataService
import ng.api.Module
import ng.api.forms.FormsModule
import ng.api.http.HttpModule
import ng.api.inMemoryWebApi.InMemoryWebApiModule
import ng.api.platformBrowser.BrowserModule

class AppModule {

    companion object : Module<AppModule>(
            type = AppModule::class,
            imports = arrayOf(
                    BrowserModule,
                    FormsModule,
                    HttpModule,
                    InMemoryWebApiModule.forRoot(InMemoryDataService::class),
                    AppRoutingModule
            ),
            providers = arrayOf(HeroService),
            declarations = arrayOf(
                    AppComponent,
                    DashboardComponent,
                    HeroesComponent,
                    HeroDetailComponent
            ),
            bootstrap = arrayOf(AppComponent)
    )
}