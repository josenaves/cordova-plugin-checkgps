var exec = require('cordova/exec');

module.exports = {
    isGpsEnabled: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CheckGps", "isGpsEnabled", []);
    }
};
