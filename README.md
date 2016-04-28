# cordova-plugin-checkgps

A simple Cordova plugin to check if the GPS is enabled on Android

If you always wanted a simple and straight way to check GPS on Android, here is your plugin.


## Instalation

Go to your Cordova project and type:

```
> cordova add plugin cordova-plugin-checkgps
```

## Use in a Cordova app

``` javascript
    if (typeof cordova !== 'undefined') {
      checkgps.isGpsEnabled(
        function(msg) {
          // success - do what you need
          console.log(msg);
        },
        function(err) {
          console.error(err);
        }
      );
    }
```
