import dominio.CPU;

public class Main {
    public static void main(String[] args) {

        // Me creo el primer procesador en blanco
        CPU cpu = new CPU();

        // Asigno los valores del primer procesador
        cpu.setTipo("AMD");
        cpu.setGeneracion("7");
        cpu.setNucleo("i7");
        cpu.setMemCache("2Mb");
        cpu.setVelocidad("3.6Ghz");

        // Me creo otro procesador en blanco
        CPU cpu2 = new CPU();

        // Asigno los valores del segundo procesador
        cpu2.setTipo("Intel");
        cpu2.setGeneracion("13");
        cpu2.setNucleo("i5");
        cpu2.setMemCache("1Mb");
        cpu2.setVelocidad("1.8Ghz");

        // Imprimo cada valor del primer procesador
        System.out.println(cpu.getTipo());
        System.out.println(cpu.getGeneracion());
        System.out.println(cpu.getNucleo());
        System.out.println(cpu.getMemCache());
        System.out.println(cpu.getVelocidad());

    }
}