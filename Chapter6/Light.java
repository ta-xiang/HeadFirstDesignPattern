package Chapter6;

public class Light {
    String lightPos;

    public Light(String lightPos){
        this.lightPos = lightPos;
    }
    
    public void on(){
        System.out.println("The" + lightPos + " light is on!");
        //
    }

    public void off(){
        System.out.println("The" + lightPos + " light is off!");
    }
}
