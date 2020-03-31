package guru.springframe.joke.jokeapp.controllers;

import guru.springframe.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokecontroller {
    JokeService jokeService;
    @Autowired
    public jokecontroller(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    //要把model当作参数传入到showJoke函数中！！！
    public String showJoke(Model model){
        //return jokeService.getJoke();//youtube上的课程是这样样的，回头试试
        //使用model是按照html的样式显示
        //Add Joke text to ‘joke’ property of Model
        model.addAttribute("joke",jokeService.getJoke());
        //return view name(?)
        //Return view name of ‘chucknorris’
        return "chucknorris";//?
        //next: Create Thymeleaf view for ‘chucknorris’.
    }
}
