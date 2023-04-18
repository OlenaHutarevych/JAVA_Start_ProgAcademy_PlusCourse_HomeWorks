package files;
//3) Реализуйте метод который выведет на экран список всех
//каталогов которые «лежат» в каталоге который будет
//параметром этого метода.

import java.io.File;

public class HW3Level1 {
    public static void main(String[] args) {

        String inputNameOfFolder = "C:\\j\\progAcademyTheory\\1JavaStartTheory";
        File foldername = new File(inputNameOfFolder);
        listOfDir(foldername);

    }
    static void listOfDir(File folderName){

        File[] files =  folderName.listFiles();
        StringBuilder listSB = new StringBuilder();
        for (File file : files){
            if (file.isDirectory()){
                listSB.append(file.getName());
                listSB.append(System.lineSeparator());
            }
        }
        System.out.println(listSB.toString());
    }
}
