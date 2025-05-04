package ArrayQuestion.FirstProject;

public class CarDetails {
    String Str="Welcome car details";
    int carModel=2024;
    int carSpeed=240;
    int carBuyyear=2019;
    int caryearCheck=2025-carBuyyear;

    int CarBuyyear(int n){
        System.out.println("your car is "+caryearCheck+" year old");
        return caryearCheck;
    }
}
