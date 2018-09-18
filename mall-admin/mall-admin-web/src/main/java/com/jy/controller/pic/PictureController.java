package com.jy.controller.pic;

import com.jy.response.Result;
import com.jy.service.img.UploadImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PictureController {

    @Autowired
    UploadImageService uploadImageService;

    @RequestMapping(value = "/pic/upload",method = RequestMethod.POST)
    public Result<String> picUpload(@RequestParam("file") MultipartFile file){
        return uploadImageService.uploadImage(file);
    }
}
