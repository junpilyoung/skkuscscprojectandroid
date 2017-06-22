package edu.skku.junpilyoung.skkujobguide;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFirebaseMessagingService extends Service {
    private static final String TAG = "MyMS";
    public MyFirebaseMessagingService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onMessageReceived(RemoteMessage remoteMessage){
        Log.d(TAG, "onMessageReceived() 호출됨.");
        String from = remoteMessage.getFrom();
        Map<String, String> data = remoteMessage.getData();
        String contents = data.get("contents");

        Log.v(TAG,"from : "+from+", contents : "+contents);

        sendToActivity(getApplicationContext(), from, contents);

    }

    private void sendToActivity(Context context, String from, String contents){
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("from",from);
        intent.putExtra("contents",contents);

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|intent.FLAG_ACTIVITY_SINGLE_TOP);

        context.startActivity(intent);
    }
}
