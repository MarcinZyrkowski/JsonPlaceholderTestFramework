package org.example.tests;

import java.util.Random;
import org.example.annotation.Full;
import org.example.controller.CommentController;
import org.example.controller.PostController;

public class BaseTest implements Full {

  protected Random random = new Random();
  protected PostController postController = new PostController();
  protected CommentController commentController = new CommentController();

}
