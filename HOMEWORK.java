

//  HOME WORK

import java.util.Scanner;
    public class HOMEWORK {
        public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            String currencyFrom;


            // Метод ХЕЛОУ
            Hello();

            do {


                currencyFrom = scanner.nextLine();


                if (currencyFrom.equals("EXIT")) {
                    System.out.println("ВСЕГО ДОБРОГО!");
                    continue;

                }


//                    FOR - сахар для While
                for (int i = 0; i < 3 && i < currency.length; i++) {
                    System.out.println(currency[i]);
                }


                System.out.print("Введите название валюты в какую переводим : ");
                String currencyIn = scanner.nextLine();


                System.out.print("Введите сумму перевода: ");
                double sum = scanner.nextDouble();
                scanner.nextLine();


//ТЯЖЕЛО это было, еще до конца не разобрался
                double x = getRateValue(currencyFrom, currencyRates);
                double y = getRateValue(currencyIn, currencyRates);

                double result = sum * x / y;
                System.out.println(result);
            } while (!currencyFrom.equals("EXIT"));
            scanner.close();

        }

        public class CurrencyConverter {
            String[] currency ;
            double[] currencyRates ;


            public CurrencyConverter(){
                this.currency = new String[]{"- EUR", "- USD", "- TL", "- EXIT"};
                this.currencyRates = new double[]{1, 0.92, 0.03};


            }

            public CurrencyConverter(double[] currencyRates){
                this.currencyRates = currencyRates;
            }
            public CurrencyConverter(double[] currencyRates, String[] currency)
            {
                this.currency = currency;
                this.currencyRates = currencyRates;

            }

        }

        public static double getRateValue(String currency, double[] currencyRates) {
            double rate;
            switch (currency) {
                case "EUR":
                    rate = currencyRates[0];
                    break;
                case "USD":
                    rate = currencyRates[1];
                    break;
                case "TL":
                    rate = currencyRates[2];
                    break;
                default:
                    System.out.println("Некорректное значение");
                    rate = -1;
                    break;
            }
            return rate;
        }

        public static void Hello(String[] currency) {
            System.out.println("Приветствуем в CurrencyConverter!\n\n\n");
            System.out.println("Введите название валюты: ");
            //Итеративный for
            for (String total : currency)
                System.out.println(total);
        }
    }










