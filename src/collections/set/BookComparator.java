//package collections.set;
//
//    import java.util.*;
//    class BookComparator implements Comparable<BookComparator>{
//        int id;
//        String name,author,publisher;
//        int quantity;
//        public BookComparator(int id, String name, String author, String publisher, int quantity) {
//            this.id = id;
//            this.name = name;
//            this.author = author;
//            this.publisher = publisher;
//            this.quantity = quantity;
//        }
//        // implementing the abstract method
//        public int compareTo(BookComparator b) {
//            if(id>b.id){
//                return 1;
//            }else if(id<b.id){
//                return -1;
//            }else{
//                return 0;
//            }
//        }
//
//        public static void main(String[] args) {
//            Set<BookComparator> set=new TreeSetExample();
//            //Creating Books
//            BookComparator b1=new BookComparator(121,"Let us C","Yashwant Kanetkar","BPB",8);
//            BookComparator b2=new BookComparator(233,"Operating System","Galvin","Wiley",6);
//            BookComparator b3=new BookComparator(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
//            //Adding Books to TreeSet
//            set.add(b1);
//            set.add(b2);
//            set.add(b3);
//            //Traversing TreeSet
//            for(BookComparator b:set){
//                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//            }
//        }
//    }
//
