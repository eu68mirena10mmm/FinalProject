package ru.croc;

import java.util.List;
import java.util.Scanner;

public class WordsFromFile {

    /**
     * Метод добавляет интерфейс, с помощью которого пользователь решает, будут ли добавлены слова.
     * @param pathToFileWithNewWords - путь к файлу, который содержит новые слова в формате "pencil; карандаш"
     * */
    public void addingNewWordsFromFile(String pathToFileWithNewWords){
        System.out.println("Хотите загрузить новые слова из файла?");
        String answer = new Scanner(System.in).nextLine();

        if (answer.equalsIgnoreCase("да") || answer.equalsIgnoreCase("yes")) {
            List<WordTranslate> words = WordTranslate.getNewWordsFromFile(pathToFileWithNewWords);

            WordCRUD wordCRUD = new WordCRUD();

            for (WordTranslate word : words) {
                wordCRUD.addWordToDB(word);
            }
            System.out.println("Слова были успешны добавлены!");
        } else {
            System.out.println("Слова не были добавлены");
        }
    }

}

