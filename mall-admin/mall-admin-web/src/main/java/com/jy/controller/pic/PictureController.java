package com.jy.controller.pic;

import com.jy.response.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PictureController {
    @RequestMapping(value = "/pic/upload",method = RequestMethod.POST)
    public Result<String> picUpload(MultipartFile multipartFile){
        return null;
    }
}
