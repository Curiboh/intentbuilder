package be.trikke.intentbuilder.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import be.trikke.intentbuilder.Extra;

public class MySuperClass extends AppCompatActivity {

	@Extra String one;

	@Extra String two;

	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
}
