        package desafios.Classes.Desafio_10_Classe_Data;

        public class Desafio_10_Classes_Data {
                int dia;
                int mes;
                int ano;

                Desafio_10_Classes_Data(){

                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 1970;

                }


                public Desafio_10_Classes_Data(int dia, int mes, int ano){

                        this.dia = dia;
                        this.mes = mes;
                        this.ano = ano;

                }


                // não recebem parâmetro uma vez que a classe já possui os valores dia, mes e ano
                 public String formataData(){
                     return String.format("%d/%d/%d", this.dia, this.mes, this.ano);

                }

                public void printData(){
                        System.out.printf("%d/%d/%d", this.dia, this.mes, this.ano);
                }
        }
