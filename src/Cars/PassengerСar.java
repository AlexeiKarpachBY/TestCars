package Cars;

public class PassengerСar extends Car {

    protected int numberOfPassengerSeats;
    protected boolean isPassengerInCar = false;

    protected PassengerСar() {
    }

    public PassengerСar(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    protected void boardingPassengers(int numberOfPassenger) {
        if (isPassengerInCar == false & numberOfPassenger <= numberOfPassengerSeats) {
            isPassengerInCar = true;
            System.out.println("Passenger in car");
        }
    }

    protected void disembarkingPassengers() {
        isPassengerInCar = false;
        System.out.println("Passengers disembarked");
    }

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }
}
