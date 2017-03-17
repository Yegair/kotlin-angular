module.exports = function foo(config) {
    config.set({
        basePath: '',
        frameworks: ['jasmine'],
        plugins: [
            require('karma-jasmine'),
            require('karma-chrome-launcher'),
            require('karma-firefox-launcher'),
            require('karma-safari-launcher'),
            require('karma-ie-launcher'),
            require('karma-phantomjs-launcher')
        ],
        files: [
            {pattern: test('lib/core-js/shim.js'), watched: false},
            {pattern: test('lib/zone.js/zone.js'), watched: false},
            {pattern: test('lib/zone.js/async-test.js'), watched: false},
            {pattern: test('lib/zone.js/proxy.js'), watched: false},
            {pattern: test('lib/zone.js/sync-test.js'), watched: false},
            {pattern: test('lib/zone.js/jasmine-patch.js'), watched: false},
            {pattern: test('lib/rxjs/Rx.js'), watched: false},
            {pattern: test('lib/angular/core.umd.js'), watched: false},
            {pattern: test('lib/angular/compiler.umd.js'), watched: false},
            {pattern: test('lib/angular/common.umd.js'), watched: false},
            {pattern: test('lib/angular/forms.umd.js'), watched: false},
            {pattern: test('lib/angular/platform-browser.umd.js'), watched: false},
            {pattern: test('lib/angular/platform-browser-dynamic.umd.js'), watched: false},
            {pattern: test('lib/angular/router.umd.js'), watched: false},
            {pattern: test('lib/angular/http.umd.js'), watched: false},
            {pattern: test('lib/angular-in-memory-web-api/in-memory-web-api.umd.js'), watched: false},
            {pattern: test('lib/angular/core-testing.umd.js'), watched: false},
            {pattern: test('kotlin.js'), watched: false},
            {pattern: test('kotlin-rxjs.js'), watched: false},
            {pattern: test('kotlin-jasmine-core.js'), watched: false},
            {pattern: test('kotlin-angular-core.js'), watched: false},
            {pattern: test('kotlin-angular-in-memory-web-api.js'), watched: false},
            {pattern: test('kotlin-angular-core-test.js'), watched: false},
            {pattern: main('kotlin-angular-sample.js'), watched: false},
            {pattern: test('kotlin-angular-sample-test.js'), watched: false},
            {pattern: test("components/*.html"), included: false, served: true, watched: false},
            {pattern: test("components/*.css"), included: false, served: true, watched: false}
        ],
        proxies: {
            '/': '/base'
        },
        client: {
            clearContext: false
        },
        port: 9876,
        logLevel: config['LOG_DEBUG'],
        browsers: ['Chrome'],
        colors: false,
        singleRun: true
    })
};

function test(file) {
    return './' + file;
}

function main(file) {
    return '../js/' + file;
}