package code_challenge_bundle_calculator;

import java.nio.file.LinkPermission;
import java.util.*;

public class BundleType {
    public static void main(String[] args) {


        //  int bundle2Amount;
        // int bundle3Amount;
        Map<Integer, Integer> vmenu = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
        vmenu.put(1, 9);
        vmenu.put(2, 5);
        vmenu.put(3, 3);
        Map<Integer, Double> vid = new TreeMap<Integer, Double>();
//        vid.setVidData();
        vid.put(vmenu.get(3), 570.0);
        vid.put(vmenu.get(2), 900.0);
        vid.put(vmenu.get(1), 1530.0);

        int input;
        input = 13;
        calculator(input, vmenu, vid);
    }

    public static void calculator(int input,Map<Integer,Integer> menu,Map<Integer,Double> media) {
        int total;
        int bundle1;
        int bundle2;
        int bundle3;
        int remainder1;
        int remainder2;
        total = input;
        bundle1 = Math.floorDiv(total, menu.get(1));
        remainder1 = Math.floorMod(total, menu.get(1));
        if (remainder1 > menu.get(2)) {
            bundle1 += 1;
            bundle2 = 0;
            bundle3 = 0;
            printVideoResult(total, bundle1,bundle2,bundle3,menu,media);
            System.out.println("运行到第一块");
        }
        else {
            bundle2 = Math.floorDiv(remainder1, menu.get(2));
            remainder2 = Math.floorMod(remainder1, menu.get(2));
            if (remainder2 > menu.get(3)) {
                bundle2 += 1;
                bundle3 = 0;
                System.out.println("运行到第二块");
                printVideoResult(total, bundle1,bundle2,bundle3,menu,media);
            } else {
                bundle3 = Math.floorDiv(remainder2, menu.get(3)) + 1;
//                    printVideoResult();
                System.out.println("运行到第三块");
                printVideoResult(total, bundle1,bundle2,bundle3,menu,media);
            }

        }
    }


    public static void printVideoResult(int total, int bundle1, int bundle2, int bundle3,Map<Integer,Integer> menu,Map<Integer,Double> media) {
        System.out.println(total + " VID $" + (bundle1 * media.get(menu.get(1)) + bundle2 * media.get(menu.get(2)) + bundle3 * media.get(menu.get(3))));

        if (bundle1 > 0) {
            System.out.println("   " + bundle1 + " x " + menu.get(1) + " $" + bundle1 * media.get(menu.get(1)));
        }
        if (bundle2 > 0) {
            System.out.println("   " + bundle2 + " x " + menu.get(2) + " $" + bundle2 * media.get(menu.get(2)));

        }
        if (bundle3 > 0) {
            System.out.println("   " + bundle3 + " x " + menu.get(3) + " $" + bundle3 * media.get(menu.get(3)));
        }
    }

//    private static Map<Integer, Double> img = new HashMap<Integer, Double>();
//    private static Map<Integer, Double> flac = new HashMap<Integer, Double>();
    // Map<Integer, Double> vid = new HashMap<Integer, Double>();
//    public static Map<String, HashMap> bundle = new HashMap();


//    public static void addImgData(Map<Integer, Double> img) {
//        img.put(5, 450.0);
//        img.put(10, 800.0);
//    }
//
//    public static void addFlacData(Map<Integer, Double> FLAC) {
//        FLAC.put(3, 427.5);
//        FLAC.put(6, 810.0);
//        FLAC.put(9, 1147.5);
//    }

//        public static void setVidData () {
//            vid.put(3, 570.0);
//            vid.put(5, 900.0);
//            vid.put(9, 1530.0);
//        }
//        public void getVidValue () {
//            if (vid != null) {
//                for (Map.Entry<Integer, Double> entry : vid.entrySet()) {
//                    Integer key = entry.getKey();
//                    Double value = entry.getValue();
//                    // System.out.println("key" + " = " + key + " value = " + value);
//                }
//            }
//        }
//    public static void setBundle(){
//        bundle.put("IMG",img);
//        bundle.put("FLAC",flac);
//        bundle.put("VID",vid);
//
//        if(bundle != null) {
//            Set set = bundle.entrySet();
//            Iterator itr = set.iterator();
//            while (itr.hasNext()) {
//                Map.Entry entry = (Map.Entry)itr.next();
//                if(entry.getValue() == "img"){
//
//                    System.out.println("img ");
//                    getImgValue(img);
//                }
//
//            }
//        }
//    }
//    public static void getImgValue(Map<Integer, Double> img){
//            if(img != null){
//                for (Map.Entry<Integer, Double> entry : img.entrySet()){
//                    Integer key = entry.getKey();
//                    Double value = entry.getValue();
//                    System.out.println("key" + " = " + key + " value = " + value);
//                }
//            }
//        }
//    public static Map<Integer, Double> getImgValue(){
//        int firstImgBundle = img.firstKey();
//        return img;
//    }

//    public static int getFlacKey() {
//        if (flac != null) {
//            for (Map.Entry<Integer, Double> entry : flac.entrySet()) {
//                Integer key = entry.getKey();
//                Double value = entry.getValue();

//        for(Integer key : flac.keySet()){
//            Double value = flac.get(key);
//
//
//            System.out.println("key:"+key+"  value:"+value);
//        }
//        Iterator<Integer> iter = flac.keySet().iterator();
//        Integer key = iter.next();
//
//
//        return key;
//        while(iter.hasNext()){
//            Integer key=iter.next();
//            Double value = flac.get(key);
//            System.out.println(key+" "+value);
//
////                System.out.println("key = " + key + " value = " + value);
//            }

//    }


}


