package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Demo
{
    public static void main( String[] args ){

        /// 🔄 Exercise 1: Flatten Sentences into Words
        List<String> sentences = List.of("Java is fun", "Streams are powerful");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println("Exercise 1: Flatten Sentences into Words: " + words);
        System.out.println("-------------");

        /// 📦 Exercise 2: Group Products by Category

    }
}
