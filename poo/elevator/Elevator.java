import java.util.Arrays;
import java.util.List;

public class Elevator {
    private int capacity; 
    private int floors_qty;
    private int current_floor = 1;
    private int current_amountPeople; 
    
    /* public Elevador(int capacidade, int totalAndares) {
       this.capacidade = capacidade;
       this.totalAndares = totalAndares;
    } */

    public void start(int capacity, int floors_qty) {
        this.capacity = capacity;
        this.floors_qty = floors_qty;
    }

    public void enter() {
        if (current_amountPeople < capacity) {
           current_amountPeople += 1;
        } else {
           throw new java.lang.Error("Elevator is full!");  
        }
    }

    public void leave() {
        if (current_amountPeople != 0) {
            current_amountPeople -= 1;
        } else {
            throw new java.lang.Error("Elevator is empty!");
        }
    }

    public void goUp() {
        if (current_floor < floors_qty) {
            current_floor += 1;
        } else {
            throw new java.lang.Error("Elevator is in last floor!");
        }
    }

    public void goDown() {
        if (current_floor > 1) {
            current_floor -= 1;
        } else {
            throw new java.lang.Error("Elevator is in first floor!");
        }
    }

    public List<String> getElevatorStatus() {
        String[] elevatorStatus = {
            "capacidade: " + Integer.toString(capacity),
            "quantidade de andares: " + Integer.toString(floors_qty), 
            "andar atual: " + Integer.toString(current_floor),
            "quantidade de pessoas atual: " + Integer.toString(current_amountPeople)
        };
        return Arrays.asList(elevatorStatus);
    }
}