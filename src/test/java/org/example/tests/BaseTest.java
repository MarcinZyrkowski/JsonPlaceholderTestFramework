package org.example.tests;

import java.util.Random;
import org.example.annotations.Full;
import org.example.controller.CommentController;
import org.example.controller.PostController;

@Full
public class BaseTest {

    protected Random random = new Random();
    protected PostController postController = new PostController();
    protected CommentController commentController = new CommentController();

}
