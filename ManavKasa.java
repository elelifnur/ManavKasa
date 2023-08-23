import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args){
        double arm=2.14,elm=3.67,dmts=1.11,mz=0.95,ptlcn=5,armut,elma,domates,muz,patlıcan;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armut=input.nextInt();

        System.out.print("Elma Kaç Kilo? : ");
        elma=input.nextInt();

        System.out.print("Domates Kaç Kilo? : ");
        domates=input.nextInt();

        System.out.print("Muz Kaç Kilo? : ");
        muz=input.nextInt();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlıcan=input.nextInt();

        double hesap= (armut*arm) + (elm*elma) + (dmts*domates) + (mz*muz) + (ptlcn*patlıcan);

        System.out.println("Toplam Tutar: "+hesap);
    }
}
