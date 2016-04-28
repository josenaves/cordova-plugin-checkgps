var exec = require('cordova/exec');

module.exports = {
    isGpsEnabled: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CheckGps", "isGpsEnabled", [name]);
    }
};