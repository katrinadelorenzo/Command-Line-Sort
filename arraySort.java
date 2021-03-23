
public class arraySort {

    static void sort(String a[], int n) {
        
        //Base case
        if (n==1) 
            return;

        //loops through array, and results in largest element being moved to the end
        for (int i = 0; i < n-1; i++) {

            //swap
            if (a[i].compareTo(a[i+1]) > 0){
                //create new variable temp to hold first number
                String temp = a[i];
                //second value assigned to first variable
                a[i] = a[i+1];
                //first value (stored in temp) assigned to second variable
                a[i+1] = temp;
            }

        }
        
        //passes through again, ignoring the already sorted element
        sort(a, n-1);
    }
    public static void main(String [] args) {

        if (args.length < 3) { // when number of words is less than 3
            System.out.println("Please re-try with more than 3 words"); 
            System.exit(-1); //end program
        }
        
        System.out.println(); //space
        System.out.println("Printing arguments...");

        // Loop through arguments with length value, and print
        for (int i = 0; i < args.length; i++){

            System.out.println("Argument " + i + ": " + args[i]);

        }
        
        System.out.println(); //space

        //String concatenated using StringBuilder 
        StringBuilder bld = new StringBuilder();

        for (int i = 0; i < args.length; i++){
            bld.append(args[i] + " ");
        }
        
        System.out.println("Printing the concatenated string..."); 
        
        String concatenated = bld.toString();

        //print concatenated string
        System.out.println(concatenated);

        System.out.println(); //space

        //sort args[] word array
        sort(args,args.length);
        
        System.out.println("Printing the sorted array with each word individually");

        //each word from sorted array assigned to individual StringBuffers and print
        for (int i = 0; i < args.length; i++){
            StringBuffer newBuf = new StringBuffer(args[i]);
            System.out.println(newBuf);
        }

        System.out.println(); //space

        System.out.println("Printing the sorted array on one line..."); 
        //concatenate with space in between with StringBuffer
        StringBuffer buf = new StringBuffer();

        // copy each word from sorted array to one Stringbuffer
        for (int i = 0; i < args.length; i++){

            buf.append(args[i] + " ");

        }

        //print StringBuffer
        System.out.println(buf);


        

    
    }
}