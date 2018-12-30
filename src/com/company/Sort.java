package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Sort {

    private ArrayList<Pack> SortPackForRegion100 = new ArrayList<>();
    private ArrayList<Pack> SortPackForRegion200 = new ArrayList<>();
    private ArrayList<Pack> SortPackForRegion300 = new ArrayList<>();



    public void sortAndGenerateNumber(Pack pack){
        Random random = new Random();
        pack.setNuberOfPack(random.nextInt(340));

        if(pack.getNuberOfPack() < 101){
            SortPackForRegion100.add(pack);
            pack.setNuberOfPack(100+pack.getNuberOfPack());
            pack.setStatus(Status.Check);
        }
        if(pack.getNuberOfPack()<201&& pack.getNuberOfPack()>100){
            SortPackForRegion200.add(pack);
            pack.setNuberOfPack(200+pack.getNuberOfPack());
            pack.setStatus(Status.Check);
        }
        if(pack.getNuberOfPack()<301&& pack.getNuberOfPack()>200){
            SortPackForRegion300.add(pack);
            pack.setNuberOfPack(300+pack.getNuberOfPack());
            pack.setStatus(Status.Check);
        }


    }

    public ArrayList<Pack> getSortPackForRegion100() {
        return SortPackForRegion100;
    }

    public ArrayList<Pack> getSortPackForRegion200() {
        return SortPackForRegion200;
    }

    public ArrayList<Pack> getSortPackForRegion300() {
        return SortPackForRegion300;
    }
}
