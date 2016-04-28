package com.josenaves.plugin;

import android.util.Log;
import android.location.LocationManager;
import android.content.Context;

import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

public class CheckGps {

	private static final String TAG = CheckGps.class.getSimpleName();

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("isGpsEnabled".equals(action)) {

        	if (isGpsEnabled()) {
        		callbackContext.success("GPS is enabled");	
        	} else  {
        		callbackContext.error("GPS is not enabled");
        	}
            
            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }	

	private boolean isGpsEnabled() {
		LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		boolean enabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
		Log.d(TAG, String.format("CheckGps.isGpsEnabled() = %s", enabled) );
		return enabled;
	}
}