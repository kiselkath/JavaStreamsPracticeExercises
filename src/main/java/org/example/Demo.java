package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

        List<Product> products = List.of(
                new Product("ivy-oak-tilda", "tops", 85.0),
                new Product("adidas-originals", "tops", 44.95),
                new Product("next-regular-fit", "blouses", 37.0),
                new Product("stradivarius-flowing-palazzo", "trousers", 25.99),
                new Product("adidas-sportswear", "trousers", 69.95),
                new Product("be-sunset-lola", "dresses", 227.50),
                new Product("mango-maxi-dress", "dresses", 79.99),
                new Product("cath-kidston-maxi-dress", "dresses", 198.0)
        );

        System.out.println("\uD83D\uDCE6 Exercise 2: Group Products by Category");

        /// цепочка stream-операций или Stream API pipeline
        Map<String, List<String>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getName, Collectors.toList())
                ));

        groupedByCategory.forEach((category, productNames) -> {
            System.out.println("Category: " + category);
            productNames.forEach(name -> System.out.println("  • " + name));
        });
    }
;}
