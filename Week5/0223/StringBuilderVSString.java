public class StringBuilderVSString{
  public static final int BILLION = 1000000000;
  
  public static void main(String[] args){
    
    String test1 = "";
    String test2 = "";
    StringBuilder sBuilder = new StringBuilder();
    double concatTime = 0;
    double sBTime = 0;
    int testSize = 0;

    testSize = 1;
    System.out.println("Testing a single char");
    double startTime = System.nanoTime();
    test1 += "a";
    double endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.printf("Single character string concatenation took %.9f seconds%n", concatTime/BILLION);


    startTime = System.nanoTime();
    sBuilder.append("a");
    endTime = System.nanoTime();
    sBTime = endTime - startTime;
    System.out.printf("Single character StringBuilder append took %.9f seconds%n", sBTime/BILLION);

    testSize = 1000;
    System.out.println("\n\nTesting "+ testSize + " chars");
    test1 = "";
    startTime = System.nanoTime();
    for(int i = 0; i < testSize; i++){
      test1 += "a";
    }
    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.printf("%d character string concatenation took %.9f seconds%n", testSize, concatTime/BILLION);

    sBuilder.setLength(0);
    startTime = System.nanoTime();
    for(int i = 0; i < testSize; i++){
      sBuilder.append("a");
    }

    endTime = System.nanoTime();
    sBTime = endTime - startTime;
    System.out.printf("%d character StringBuilder append took %.9f seconds%n", testSize , sBTime/BILLION);


    testSize = 100000;
    System.out.println("\n\nTesting "+testSize+" chars");
    test1 = "";
    startTime = System.nanoTime();
    for(int i = 0; i < testSize; i++){
      test1 += "a";
    }
    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.printf("%d character string concatenation took %.9f seconds%n", testSize, concatTime/BILLION);


    sBuilder.setLength(0);
    startTime = System.nanoTime();
    for(int i = 0; i < testSize; i++){
      sBuilder.append("a");
    }

    endTime = System.nanoTime();
    sBTime = endTime - startTime;
    System.out.printf("%d character StringBuilder append took %.9f seconds %n", testSize, sBTime/BILLION);


    testSize = 1000000;
    System.out.println("\n\nTesting "+testSize+" chars");
    test1 = "";
    startTime = System.nanoTime();
    for(int i = 0; i < testSize; i++){
      test1 += "a";
    }
    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.printf("%d character string concatenation took %.9f seconds.%n", testSize,  concatTime/BILLION);


    sBuilder.setLength(0);
    startTime = System.nanoTime();
    for(int i = 0; i < testSize; i++){
      sBuilder.append("a");
    }

    endTime = System.nanoTime();
    sBTime = endTime - startTime;
    System.out.printf("%d character StringBuilder append took %.9f seconds.%n", testSize, sBTime/BILLION);
  }
}