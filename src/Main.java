import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int iBalance = 140;
         int iContDeEconomii = 200;
         int iSumaDepusa;
         int iSumaRetrasa;
         int iSumaTransferata;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Alege una din optiunile urmatoare: 1. Verificare balanta 2. Depune bani 3. Retrage bani 4. Transfera bani in contul de economii 5. Economisire rest 6. Afisare balanta in diferite valute");
         int iOptiune = scanner.nextInt();
         if (iOptiune==1){
         System.out.println("Balanta dumneavoastra este: " + iBalance);
    }else if(iOptiune==2){
             System.out.println("Tastati suma pe care doriti sa o depuneti: ");
             iSumaDepusa = scanner.nextInt();
             if(iSumaDepusa>0) {
                 iBalance = iBalance + iSumaDepusa;
                 System.out.println("Noua balanta a dumneavoastra este: " + iBalance);
             }else{
                 System.out.println("Suma tastata de dumneavoastra nu este o suma pozitiva/valida.");
             }
         }else if(iOptiune==3){
             System.out.println("Tastati suma pe care doriti sa o retrageti: ");
             iSumaRetrasa = scanner.nextInt();
             if(iSumaRetrasa<=iBalance && iSumaRetrasa>=0){
                 iBalance = iBalance - iSumaRetrasa;
                 System.out.println("Suma dumneavoastra de " + iSumaRetrasa +" a fost retrasa. Noul sold al dumneavoastra este: " + iBalance);
             }else if(iSumaRetrasa>iBalance){
                 System.out.println("Suma pe care doriti sa o retrageti " + iSumaRetrasa + " depaseste balanta contului dumneavoastra care este " + iBalance);
             }else {
                 System.out.println("Suma pe care doriti sa o retrageti " + iSumaRetrasa + " nu este o suma valida");
             }
        } else if (iOptiune==4) {
             System.out.println("Va rog tastati suma pe care doriti sa o transferati in contul de economii: ");
             iSumaTransferata = scanner.nextInt();
             if(iSumaTransferata<= iBalance && iSumaTransferata>0) {
                 iBalance = iBalance - iSumaTransferata;
                 iContDeEconomii = iContDeEconomii + iSumaTransferata;
                 System.out.println("Ati transferat suma de " + iSumaTransferata + " din contul principal(noul sold: " + iBalance + ") in contul de economii(noul sold: " + iContDeEconomii + ")");
             }else if(iSumaTransferata>iBalance){
                 System.out.println("Suma pe care doriti sa o transferati " + iSumaTransferata + " este mai mare decat balanta contului principal.") ;
             }else{
                 System.out.println("Suma pe care doriti sa o transferati " + iSumaTransferata + " nu este o suma valida.") ;
             }
         }else if(iOptiune==5) {
             System.out.println("Aceasta operatiune nu am stiut sa o fac :D ");
         }else if(iOptiune==6){
             System.out.println("Alegeti in ce valuta doriti sa vizualizati balanta: 1.Euro 2.Dolari 3.Forinti sa para mai multi");
             int iValuta;
             double dBalantaValuta;
             double dConversie;
             iValuta = scanner.nextInt();
             if(iValuta==1){
                 dConversie = 4.9770;
                 dBalantaValuta = iBalance / dConversie;
                 System.out.println("Balanta dumneavoastra in euro este de: " + dBalantaValuta);
             }else if(iValuta==2){
                 dConversie = 4.6403;
                 dBalantaValuta = iBalance / dConversie;
                 System.out.println("Balanta dumneavoastra in dolari este de: " + dBalantaValuta);
             } else if (iValuta==3) {
                 dConversie = 1.2548;
                 dBalantaValuta = iBalance*100*dConversie;
                 System.out.println("Balanta dumneavoastra in forinti este de: " + dBalantaValuta);
             } else {
                 System.out.println("Moneda aleasa de dumneavoastra nu este disponibila. Va rugam alegeti o moneda disponibila");
             }
         }else{
             System.out.println("Optiunea aleasa este invalida");
         }
    }
    }
