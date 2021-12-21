public class CarSpeed extends Car{
    public Integer speed;

    public void Stop (CarSpeed car2) {
        if (speed > 300) {
            System.out.println("Stop");
        }
    }
}
