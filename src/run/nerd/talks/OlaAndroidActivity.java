package run.nerd.talks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OlaAndroidActivity extends Activity {
	/** Called when the activity is first created. */

	private Button helloButton;
	private int counter = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		helloButton = (Button) findViewById(R.id.helloButton);
		helloButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				helloButton.setText("clicou " + counter++);
			}
		});
	}

}