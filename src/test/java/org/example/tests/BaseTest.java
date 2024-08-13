package org.example.tests;

import org.example.annotation.Full;
import org.example.controller.CommentController;
import org.example.controller.PostController;

import java.util.Random;

@Full
public class BaseTest {

    protected Random random = new Random();
    protected PostController postController = new PostController();
    protected CommentController commentController = new CommentController();

}
