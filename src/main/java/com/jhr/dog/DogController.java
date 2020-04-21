package com.jhr.dog;

import org.springframework.web.bind.annotation.*;

/**
 * <br>
 * 标题：
 * 描述：
 *
 * @author jhr
 * @create 2020/04/17 14:39
 */
@RestController
@RequestMapping("/test")
public class DogController {
    @ResponseBody
    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "hello world";
    }

    @RequestMapping("/myHello")
    public String myHello() {
        return "23333";
    }

    @RequestMapping(value = "/getValueByGet" ,method = RequestMethod.GET)
    public String getValueByGet(){

        BookBO bookBO = new BookBO();
        bookBO.setBookname("测试书本");
        bookBO.setBookNum(1);
        String s = bookBO.toString();
        return s;
    }


    @RequestMapping(value = "/getValueByPost" ,method = RequestMethod.POST)
    public String getValueByPost(@RequestBody BookBO bookBO){

        if(bookBO.getBookNum()<=5){
            bookBO.setBookname("测试书本"+bookBO.getBookNum());
        }else {
            bookBO.setBookname("测试书本N");
        }

        String s = bookBO.toString();
        return s;
    }
}
