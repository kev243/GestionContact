import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {
    public static  Scanner sc =null;
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        String userLastName = getUserInput("Entrez un nom de famille: ");
        String userFirstName = getUserInput("Entrez un prénom: ");
        String userPhoneNumber = getUserInput("Entrez un numéro de téléphone: ");

        Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);
        System.out.println(newContact.toString());


         File phoneBookFile = getOrCreatePhoneBookFile("/Users/kevin/coursJava/phonebook.txt");

       



            //Gestion d'erreur
            try {
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));
                fileWriter.append(newContact.toString());
                fileWriter.append('\n');
                System.out.println("contact ajouté");
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            sc.close();
        }


        public static String getUserInput (String userRequest){
            if (userRequest == null || sc == null) {
                return null;
            }

            System.out.println(userRequest);
            return sc.nextLine();

        }

    public static File getOrCreatePhoneBookFile(String phoneBookFilePath){
        //localisation de notre fichier
        File phoneBookFile = new File(phoneBookFilePath);

        //test si le fichier existe ou pas
        if (phoneBookFile.exists()){
            //System.out.println("le fichier existe");
            return phoneBookFile;

        }
            //System.out.println("Le fichier n'existe pas")

            try{
                phoneBookFile.createNewFile();
                System.out.println("le fichier a été crée");
                return phoneBookFile;
            }catch (IOException e){
                e.printStackTrace();
            }


       return  null;
    }

    }


