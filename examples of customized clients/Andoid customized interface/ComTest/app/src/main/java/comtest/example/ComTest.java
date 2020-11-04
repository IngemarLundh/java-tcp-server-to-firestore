package comtest.example;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
public class ComTest extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button light = (Button) findViewById(R.id.light);
        final EditText editText = (EditText) findViewById(R.id.editText);
        Thread t = new Thread(){
            public void run(){
                //Thread Implmentation code here
                FireStoreQueries fire = new FireStoreQueries();
                String input = fire.readElement("LightTest", "lightTestdocument2.1", "key3.1");
                DataHolder.interpreter(input);
            }

        };

        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editText.setText(DataHolder.displayValues());
        light.setOnClickListener(new View.OnClickListener() { public void onClick(View v) {
            Thread t = new Thread(){
                public void run(){
                    //Thread Implmentation code here
                    FireStoreQueries fire = new FireStoreQueries();
                    String input = fire.readElement("LightTest", "lightTestdocument2.1", "key3.1");
                    DataHolder.interpreter(input);
                }

            };

            t.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread t2 = new Thread(){
                public void run(){
                    //Thread Implmentation code here
                    if(DataHolder.light){
                        FireStoreQueries fire2 = new FireStoreQueries();
                        fire2.updateElement("LightTest", "lightTestdocument2.1",
                                "key3.1", "lightOFF");
                    } else {
                        FireStoreQueries fire2 = new FireStoreQueries();
                        fire2.updateElement("LightTest", "lightTestdocument2.1",
                                "key3.1", "lightON");
                    }
                }

            };

            t2.start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread t3 = new Thread(){
                public void run(){
                    //Thread Implmentation code here
                    FireStoreQueries fire = new FireStoreQueries();
                    String input = fire.readElement("LightTest", "lightTestdocument2.1", "key3.1");
                    DataHolder.interpreter(input);
                }

            };

            t3.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            Toast.makeText(ComTest.this, msg, Toast.LENGTH_SHORT).show();
            editText.setText(DataHolder.displayValues());
        }
        });


    }
}
