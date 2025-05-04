package ArrayQuestion;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,6,3,2,7,5,3,4};
        HashMap<Integer,Integer> hm=new HashMap<>();

        int n=(arr.length-1)/2;

        for (int i=0;i<arr.length;i++){
            if (hm.containsKey(arr[i])==false){
                hm.put(arr[i],1);
            }
            else {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
//        for (var e:hm.entrySet()){
//            if (e.getValue()>=n){
//                System.out.println(e.getKey());
//                break;
//            }
//            System.out.println(hm);
//            }
        System.out.println(hm);

        int key=0;
        int value=0;
        for(var e:hm.entrySet()){
            if (e.getValue()>=value){
                value=e.getKey();
            }
        }
        System.out.println(value);
        }

    }

