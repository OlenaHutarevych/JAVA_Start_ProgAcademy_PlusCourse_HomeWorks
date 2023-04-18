package files;

import java.io.File;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        File fileOne = new File("a.txt"); // ми звертаємось до неіснуючого файлу a.txt
        System.out.println(fileOne.exists());
        // створюємо все ж таки новий файл, але т я віртуальна машина JAVA це просто программа, вона може не мати прав
        // створювати файли в деяких місцях, тож будь-які методи створення мають міститися в блоку трай-кетч,
        // щоб спіймати виключення
        try {
            fileOne.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
        File fileTwo = new File("b.txt"); //  знов ми звертаємось привязуємо ссилку fileTwo до неіснуючого файлу b.txt
        fileOne.renameTo(fileTwo); //існуючому файлу a.txt змінюємо імя на імя b.txt

        File folderTwo = new File("AAA");// привязуємо ссилку folderTwo до неіснуючого файлу ААА
        folderTwo.mkdir();// викликаємо метод створення папки за ссилкою folderTwo, тепер папка ААА дійсно існує

        File fileThree = new File(folderTwo, "x.doc");
        fileTwo.renameTo(fileThree);

        folderTwo.delete(); // не спрацює, бо в ній є файл, не можна видалити папку, якщо в ній щось є,
        // тому що папка насправді фізично не існує, це просто ссилка на групу файлів
        // спочатку треба видалилити файл fileThree:
        fileThree.delete();
        //тепер можна і папку folderTwo:
        folderTwo.delete();

        // або нижче написали метод, який видаляє папку і папки і файли з будь-яким рівнем вкладеності

        File folderone = new File("."); // таке імя - це значить, що ссилка на католог, із якого буде
        // відбуватися запрос, в нашому випадку це каталог проекту, а т к це каталог, то в ньму точно є різні файли
        // тож ми можемо створити список файлів (list)
        File [] files = folderone.listFiles();
        // пройдемось по масиву списку, виведемо на екран + спитаємо, чи це файл чи папка
        for (File file:files) {
            System.out.println(file + (file.isFile()? " - File":" - Folder"));
        }
    }
    //метод, який видаляє папку і папки і файли з будь-яким рівнем вкладеності

    static void deleteFoler(File folder){
        if (folder.isFile()){
            System.out.println("Delete "+ folder.getName());
            folder.delete();
        }
        else {
            File [] files = folder.listFiles();
            for(int i = 0; i< files.length; i+=1){
                deleteFoler(files[i]);
            }
            System.out.println("Delete "+ folder.getName());
            folder.delete();
        }
    }
}
