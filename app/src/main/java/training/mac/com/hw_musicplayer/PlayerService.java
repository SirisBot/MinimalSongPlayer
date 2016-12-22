package training.mac.com.hw_musicplayer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.jar.Manifest;

import android.content.ContentUris;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.PowerManager;
import android.util.Log;

public class PlayerService extends Service {

    private static final String TAG = "Player_TAG";

    MediaPlayer player;

    public PlayerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        player = MediaPlayer.create(this, R.raw.mdos);

        player.setLooping(true); // Set looping
        player.setVolume(100,100);
        player.start();

        Log.d(TAG, "onCreate: " + "Song Started" + " " + Thread.currentThread());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();

        Log.d(TAG, "onDestroy: " + "Song Stopped" + Thread.currentThread());
    }
}
