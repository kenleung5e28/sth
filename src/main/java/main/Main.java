package main;

import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Ben");
        comment.setText("Nice work dude");

        var commentService = context.getBean(CommentService.class);
        commentService.editComment(comment);
        commentService.publishComment(comment);
        commentService.deleteComment(comment);
    }
}
