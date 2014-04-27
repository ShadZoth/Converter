package ru.hse.se.g272.ervo.ooaip.converter;

/**
 * Программа перевода мегаджоулей в киловатт-часы и киловатт-часов в мегаджоули
 * @author Ervo Victor 272SE(2)
 * @since 4.10.2013
 */
public class Converter {

    /**
     * Переводит мегаджоули в киловатт-часы и киловатт-часы в мегаджоули
     * @param args {@code value = args[0]} Значение, которое необходимо перевести (должно приводиться к типу {@code double}).
     *             {@code args[1]} Тип. Может принимать следующие значения: {@code kWh} - киловатт-часы; {@code MJ} - мегаджоули. Не зависит от регистра
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not enough arguments");
        } else {
            try {
                String strValue = args[0].replace(',', '.');
                double value = Double.parseDouble(strValue);
                if (args[1].toUpperCase().equals("KWH")) {
                    double result = 3.6 * value;
                    System.out.printf("%s kWh = %s MJ", value, result);
                } else if (args[1].toUpperCase().equals("MJ")) {
                    double result = value / 3.6;
                    System.out.printf("%s MJ = %s kWh", value, result);
                } else {
                    System.out.printf("%s is not valid argument", args[1]);
                }
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid value%n", args[0]);
            }
        }
    }
}
