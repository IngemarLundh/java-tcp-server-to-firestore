package comtest.example;

public class DataHolder {
    static boolean light = false;


    static void interpreter(String input){
        if(input.equalsIgnoreCase("lightON")){
            light = true;
        } else {
            light = false;
        }

    } //end of interpreter

    //Returns a string that describes the 3 booleans, (Light, Door and Window)
    static String displayValues(){
        String msg = "";
        if(light){
            msg = msg + "Light:ON, ";
        } else {
            msg = msg + "Light:OFF, ";
        }

        return msg;
    } //end of displayValue()
}
