//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public static String[] morse = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
        ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
};

public static char[] letras = {
        'A','B','C','D','E','F','G','H','I','J',
        'K','L','M','N','O','P','Q','R','S','T',
        'U','V','W','X','Y','Z',
        '0','1','2','3','4','5','6','7','8','9'
};

static class Caballero {
    String nombre;
    String constelacion;
    String armadura;
    int cosmos;

    Caballero(String nombre, String constelacion, String armadura, int cosmos) {
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.armadura = armadura;
        this.cosmos = cosmos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Constelación: " + constelacion +
                " | Armadura: " + armadura + " | Cosmos: " + cosmos;
    }
}

void main() {

    Scanner input = new Scanner(System.in);
    int opcion;
    Scanner scanner = new Scanner(System.in);

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
                int numeroc = input.nextInt();

                if (Capicua(numeroc)) {
                    System.out.println("✅ " + numeroc + " es un número capicúa.");
                    System.exit(0);
                } else {
                    System.out.println("❌ " + numeroc + " no es un número capicúa.");
                    System.exit(0);
                }
                break;
            case 6:
                System.out.print("Ingrese el código Morse (use '/' para separar palabras): ");
                scanner.nextLine();
                String morseInput = scanner.nextLine();
                morseATexto(morseInput);
                System.exit(0);
                break;
            case 7:
                System.out.print("Ingrese el texto a convertir en código Morse: ");
                scanner.nextLine();
                String textoMorse = scanner.nextLine();
                textoAMorse(textoMorse);
                System.exit(0);
                break;
            case 8:
                gestorCaballeros();
                break;
            case 9:
                juegoDeDados();
                System.exit(0);
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

public static boolean Capicua(int numeroc) {
    int original = numeroc;
    int inverso = 0;

    while (numeroc > 0) {
        int digito = numeroc % 10;
        inverso = inverso * 10 + digito;
        numeroc /= 10;
    }

    return original == inverso;
}


public static void morseATexto(String morseInput) {
    String[] palabras = morseInput.trim().split(" / ");
    StringBuilder texto = new StringBuilder();

    for (String palabra : palabras) {
        String[] simbolos = palabra.split(" ");
        for (String simbolo : simbolos) {
            boolean encontrado = false;
            for (int i = 0; i < morse.length; i++) {
                if (simbolo.equals(morse[i])) {
                    texto.append(letras[i]);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                texto.append("?");
            }
        }
        texto.append(" "); //
    }

    System.out.println("Texto decodificado: " + texto.toString().trim());
}

public static void textoAMorse(String texto) {
    texto = texto.toUpperCase();
    StringBuilder resultado = new StringBuilder();

    for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);

        if (c == ' ') {
            resultado.append(" / ");
            continue;
        }

        boolean encontrado = false;
        for (int j = 0; j < letras.length; j++) {
            if (c == letras[j]) {
                resultado.append(morse[j]).append(" ");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            resultado.append("? ");
        }
    }

    System.out.println("Texto en Morse: " + resultado.toString());
}

static void gestorCaballeros() {
    Scanner sc = new Scanner(System.in);
    List<Caballero> caballeros = new ArrayList<>();
    Random random = new Random();
    int opcion;

    do {
        System.out.println("\n=== GESTOR DE CABALLEROS DEL ZODIACO ===");
        System.out.println("1. Crear Caballero");
        System.out.println("2. Mostrar Caballeros");
        System.out.println("3. Eliminar Caballero");
        System.out.println("4. Batalla entre Caballeros");
        System.out.println("5. Volver al menú principal");
        System.out.print("Elija una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Nombre del Caballero: ");
                String nombre = sc.nextLine();

                System.out.print("Constelación: ");
                String constelacion = sc.nextLine();

                String armadura;
                do {
                    System.out.print("Tipo de armadura (Oro, Plata, Bronce): ");
                    armadura = sc.nextLine().toLowerCase();
                } while (!armadura.equals("oro") && !armadura.equals("plata") && !armadura.equals("bronce"));

                int cosmos = 100; // Valor máximo de cosmos

                caballeros.add(new Caballero(nombre, constelacion, armadura, cosmos));
                System.out.println("✅ Caballero creado exitosamente.");
                break;

            case 2:
                System.out.println("\n--- Lista de Caballeros ---");
                if (caballeros.isEmpty()) {
                    System.out.println("No hay caballeros registrados.");
                } else {
                    for (int i = 0; i < caballeros.size(); i++) {
                        System.out.println((i + 1) + ". " + caballeros.get(i));
                    }
                }
                break;

            case 3:
                System.out.print("Ingrese el número del caballero a eliminar: ");
                int index = sc.nextInt() - 1;
                if (index >= 0 && index < caballeros.size()) {
                    System.out.println("Caballero eliminado: " + caballeros.remove(index).nombre);
                } else {
                    System.out.println("Número inválido.");
                }
                break;

            case 4:
                if (caballeros.size() < 2) {
                    System.out.println("Debe haber al menos dos caballeros para pelear.");
                    break;
                }

                System.out.println("Seleccione el primer caballero:");
                for (int i = 0; i < caballeros.size(); i++) {
                    System.out.println((i + 1) + ". " + caballeros.get(i).nombre);
                }
                int idx1 = sc.nextInt() - 1;

                System.out.println("Seleccione el segundo caballero:");
                for (int i = 0; i < caballeros.size(); i++) {
                    if (i != idx1)
                        System.out.println((i + 1) + ". " + caballeros.get(i).nombre);
                }
                int idx2 = sc.nextInt() - 1;

                Caballero c1 = caballeros.get(idx1);
                Caballero c2 = caballeros.get(idx2);

                System.out.println("\n🔥 ¡Comienza la batalla entre " + c1.nombre + " y " + c2.nombre + "! 🔥");

                while (c1.cosmos > 0 && c2.cosmos > 0) {
                    int daño1 = random.nextInt(11); // daño de 0 a 10
                    int daño2 = random.nextInt(11);

                    c2.cosmos -= daño1;
                    c1.cosmos -= daño2;

                    System.out.println(c1.nombre + " inflige " + daño1 + " de daño. Cosmos de " + c2.nombre + ": " + Math.max(c2.cosmos, 0));
                    System.out.println(c2.nombre + " inflige " + daño2 + " de daño. Cosmos de " + c1.nombre + ": " + Math.max(c1.cosmos, 0));
                    System.out.println("----------------------------------------");
                }

                if (c1.cosmos <= 0 && c2.cosmos <= 0) {
                    System.out.println("💥 ¡Ambos cayeron al mismo tiempo! Empate.");
                } else if (c1.cosmos <= 0) {
                    System.out.println("🏆 ¡" + c2.nombre + " gana la batalla!");
                } else {
                    System.out.println("🏆 ¡" + c1.nombre + " gana la batalla!");
                }

                // Reiniciar cosmos después de la batalla
                c1.cosmos = 100;
                c2.cosmos = 100;
                break;

            case 5:
                System.out.println("Regresando al menú principal...");
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

    } while (opcion != 5);
}

public static void juegoDeDados() {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.println("🎲 Bienvenido al juego de Dados de Combate 🎲");
    System.out.print("Ingrese el nombre del Jugador 1: ");
    String jugador1 = input.nextLine();

    System.out.print("Ingrese el nombre del Jugador 2: ");
    String jugador2 = input.nextLine();

    int vidas1 = 3;
    int vidas2 = 3;
    int ronda = 1;

    while (vidas1 > 0 && vidas2 > 0) {
        System.out.println("\n--- RONDA " + ronda + " ---");
        System.out.println(jugador1 + " lanza el dado...");
        int dado1 = random.nextInt(6) + 1;

        System.out.println(jugador2 + " lanza el dado...");
        int dado2 = random.nextInt(6) + 1;

        System.out.println(jugador1 + " sacó: " + dado1);
        System.out.println(jugador2 + " sacó: " + dado2);

        if (dado1 > dado2) {
            vidas2--;
            System.out.println(jugador1 + " gana la ronda. " + jugador2 + " pierde una vida.");
        } else if (dado2 > dado1) {
            vidas1--;
            System.out.println(jugador2 + " gana la ronda. " + jugador1 + " pierde una vida.");
        } else {
            System.out.println("Empate. Nadie pierde vida.");
        }

        System.out.println("Vidas restantes → " + jugador1 + ": " + vidas1 + " | " + jugador2 + ": " + vidas2);
        ronda++;
    }

    System.out.println("\n🎯 ¡Combate finalizado!");
    if (vidas1 > 0) {
        System.out.println("🏆 " + jugador1 + " es el ganador con " + vidas1 + " vida(s) restante(s).");
    } else {
        System.out.println("🏆 " + jugador2 + " es el ganador con " + vidas2 + " vida(s) restante(s).");
    }
}
