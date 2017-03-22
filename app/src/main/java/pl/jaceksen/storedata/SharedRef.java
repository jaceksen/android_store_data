package pl.jaceksen.storedata;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jsen on 21.03.17.
 */

public class SharedRef {

    SharedPreferences SharedRef;

    public SharedRef(Context context){

        SharedRef = context.getSharedPreferences("myRef",Context.MODE_PRIVATE);
    }

    public void SaveData(String UserName, String Password){
        SharedPreferences.Editor editor =  SharedRef.edit();
        editor.putString("UserName",UserName);
        editor.putString("Password", Password);
        editor.commit();
    }

    public String LadData(){
        String fileContent = "UserName: " + SharedRef.getString("UserName","No user name");
        fileContent += "Password: " + SharedRef.getString("Password","No password");
        return fileContent;
    }

}
