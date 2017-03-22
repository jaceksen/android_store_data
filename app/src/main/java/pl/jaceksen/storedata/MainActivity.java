package pl.jaceksen.storedata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedRef = new SharedRef(this);
    }

    SharedRef sharedRef;

    public void buSave(View view) {
        EditText etUserName = (EditText) findViewById(R.id.etUserName);
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        sharedRef.SaveData(etUserName.getText().toString(),etPassword.getText().toString());
    }

    public void buLoad(View view) {
    String  data = sharedRef.LadData();
        Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show();
    }
}
