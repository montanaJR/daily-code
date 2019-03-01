import org.montanajr.lab02.abstractFactory.Bank;
import org.montanajr.lab02.abstractFactory.FabrykaAbstrakcyjna;
import org.montanajr.lab02.abstractFactory.KreatorFabryki;
import org.montanajr.lab02.abstractFactory.Kredyt;
import org.montanajr.lab02.builder.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // BUILDER METHOD - START
       /* System.out.println("BUILDER MOETHOD");
        Director direct = new Director();
        Builder builder1 = new Programowanie();
        Builder builder2 = new Teleinformatyka();

        System.out.println("Specjalność Programowanie na WSIiZ - przedmioty obieralne:");
        direct.setBuilder(builder1);
        direct.ukladaj();
        Plan plan1 = direct.getPlan();
        plan1.show();

        System.out.println("");
        System.out.println("Specjalność Teleinformatyka na WSIiZ - przedmioty obieralne:");
        direct.setBuilder(builder2);
        direct.ukladaj();
        Plan plan2 = direct.getPlan();
        plan2.show();*/

        // BUILDER METHOD - END

        //ABSTRACT FACTORY - START
        /*System.out.println("ABSTRACT FACTORY");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wpisz nazw� banku, w kt�rym chcesz wzi�� kredyt: ");
        String bankName=br.readLine();

        System.out.print("Podaj typ kredytu: ");
        String kredytname=br.readLine();

        FabrykaAbstrakcyjna bankFactory = KreatorFabryki.getFabryka("Bank");
        Bank b=bankFactory.getBank(bankName);

        System.out.print("Podaj stop� procentow�: " + b.getBankName() + ": ");

        double stopa=Double.parseDouble(br.readLine());
        System.out.print("Podaj wysoko�� kwoty kredytu: ");

        double kwota=Double.parseDouble(br.readLine());
        System.out.print("Wprowad� okres sp�aty kredytu (w latach): ");

        int ile_lat=Integer.parseInt(br.readLine());
        System.out.println("bierzesz kredyt z banku "+ b.getBankName());

        FabrykaAbstrakcyjna fabrykaKredytu = KreatorFabryki.getFabryka("Kredyt");
        Kredyt l=fabrykaKredytu.getKredyt(kredytname);
        l.getStopa(stopa);
        l.oblicz_rate(kwota,ile_lat);*/
        //ABSTRACT FACTORY - END


    }
}
