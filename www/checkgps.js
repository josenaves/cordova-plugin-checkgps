var exec = require('cordova/exec');

module.exports = {
    checkgps: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CheckGps", "isGpsEnabled", [name]);
    }
};