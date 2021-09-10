package code_challenge_bundle_calculator;

import java.util.*;

public class BundleType {
//    public static void main(String[] args) {
//        Map<Integer, Double> img = new TreeMap<>();
//        addImgData(img);
//        addFlacData(flac);
//        addVidData(vid);
//        getImgValue();
//        getFlacKey(flac);
//        getVidValue(vid);
//    }

//    private static Map<Integer, Double> img = new HashMap<Integer, Double>();
//    private static Map<Integer, Double> flac = new HashMap<Integer, Double>();
//    private static Map<Integer, Double> vid = new HashMap<Integer, Double>();
//    public static Map<String, HashMap> bundle = new HashMap();


    public static void addImgData(Map<Integer, Double> img) {
        img.put(5, 450.0);
        img.put(10, 800.0);
    }

    public static void addFlacData(Map<Integer, Double> FLAC) {
        FLAC.put(3, 427.5);
        FLAC.put(6, 810.0);
        FLAC.put(9, 1147.5);
    }

    public static void addVidData(Map<Integer, Double> VID) {
        VID.put(3, 570.0);
        VID.put(5, 900.0);
        VID.put(9, 1530.0);
    }

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
    public static Map<Integer, Double> getImgValue(){
        int firstImgBundle = img.firstKey();
        return img;
    }

    public static int getFlacKey() {
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
        Iterator<Integer> iter = flac.keySet().iterator();
        Integer key = iter.next();


        return key;
//        while(iter.hasNext()){
//            Integer key=iter.next();
//            Double value = flac.get(key);
//            System.out.println(key+" "+value);
//
////                System.out.println("key = " + key + " value = " + value);
//            }
    }
//    }
//    public static void getVidValue(Map<Integer, Double> vid){
//        if(vid != null){
//            for (Map.Entry<Integer, Double> entry : vid.entrySet()){
//                Integer key = entry.getKey();
//                Double value = entry.getValue();
//             // System.out.println("key" + " = " + key + " value = " + value);
//            }
//        }
//    }

}

