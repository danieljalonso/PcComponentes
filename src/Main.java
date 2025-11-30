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


    }
}