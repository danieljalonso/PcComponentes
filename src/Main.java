import dominio.*;

public class Main {
    public static void main(String[] args) {

        // Me creo un procesador en blanco
        CPU cpu = new CPU();

        // Asigno los valores
        cpu.setTipo("AMD");
        cpu.setGeneracion("7");
        cpu.setNucleo("i7");
        cpu.setMemCache("2Mb");
        cpu.setVelocidad("3.6Ghz");

        // Imprimo cada valor
        System.out.println(cpu.getTipo());
        System.out.println(cpu.getGeneracion());
        System.out.println(cpu.getNucleo());
        System.out.println(cpu.getMemCache());
        System.out.println(cpu.getVelocidad());

        // Me creo una memoria en blanco
        Almacenamiento almacenamiento = new Almacenamiento();

        // Asigno los valores
        almacenamiento.setTipo("SSD");
        almacenamiento.setCapacidad("2TB");
        almacenamiento.setVelocidad("1.2 GB/s");

        // Imprimo cada valor
        System.out.println(almacenamiento.getTipo());
        System.out.println(almacenamiento.getCapacidad());
        System.out.println(almacenamiento.getVelocidad());

        // Me creo una placa base en blanco
        PlacaBase placa = new PlacaBase();

        // Asigno los valores
        placa.setSocket("LGA");
        placa.setPCI("4");

        // Imprimo cada valor
        System.out.println(placa.getSocket());
        System.out.println(placa.getPCI());

        // Me creo una torre vacia
        Torre torre = new Torre();

        // Asigno los valores
        torre.setTipo("ATX");
        torre.setTamanio("60 x 25 x 30");

        // Imprimo cada valor
        System.out.println(torre.getTipo());
        System.out.println(torre.getTamanio());

        // Me creo una memoria en blanco
        Memoria memoria = new Memoria();

        // Asigno los valores
        memoria.setTipo("DDR4");
        memoria.setCapacidad("8 GB");
        memoria.setVelocidad("3.6 GHz");

        // Imprimo cada valor
        System.out.println(memoria.getTipo());
        System.out.println(memoria.getCapacidad());
        System.out.println(memoria.getVelocidad());

        // Me creo una refrigeracion en blanco
        Refrigeracion refrigeracion = new Refrigeracion();

        // Asigno los valores
        refrigeracion.setTipo("Aire");
        refrigeracion.setPotencia("120mm");

        // Imprimo cada valor
        System.out.println(refrigeracion.getTipo());
        System.out.println(refrigeracion.getPotencia());

    }
}