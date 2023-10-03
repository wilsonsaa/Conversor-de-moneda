import javax.swing.JOptionPane;

public class ConversorMoneda {
    public static void main(String[] args) {
        Double COP_USD = 3965.92;
        Double COP_EUR = 4338.32;
        Double COP_GBP = 5035.71;
        Double COP_JPY = 27.35;
        Double COP_KRW = 2.92;

        JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Monedas");

        String[] opciones = { "De pesos Colombianos a otra Moneda", "De Otra Moneda a Pesos Colombianos", "Salir" };
        String[] Monedas = {
            "De peso Colombiano a Dolar",
            "De peso Colombiano a Euro",
            "De peso Colombiano a Libra Esterlina",
            "De peso Colombiano a Yen Japones",
            "De peso Colombiano a Won Sur Koreano"
        };

        String[] monedas1 = {
            "De Dolar a Pesos Colombianos",
            "De Euro a Pesos Colombianos",
            "De Libra Esterlina a Pesos Colombianos",
            "De Yen Japones a Pesos Colombianos",
            "De Won Sur Koreano a Pesos Colombianos"
        };

        String cantidad = JOptionPane.showInputDialog("Ingresa el número a convertir");
        Double cantidad1 = Double.parseDouble(cantidad);

        String seleccion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona una opción",
            "Menú Desplegable",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        if (seleccion.equals("De pesos Colombianos a otra Moneda")) {
            String seleccion1 = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción",
                "Menú Desplegable",
                JOptionPane.PLAIN_MESSAGE,
                null,
                Monedas,
                Monedas[0]
            );

        
            switch (seleccion1) {
                case "De peso Colombiano a Dolar":
                    double resultadoUSD = cantidad1 / COP_USD;
                    JOptionPane.showMessageDialog(null, "El equivalente en USD es: " + resultadoUSD);
                    break;
					case "De peso Colombiano a Euro":
                    double resultadoEUR = cantidad1 / COP_EUR;
                    JOptionPane.showMessageDialog(null, "El equivalente en EUR es: " + resultadoEUR);
                    break;

                case "De peso Colombiano a Libra Esterlina":
                    double resultadoGBP = cantidad1 / COP_GBP;
                    JOptionPane.showMessageDialog(null, "El equivalente en GBP es: " + resultadoGBP);
                    break;

                case "De peso Colombiano a Yen Japones":
                    double resultadoJPY = cantidad1 / COP_JPY;
                    JOptionPane.showMessageDialog(null, "El equivalente en JPY es: " + resultadoJPY);
                    break;

                case "De peso Colombiano a Won Sur Koreano":
                    double resultadoKRW = cantidad1 / COP_KRW;
                    JOptionPane.showMessageDialog(null, "El equivalente en KRW es: " + resultadoKRW);
                    break;

                // ... (resto de casos)
            }
        } else if (seleccion.equals("De Otra Moneda a Pesos Colombianos")) {
            String seleccion2 = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción",
                "Menú Desplegable",
                JOptionPane.PLAIN_MESSAGE,
                null,
                monedas1,
                monedas1[0]
            );

            
            switch (seleccion2) {
                case "De Dolar a Pesos Colombianos":
                    double resultadoUSD = cantidad1 * COP_USD;  // Cambio de operador (* en lugar de /)
                    JOptionPane.showMessageDialog(null, "El equivalente en Pesos Colombianos es: " + resultadoUSD);
                    break;
					case "De Euro a Pesos Colombianos":
                    double resultadoEUR = cantidad1 * COP_EUR;
                    JOptionPane.showMessageDialog(null, "El equivalente en EUR es: " + resultadoEUR);
                    break;

                case "De Libra Esterlina a Pesos Colombianos":
                    double resultadoGBP = cantidad1 * COP_GBP;
                    JOptionPane.showMessageDialog(null, "El equivalente en GBP es: " + Math.round(resultadoGBP));
                    break;

                case "De Yen Japones a Pesos Colombianos":
                    double resultadoJPY = cantidad1 * COP_JPY;
                    JOptionPane.showMessageDialog(null, "El equivalente en JPY es: " + resultadoJPY);
                    break;

                case "De Won Sur Koreano a Pesos Colombianos":
                    double resultadoKRW = cantidad1 * COP_KRW;
                    JOptionPane.showMessageDialog(null, "El equivalente en KRW es: " + resultadoKRW);
                    break;

            
            }
        }

        if (seleccion != null && !seleccion.equals("Salir")) {
            JOptionPane.showMessageDialog(null, "Gracias por usar");
        } else if (seleccion != null && seleccion.equals("Salir")) {
            System.exit(0); 
        }
    }
}
