package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Courier courier101 = new Courier("Bob",100);
        Courier courier201 = new Courier("Marek",200);
        Courier courier301 = new Courier("Jurgen",300);


        Pack pack1 = new Pack("Tarczyn", "Zabawka1");
        Pack pack2 = new Pack("Waw", "Piłka");
        Pack pack3 = new Pack("Słomczyn", "Klocki");
        Pack pack4 = new Pack("Grójec", "Opony");
        Pack pack5 = new Pack("Drwalew", "Kosmetyki");
        Pack pack6 = new Pack("lokacja", "Paczka jeden");
        Pack pack7 = new Pack("lokacja1", "Paczka dwa");
        Pack pack8 = new Pack("lokacja2", "Paczka trzy");
        Pack pack9 = new Pack("lokacja3", "Paczka cztery");
        Pack pack = new Pack("lokacja4", "Paczka pięć");
        Sort sort = new Sort();
        ArrayList<Pack> listPack = new ArrayList<>();
        listPack.add(pack);
        listPack.add(pack1);
        listPack.add(pack2);
        listPack.add(pack3);
        listPack.add(pack4);
        listPack.add(pack5);
        listPack.add(pack6);
        listPack.add(pack7);
        listPack.add(pack8);
        listPack.add(pack9);

        for (Pack packs: listPack) {
            sort.sortAndGenerateNumber(packs);
        }

        Map<Integer, ArrayList> letterRegionPack = new HashMap<>();
        letterRegionPack.put(101,sort.getSortPackForRegion100());
        letterRegionPack.put(201, sort.getSortPackForRegion200());
        letterRegionPack.put(301, sort.getSortPackForRegion300());

        Map<Integer, String> letterRegionCourier = new HashMap<>();
        letterRegionCourier.put(101,courier101.getNameCourier());
        letterRegionCourier.put(201,courier201.getNameCourier());
        letterRegionCourier.put(301,courier301.getNameCourier());

        for (Pack packsStatusRegister: listPack) {
            if(packsStatusRegister.getStatus() == Status.Register ){
                System.out.println("Paczka nie została przekazana kurierowi \n" +
                        "Paczka adresowana na :"+packsStatusRegister.getAddres()+"\n"+
                        "Nazwa Paczki "+ packsStatusRegister.getNamePack());
            }
        }

        Scanner scanner = new Scanner(System.in);
        Integer numberCourier;
        System.out.println("\n Nr Kuriera 101 odpowiedzialny za teren 100 \n" +
                "Nr Kuriera 201 odpowiedzialny za teren 200 \n" +
                "Nr Kuriera 301 odpowiedzialny za teren 300 \n" +
                        "wpisz nr Kuriera: ");
        numberCourier = scanner.nextInt();

        ArrayList<Pack> listPacksHaveCourier = new ArrayList<>();
        listPacksHaveCourier.addAll(letterRegionPack.get(numberCourier));
        System.out.println("Paczki kuriera: "+ letterRegionCourier.get(numberCourier));
        for (Pack packSends : listPacksHaveCourier) {
            System.out.println(packSends.getNuberOfPack() + "  " + packSends.getNamePack() + "  " + packSends.getAddres()+ "  " + packSends.getStatus());
        }

    }
}
