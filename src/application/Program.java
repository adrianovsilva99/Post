package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        Post post = new Post(LocalDateTime.parse(
                "21/06/2018 13:05:44", fmt),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                12);
        post.addComment(c1);
        post.addComment(c2);

        //---------------SECOND POST---------------//

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post postSecond = new Post(
                LocalDateTime.parse("28/07/2018 23:14:19", fmt),
                "Good night guys",
                "Se you tomorrow",
                5);
        postSecond.addComment(c3);
        postSecond.addComment(c4);

        System.out.println(post);
        System.out.println(postSecond);
    }
}
