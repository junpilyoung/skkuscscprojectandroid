package edu.skku.junpilyoung.skkujobguide;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import static android.util.Log.d;

public class MyFirebaseInstanceIDService extends Service {
    private static final String TAG = "MyIID";
    public MyFirebaseInstanceIDService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onTokenRefresh(){
        Log.d(TAG, "onTokenRefresh() 호출됨.");

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed Token : "+refreshedToken);
    }
}
