package edu.self.samplespringboot.controller;

import edu.self.samplespringboot.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1.RESTful API のアプリのリクエストを受け付けるクラスであることの指定
public class IndexController {
    // 追加
    @Autowired
     IndexService indexService;

    @RequestMapping("/")
    public String index() {
        // 変更
        return "Hello World!";
        //return indexService.getIndexString();
    }
}