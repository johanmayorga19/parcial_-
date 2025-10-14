//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("==================================");
        System.out.println("     PARCIAL 1  ");
        System.out.println("==================================");
        System.out.println("1. Zodiaco");
        System.out.println("2. Validador mayoria de edad");
        System.out.println("3. Validador numero perfecto");
        System.out.println("4. Validador palindromo");
        System.out.println("5. Validador capicua");
        System.out.println("6. Morse a texto");
        System.out.println("7. Texto a morse ");
        System.out.println("8. Gestor de Caballeros");
        System.out.println("9. Juego");
        System.out.println("10. Salir");
        System.out.println("==================================");
        System.out.print("Seleccione una opción: ");

        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                Zodiaco();
                break;
            case 2:
                System.out.println("Caballero: Aldebarán de Tauro 🐂");
                break;
            case 3:
                System.out.println("Caballero: Saga de Géminis ♊");
                break;
            case 4:
                System.out.println("Caballero: Máscara de Muerte de Cáncer ♋");
                break;
            case 5:
                System.out.println("Caballero: Aioria de Leo 🦁");
                break;
            case 6:
                System.out.println("Caballero: Shaka de Virgo 🌾");
                break;
            case 7:
                System.out.println("Caballero: Dohko de Libra ⚖️");
                break;
            case 8:
                System.out.println("Caballero: Milo de Escorpio 🦂");
                break;
            case 9:
                break;
            case 10:
                System.out.println("Saliendo del programa... 👋");
                break;
            default:
                System.out.println("❌ Opción inválida. Intente de nuevo.");
        }

        System.out.println(); // Espacio entre iteraciones
    } while (opcion != 9); // Se repite hasta que elija salir

    input.close();
}



public static void Zodiaco() {
    Scanner input = new Scanner(System.in);

    int mes, año, dia, año_actual, edad;

    System.out.println("Escriba su año actual");
    año_actual = input.nextInt();

    if (año_actual < 0) {
        System.out.println("Escribio un año invalido");
        System.exit(0);
    }

    System.out.println("Escriba su año de nacimiento");
    año = input.nextInt();

    if ((año < 0) || (año >= año_actual)) {
        System.out.println("ingreso un año invalido");
        System.exit(0);
    }

    System.out.println("Escriba su mes de nacimiento");
    mes = input.nextInt();

    if ((mes < 0) || (mes > 12)) {
        System.out.println("ingreso un mes invalido");
        System.exit(0);
    }

    System.out.println("Escriba su dia de nacimiento");
    dia = input.nextInt();

    if (((dia < 0) || (dia > 31)) && ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12))) {
        System.out.println("ingreso un dia invalido");
        System.exit(0);
    }

    if (((dia < 0) || (dia > 30)) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))) {
        System.out.println("ingreso un dia invalido");
        System.exit(0);
    }

    if (((dia < 0) || (dia > 28)) && (mes == 2)) {
        System.out.println("ingreso un dia invalido");
        System.exit(0);
    }

    edad = año_actual - año;

    if (((mes == 3) && (dia >= 21)) || ((mes == 4) && (dia <= 19))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Mu de Aries");
    }

    if (((mes == 4) && (dia >= 20)) || ((mes == 5) && (dia <= 20))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Aldebaran de Tauro");
    }

    if (((mes == 5) && (dia >= 21)) || ((mes == 6) && (dia <= 20))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Saga de Geminis");
    }

    if (((mes == 6) && (dia >= 21)) || ((mes == 7) && (dia <= 22))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Mascara de Muerte de Cancer");
    }

    if (((mes == 7) && (dia >= 23)) || ((mes == 8) && (dia <= 22))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Aioria de Leo");
    }

    if (((mes == 8) && (dia >= 23)) || ((mes == 9) && (dia <= 22))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Shaka de Virgo");
    }

    if (((mes == 9) && (dia >= 23)) || ((mes == 10) && (dia <= 22))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Dokho de Libra");
    }

    if (((mes == 10) && (dia >= 23)) || ((mes == 11) && (dia <= 21))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Milo de Escorpio");
    }

    if (((mes == 11) && (dia >= 22)) || ((mes == 12) && (dia <= 21))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Aioros de Sagitario");
    }

    if (((mes == 12) && (dia >= 22)) || ((mes == 1) && (dia <= 19))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Shura de Capricornio");
    }

    if (((mes == 1) && (dia >= 20)) || ((mes == 2) && (dia <= 18))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Camus de Acuario");
    }

    if (((mes == 2) && (dia >= 19)) || ((mes == 3) && (dia <= 20))) {
        System.out.println("Su edad es: " + edad + " y su caballero del zodiaco es Afrodita de Piscis");
    }

    input.close();
}
