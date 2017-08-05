package rodrigococate.com.br.a13mobfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        // Esta linha indica que será inscrito no tópico 'mob'.
        FirebaseMessaging.getInstance().subscribeToTopic("mob");
    }

    public void clickMe(View view) {
        Bundle params = new Bundle();
        params.putString("NOME", "Cocate");
        mFirebaseAnalytics.logEvent("clickMe", params);
    }

    public void forcarCrash(View view) {
        int r = 2 / 0;
    }
}
