package Pizzaria;

import Pizzaria.Enum.Tamanho;
import Pizzaria.Enum.Unidade_Medida;

public class Main {
    public static void main(String[] args) {

        Ingrediente molhoTomate = new Ingrediente("I4587","Molho de tomate", Unidade_Medida.LITROS,5);
        Ingrediente molhoPesto = new Ingrediente("I1234", "Molho Pesto vegano", Unidade_Medida.GRAMAS, 1.5);
        Ingrediente molhoBranco = new Ingrediente("I4569","Molho Branco Vegano", Unidade_Medida.LITROS, 120);
        Ingrediente queijoRalado = new Ingrediente("I4587","Queijo Ralado Vegano", Unidade_Medida.GRAMAS, 2);
        Ingrediente queijoFatias = new Ingrediente("I8976", "Queijo em fatias Vegano", Unidade_Medida.UNIDADES, 50);
        Ingrediente creamCheese = new Ingrediente("I4523", "Cream Cheese Vegano", Unidade_Medida.GRAMAS, 1.8);
        Ingrediente chourico = new Ingrediente("I1819", "Rodelas de chouriço Vegano", Unidade_Medida.UNIDADES, 50);
        Ingrediente peperoni = new Ingrediente("I8910", "Pepperoni Vegano", Unidade_Medida.UNIDADES, 40);
        Ingrediente bacon = new Ingrediente("I9304", "bacon vegano", Unidade_Medida.GRAMAS,50);
        Ingrediente cebolaRoxa = new Ingrediente("I8367", "Cebola Roxa", Unidade_Medida.GRAMAS,3);
        Ingrediente azeitona = new Ingrediente("I73464", "Azeitonas Pretas", Unidade_Medida.GRAMAS,2);
        Ingrediente cogumelos = new Ingrediente("I8347", "Cogumelos frescos", Unidade_Medida.UNIDADES,0.5);
        Ingrediente pimento = new Ingrediente("I8475","Pimentos diversos", Unidade_Medida.GRAMAS, 3);
        Ingrediente alho = new Ingrediente("I6454", "Alho", Unidade_Medida.UNIDADES, 12);


        Pizza pizza = new Pizza("4589","Vegan Calabresa", "19.99",19.99, Tamanho.GRANDE);





    }
}
