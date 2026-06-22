public static void main(String[] args) {

    // Inserciones previas.
    Clientes clienteUno = new Clientes("Christopher Salazar", 111, "Masculino", "Cliente", 101, "chris@dispatch.com", 17040603, "200 metros norte del restaurante Monchis", "Ingeniero", 1);
    Clientes clienteDos = new Clientes("Andrés Durán", 222, "Masculino", "Cliente", 202, "adnrés@dispatch.com", 63682293, "50 metros este del parque Superman", "Ingeniero", 2);
    Administrador administradorUno = new Administrador("Randall Rodríguez", 333, "Masculino", "Administrador", 30303, "randallAdmin@dispatch.com", 11118888, "300 metros oeste del Banco Mundial del Oro", "Rand1dmin");
    CuentasAhorro ahorroUno = new CuentasAhorro(123, "Ahorro", "Christopher Salazar", LocalDate.of(2018, 3, 21), LocalDate.of(2030, 8, 4), 760,  100);
    CuentasCredito creditoUno = new CuentasCredito(434, "Crédito", "Andrés Durán", LocalDate.of(2021, 4, 7), LocalDate.of(2028, 8, 29), 450, "Millas", 10000, 0);
    CuentasDebito debitoUno = new CuentasDebito(6789, "Débito", "Randall Rodríguez", LocalDate.of(2017,1,17), LocalDate.of(2025, 4, 30), 290, 3000);

    Scanner scan = new Scanner(System.in);

    int opcion;

    do {
        System.out.println("Buen día, bienvenido al menú del banco Tokita. ");
        System.out.println("Por favor, ingrese un dígito: ");
        System.out.println("1. Observar sus cuentas.");
        System.out.println("2. Realizar abonos o depósitos. ");
        System.out.println("3. Verificar las cuentas. ");
        System.out.println("4. Variados.");
        System.out.println("5. Salir del menú. ");

        opcion = scan.nextInt();
        scan.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.println(ahorroUno);
                System.out.println(creditoUno);
                System.out.println(debitoUno);
            }
            case 2 -> {
                System.out.println("1. Depositar en su cuenta de ahorro. ");
                System.out.println("2. Abonar en su cuenta de crédito. ");
                System.out.println("3. Depositar en su cuenta de débito. ");
                int decision;
                decision = scan.nextInt();
                scan.nextLine();
                switch (decision) {
                    case 1 -> {
                        ahorroUno.depositosCuentas();
                    }
                    case 2 -> {
                        creditoUno.abono();
                    }
                    case 3 -> {
                        debitoUno.depositosCuentas();
                    }
                }
            }
            case 3 -> {
                System.out.println("1. Verificar su cuenta de ahorro. ");
                System.out.println("2. Verificar su cuenta de crédito. ");
                System.out.println("3. Verficar su cuenta de débito. ");
                int decisionDos;
                decisionDos = scan.nextInt();
                scan.nextLine();
                switch (decisionDos){
                    case 1 -> {
                        ahorroUno.minimoCuentas();
                    }
                    case 2 ->{
                        creditoUno.minimoCuentas();
                    }
                    case 3 ->{
                        debitoUno.minimoCuentas();
                    }
                }
            }

            case 4 -> {
                administradorUno.usarCuenta(debitoUno);
                clienteUno.usarCuenta(ahorroUno);
                clienteDos.usarCuenta(creditoUno);
            }
            case 5 -> {
                System.out.println("Ha salido del sistema.");
            }
            default -> System.out.println("Por favor elija una opción de las anteriormente mostradas.");
        }
    }while (opcion != 5);
}