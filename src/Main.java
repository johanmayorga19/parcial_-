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
                System.exit(0);
                break;
            case 2:
                if (MayorDeEdad()) {
                    System.out.println("✅ La persona es mayor de edad (18 años o más).");
                } else {
                    System.out.println("❌ La persona es menor de edad.");
                }
                System.exit(0);
                break;
            case 3:
                System.out.print("Ingrese un número: ");
                int numero = input.nextInt();

                if (NumeroPerfecto(numero)) {
                    System.out.println(numero + " es un número perfecto ✅");
                } else {
                    System.out.println(numero + " no es un número perfecto ❌");
                }
                System.exit(0);
                break;
            case 4:
                System.out.print("Ingrese una palabra: ");
                String palabra = input.nextLine();

                if (Palindromo(palabra)) {
                    System.out.println("✅ '" + palabra + "' es un palíndromo.");
                } else {
                    System.out.println("❌ '" + palabra + "' no es un palíndromo.");
                }
                System.exit(0);
                break;
            case 5:
                System.out.print("Ingrese un número: ");
                int numero = input.nextInt();

                if (Capicua(numero)) {
                    System.out.println("✅ " + numero + " es un número capicúa.");
                } else {
                    System.out.println("❌ " + numero + " no es un número capicúa.");
                }
                System.exit(0);
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
                System.out.println("Saliendo del programa");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                break;
        }

        System.out.println();
    } while (opcion != 9);

    input.close();
}



public static void Zodiaco() {
    Scanner input = new Scanner(System.in);

    int mes, año, dia, año_actual, edad;

    System.out.println("Escriba el año actual");
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

public static boolean MayorDeEdad() {
    Scanner input = new Scanner(System.in);

    int diaActual, mesActual, añoActual;
    int diaNacimiento, mesNacimiento, añoNacimiento;


    System.out.println("Ingrese la fecha actual:");
    System.out.print("Día actual: ");
    diaActual = input.nextInt();
    System.out.print("Mes actual: ");
    mesActual = input.nextInt();
    System.out.print("Año actual: ");
    añoActual = input.nextInt();


    System.out.println("\nIngrese su fecha de nacimiento:");
    System.out.print("Día de nacimiento: ");
    diaNacimiento = input.nextInt();
    System.out.print("Mes de nacimiento: ");
    mesNacimiento = input.nextInt();
    System.out.print("Año de nacimiento: ");
    añoNacimiento = input.nextInt();


    int edad = añoActual - añoNacimiento;


    if (mesActual < mesNacimiento ||
            (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
        edad--;
    }


    System.out.println("\nSu edad actual es: " + edad + " años.");

    input.close();

    return edad >= 18;
}

public static boolean NumeroPerfecto(int numero) {
    if (numero <= 0) {
        return false;
    }

    int suma = 0;

    for (int i = 1; i <= numero / 2; i++) {
        if (numero % i == 0) { // Si es divisor
            suma += i;
        }
    }

    return suma == numero;
}

public static boolean Palindromo(String palabra) {
    palabra = palabra.toLowerCase().replace(" ", "");

    int izquierda = 0;
    int derecha = palabra.length() - 1;

    while (izquierda < derecha) {
        if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
            return false;
        }
        izquierda++;
        derecha--;
    }

    return true;
}

public static boolean Capicua(int numero) {
    int original = numero;
    int inverso = 0;

    while (numero > 0) {
        int digito = numero % 10;
        inverso = inverso * 10 + digito;
        numero /= 10;
    }

    return original == inverso;
}