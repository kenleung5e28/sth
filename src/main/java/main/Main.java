package main;

import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Ben");
        comment.setText("Nice work dude");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
