package DataStructures.lists;

import java.util.Scanner;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
//        System.out.println("Enter the a choice: \n 1. Insert from Front \n 2. Insert from End " +
//                "\n 3. Delete from Front \n 4. Delete from End \n 5. Print the entire List \n 5. Exit");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            System.out.println("Enter the a choice: \n 1. Insert from Front \n 2. Insert from End " +
                    "\n 3. Delete from Front \n 4. Delete from End \n 5. Print the entire List \n 6. Exit");
            int op = sc.nextInt();
            switch (op){
                case 1: System.out.println("Enter the number: ");
                        int data = sc.nextInt();
                        list.addFromFront(data);
                        break;
                case 2: System.out.println("Enter the number: ");
                        data = sc.nextInt();
                        list.addFromEnd(data);
                        break;
                case 3: list.removeFromFront();
                        break;
                case 4: list.removeFromEnd();
                        break;
                case 5: list.printList();
                        break;
                case 6: choice = "no";
                        break;
                default:System.out.println("Wrong Choice try again"); ;

            }
        }

    }
}

//*********Output***********
/*"C:\Program Files\Java\jdk1.8.0_321\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.3\lib\idea_rt.jar=60782:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_321\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_321\jre\lib\rt.jar;F:\Java\Java-DSA\out\production\Java-DSA" DataStructures.lists.DoublyLinkedListMain
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
1
Enter the number:
207
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
5
NULL<-207<=>->NULL
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
1
Enter the number:
208
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
2
Enter the number:
203
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
5
NULL<-208<=>207<=>203<=>->NULL
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
2
Enter the number:
218
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
5
NULL<-208<=>207<=>203<=>218<=>->NULL
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
1
Enter the number:
192
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
5
NULL<-192<=>208<=>207<=>203<=>218<=>->NULL
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
4
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
5
NULL<-192<=>208<=>207<=>203<=>->NULL
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
3
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
5
NULL<-208<=>207<=>203<=>->NULL
Enter the a choice:
 1. Insert from Front
 2. Insert from End
 3. Delete from Front
 4. Delete from End
 5. Print the entire List
 6. Exit
6

Process finished with exit code 0
*/