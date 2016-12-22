package training.mac.com.hw_musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSong(View view) {
        Intent intent = new Intent(this, PlayerService.class);
        startService(intent);
    }

    public void stopSong(View view) {
        Intent intent = new Intent(this, PlayerService.class);
        stopService(intent);
    }
}
