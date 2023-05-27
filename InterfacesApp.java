package interfaces;

public class InterfacesApp {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "Juan",
                "Perez",
                20,
                "UNLP",
                "Informatica",
                "2do"
        );

        Empleado empleado = new Empleado(
                "Pedro",
                "Gomez",
                30,
                "Google",
                "Senior Programmer",
                "150000"
        );

        EstudianteTrabajador estudianteTrabajador = new EstudianteTrabajador(
                "Maria",
                "Gonzalez",
                25,
                "UNLP",
                "Informatica",
                "9no",
                "Facebook",
                "Junior Programmer",
                "100000"
        );

        System.out.println(estudiante.toString());
        System.out.println(empleado.toString());
        System.out.println(estudianteTrabajador.toString());
    }
}
