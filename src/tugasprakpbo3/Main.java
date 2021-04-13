/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo3;
import java.util.Scanner;
import tugasprakpbo3.Balok;
import tugasprakpbo3.Kerucut;


/**
 *
 * @author Yohanes Ageng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean keluar = false;
        Scanner input;
        input = new Scanner(System.in);

        do{
            System.out.println("-------- TUGAS PRAKTIKUM PBO 2 BALOK DAN KERUCUT -------");
            System.out.println("-------- --------------------------------------- ------");

            switch(menu()){
                case 1:
                    balok(input);
                    break;
                case 2:
                    kerucut(input);
                    break;
                case 3:
                    keluar = true;
                    break;
            }
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
        } while(!keluar);
    }
    
    public static int menu(){
        Scanner menu = new Scanner(System.in);

        System.out.println("1. BALOK");
        System.out.println("2. KERUCUT");
        System.out.println("3. KELUAR");
        System.out.print("PILIH = ");

        return menu.nextInt();
    }

    public static void balok(Scanner input){
        int panjang,lebar,tinggi;

        System.out.print("-------INPUT-------\n");
        System.out.print("  Panjang : ");
        panjang = input.nextInt();
        System.out.print("  Lebar : ");
        lebar = input.nextInt();
        System.out.print("  Tinggi : ");
        tinggi = input.nextInt();
        Balok balok = new Balok(panjang,lebar,tinggi);

        System.out.println("-------OUTPUT--------");
        System.out.println("Luas Persegi = " + balok.luas());
        System.out.println("Keliling Persegi = " + balok.keliling());
        System.out.println("Volume Balok = " + balok.volume());
        System.out.println("Luas Permukaan Balok = " + balok.luasPermukaan());
    }

    public static void kerucut(Scanner input){
        int tinggi,jari2;

        System.out.print("-------INPUT-------\n");
        System.out.print("  Jari - jari : ");
        jari2 = input.nextInt();
        System.out.print("  Tinggi : ");
        tinggi = input.nextInt();
        Kerucut kerucut;
        kerucut = new Kerucut(jari2,tinggi);

        System.out.println("-------OUTPUT--------");
        System.out.println("Luas Lingkaran = " + kerucut.luas());
        System.out.println("Keliling Lingkaran = " + kerucut.keliling());
        System.out.println("Volume Kerucut = " + kerucut.volume());
        System.out.println("Luas Permukaan Kerucut = " + kerucut.luasPermukaan());
    }
    
}
