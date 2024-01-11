package Pratice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(65);
        list.add(55);
        list.add(70);
        list.add(86);
        list.add(85);

        System.out.print("[");
       for (int i=0;i<list.size();i++){
            System.out.print(" "+list.get(i)+" ");

        }
        System.out.println("]");

        System.out.print("[");
        list.stream().forEach(m-> System.out.print(" "+m+" "));
        System.out.println("]");

        System.out.print("[");
        list.stream().filter(m->m>50).forEach(m-> System.out.print(" "+m+" "));
        System.out.println("]");

        System.out.println(Arrays.toString(new List[]{list}));


// List<Integer> newList = new LinkedList<>();

// for (int i=0; i<list.size();i++){
//     if (list.get(i) > 50){
//       newList.add(list.get(i));
//     }
// }
// System.out.println(Arrays.toString(new List[]{newList}));
// List<Integer> newList = list.stream().filter(m->m>50).collect(Collectors.toList());
//         System.out.println(Arrays.toString(new List[]{newList}));

        for (int i=0; i<list.size();i++){
            if (list.get(i)%2 != 0){
                System.out.println("without using stream api"+list.get(i));
            }
        }

        list.stream().filter(m -> m%2!=0).forEach(m-> System.out.println("using stream api"+m));

        List<Integer> marks = new LinkedList<>();
        marks.add(320);
        marks.add(424);
        marks.add(728);
        marks.add(525);
        marks.add(827);
        marks.add(729);

        System.out.println(marks);

// List<Integer> newMarksList = new LinkedList<>();
// for (int i=0; i<marks.size();i++){
//
//     if (newMarksList.isEmpty()){
//         throw new RuntimeException("new Marks list is empty");
//     }
// }
// System.out.println(newMarksList);
// List<Integer> newMarksList=marks.stream().map(m->m+10).collect(Collectors.toList());
// System.out.println(newMarksList);
// marks.stream().filter(m -> m.equals(null)).forEach(m-> System.out.println());

        marks.stream().findAny().orElseThrow(()->new RuntimeException("new Marks list is empty"));

//        primeNumber();
        System.out.print("[");
        list.stream().filter(m->m%2==1).forEach(m-> System.out.print(" "+m+" "));
        System.out.println("]");
    }

// public static void primeNumber(){
//
//     for (int i = 0; i < 100; i++) {
//         if(i%2 == 0){
//
//             System.out.println(i);
//
//         }
//     }
// }
}