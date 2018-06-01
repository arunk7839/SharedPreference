package c1c.sharedpreferenceexp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Save the data in shared Preference.
        SharedPreferences sharedPreferences=getSharedPreferences("App",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();

        editor.putBoolean("bool",true);
        editor.putFloat("float",1.0f);
        editor.putInt("int",1);
        editor.putLong("long",1);
        editor.putString("String","string");

        Set<String> set=new HashSet<String>();
        set.add("element1");
        set.add("element2");
        set.add("element3");
        set.add("element4");
        editor.putStringSet("stringSet",set);
        editor.apply();


        //get the data from shared Prefernces.
        SharedPreferences sharedPref = getSharedPreferences("App",MODE_PRIVATE);



        boolean bool=sharedPref.getBoolean("bool",false);
        Log.e("bool ",""+bool);

        float floatValue=sharedPref.getFloat("float",0);
        Log.e("floatValue ",""+floatValue);


        int intValue=sharedPref.getInt("int",0);
        Log.e("int ",""+intValue);

        long longValue=sharedPref.getLong("long",0);
        Log.e("long ",""+longValue);

        String stringValue=sharedPref.getString("string","");
        Log.e("stringValue ",""+stringValue);


        Set<String> setvalue=sharedPref.getStringSet("stringSet",null);
        Log.e("setValue ",""+setvalue);


    }
}
