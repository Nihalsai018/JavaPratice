package oops;

abstract class Phone {
    void display() {
        System.out.println("this is display method in phone");
    }

    abstract void cal();
}


class show extends Phone {

    @Override
    void cal() {
        System.out.println("this is calc method");
    }

    @Override
    void display() {
        System.out.println("this is display in show");
    }

    public static void main(String[] args) {
        // Creating an instance of the Phone class
        Phone phone = new Phone() {
            @Override
            void cal() {
                System.out.println("this is cal in anonmys ");

            }
        };

        // Calling the display method from the Phone class
        phone.display();
        phone.cal();


//        // Upcasting
//        Phone p = new show();
//        p.cal();
//        p.display();
//
//        // Downcasting
//        show s1 = (show) p;
//        s1.display();
        }
}
