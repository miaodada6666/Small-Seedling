package com.myseu.smallseedling.controller;
import com.myseu.smallseedling.domain.MiaoReposity;
import com.myseu.smallseedling.mapper.Miao;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;
import java.util.Optional;
@RestController
public class MiaoController {
    @Autowired
    private MiaoReposity miaoReposity;
    String url;
    String fuck;
    public void Login(String url,String fuck)
    {
        this.url=url;
        this.fuck=fuck;
    }
    @GetMapping(value="/miao")
    public List<Miao> miaoList(){
        return miaoReposity.findAll();
    }
    @PostMapping(value="/miao")
    public Miao miaoAdd(@RequestParam("zhanghao")String zhanghao,
                        @RequestParam("mima") String mima
//                       @RequestParam("phonenumber") String phonenumber,
//                       @RequestParam("birthday")  String birthday,
//                        @RequestParam("mimaagain") String mimaagain
    )
    {
        Miao miao=new Miao();
        miao.setMima(mima);
        miao.setZhanghao(zhanghao);
//        miao.setBirthday(birthday);
//        miao.setMimaagain(mimaagain);
//        miao.setPhonenumber(phonenumber);
        return miaoReposity.save(miao);
    }

    @GetMapping(value ="/miao/zhanghao/{zhanghao}")
    public List<Miao> miaoListbyzhanghao (@PathVariable("zhanghao") String zhanghao)
    {
        return miaoReposity.findByzhanghao(zhanghao);
    }

//    public void GetfromSql()
//    {
//        url="http://223.3.77.170:8055/miao/zhanghao/";
//        url=url+fuck;
//        //    URL httpUrl = new URL(url);
//        System.out.println(url+"!!!!!!!!!!!!@@@@@@@@@");
////        OkHttpClient client=new OkHttpClient();
////        RuntimeNode.Request request=new Request.Builder().url(url).build();
////        Response response= null;
////        try {
////            response = client.newCall(request).execute();
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        Gson gson=new Gson();
////        try {
////            examples =gson.fromJson(response.body().string(),new TypeToken<List<Example>>(){}.getType());
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
}
