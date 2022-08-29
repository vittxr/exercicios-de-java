public class Car {
    private int tank_capacity = 50;
    private float current_fuelQty = 0; 
    private int km_per_liter = 15;

    public void fillUp(float liters) {
        if ((current_fuelQty+liters) < tank_capacity) {
           current_fuelQty += liters;
           System.out.println("Quantidade gasolina no tanque: " + current_fuelQty);
        } else {
            throw new java.lang.Error("Você não pode encher o tanque com essa quantidade! Atualmente o tanque está com " + current_fuelQty + " litros. A quantidade máxima que você pode colocar agora é: " + (tank_capacity - current_fuelQty)); 
        }
    }  

    public void move(float distancia) {
        float qtyResult = distancia / km_per_liter;
        if (qtyResult < current_fuelQty) {
            current_fuelQty -= qtyResult;
            System.out.println("Quantidade gasolina no tanque: " + current_fuelQty);
            System.out.println("Quantidade de km percorridos: " + distancia);
        } else {
            throw new java.lang.Error("Você não tem gasolina o suficiente para percorrer essas distância!");
        }
    }
}