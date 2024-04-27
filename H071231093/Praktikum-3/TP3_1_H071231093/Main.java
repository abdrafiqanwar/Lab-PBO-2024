public class Main {
    public static void main(String[] args) {
        Pegulat pegulat1 = new Pegulat();
        pegulat1.setAbility("-");
        pegulat1.setDivision("Heavyweight");
        pegulat1.setWeight(105.15);
        pegulat1.setHeight(185.30);

        WWE wwe1 = new WWE("Brock Lesnar", pegulat1.getAbility(), pegulat1.getDivision(), pegulat1.getWeight(), pegulat1.getHeight(), 45, 90.10); 

        Pegulat pegulat2 = new Pegulat();
        pegulat2.setAbility("-");
        pegulat2.setDivision("Cruiserweight");
        pegulat2.setWeight(80);
        pegulat2.setHeight(175.5);

        WWE wwe2 = new WWE("Rey Mysterio", pegulat2.getAbility(), pegulat2.getDivision(), pegulat2.getWeight(), pegulat2.getHeight(), 47, 75.5);

        printBarriers();
        wwe1.displayInfo();
        printBarriers();
        wwe2.displayInfo();

        System.out.println();printBarriers();
        wwe1.InitializationStrenghtness(99);
        System.out.println();printBarriers();
        wwe2.InitializationStrenghtness(85);
        
        System.out.println();printBarriers();
        wwe1.BodySize(110.5, 190);
        System.out.println();printBarriers();
        wwe2.BodySize(85, 170.30);

        System.out.println();printBarriers();
        wwe1.SpecialAbility("Aggresive", 45 );
        System.out.println();printBarriers();
        wwe2.SpecialAbility("Agility", 47);

        System.out.println();printBarriers();
        wwe1.displayInfo();
        System.out.println();printBarriers();
        wwe2.displayInfo();

        







    }

    public static void printBarriers() {
        System.out.println("=============================================");
    }
}