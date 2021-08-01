package com.guard.controller;


import com.guard.pojo.Pest;
import com.guard.pojo.PestExample;
import com.guard.pojo.ProgressEntity;
import com.guard.pojo.User;
import com.guard.service.PestService;
import com.guard.service.UserService;
import com.guard.service.api_service;
import com.guard.tool.CloudUpload;
import com.guard.tool.Get_result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 文件上传及进度测试
 */
@Controller
@SessionAttributes({"preurl"})
public class UploadController {

    @Resource
    private PestService pestService;

    @Resource
    private UserService userService;

    /**
     * 显示文件上传页
     *
     * @return
     */
    @RequestMapping("uploadPage")
    public String showUploadPage() {
        return "uploadPage";
    }


    //上传头像
    @RequestMapping("/up_head")
    @ResponseBody
    public Map<String, Object> upload_img(MultipartFile file, HttpServletRequest request) {

        Map<String, Object> result = new HashMap<>();
        if (file != null && !file.isEmpty()) {
            String url;
            try {
                //本地文件路径
                String filePath = "E:\\machine_learning\\" + file.getOriginalFilename();
                file.transferTo(new File(filePath));
                CloudUpload cloudUpload = new CloudUpload();
                url = cloudUpload.toUrl(filePath);//预测图片的外链
                File file_delete = new File(filePath);

                if (file_delete.delete()) {
                    System.out.println("删除成功！！");
                }
                System.out.println("新头像为" + url);

                HttpSession session = request.getSession();

                //更改会话变量中user头像
                User user = (User) session.getAttribute("sessionuser");
                user.setUserimg(url);
                session.setAttribute("sessionuser", user);
                int i = userService.updateByPrimaryKeySelective(user);


                result.put("path", url);
                result.put("code", 200);
                result.put("msg", "success");


            } catch (IOException e) {
                result.put("code", -1);
                result.put("msg", "文件上传出错，请重新上传！");
                e.printStackTrace();
            }
        } else {
            result.put("code", -1);
            result.put("msg", "未获取到有效的文件信息，请重新上传!");
        }
        return result;

    }

    /*
     * 文件上传
     * <p>Title: upload</p>
     * <p>Description: </p>
     * @param file
     * @return
     */


    @PostMapping("/upload")
    @ResponseBody
    public Map<String, Object> upload(MultipartFile file, HttpServletRequest request) {

        Map<String, Object> result = new HashMap<>();
        if (file != null && !file.isEmpty()) {
            String str, url;
            try {
                //本地文件路径
                String filePath = "E:\\machine_learning\\" + file.getOriginalFilename();


                System.out.println(filePath);
                file.transferTo(new File(filePath));

                CloudUpload cloudUpload = new CloudUpload();
                url = cloudUpload.toUrl(filePath);//预测图片的外链
                File file_delete = new File(filePath);

                if (file_delete.delete()) {
                    System.out.println("删除成功！！");
                }
                System.out.println("url为" + url);
                HttpSession session = request.getSession();
                session.setAttribute("preurl", url);

                result.put("path", url);
                result.put("code", 200);
                result.put("msg", "success");

                //调用验证
                Get_result get_result = new Get_result();
                str = get_result.getResult(url);
                PestExample pestExample = new PestExample();
                PestExample.Criteria criteria = pestExample.createCriteria();
                criteria.andNameEqualTo(str);
                List<Pest> pests = pestService.selectByExample(pestExample);
                session.setAttribute("resultpest", pests.get(0));
//                api_service a = new api_service();
//                str  = a.recognize(filePath);
                System.out.println(str);

            } catch (IOException e) {
                result.put("code", -1);
                result.put("msg", "文件上传出错，请重新上传！");
                e.printStackTrace();
            }
        } else {
            result.put("code", -1);
            result.put("msg", "未获取到有效的文件信息，请重新上传!");
        }
        return result;
//        return "result";
    }


    /**
     * 获取文件上传进度
     *
     * @param request
     * @return
     */
    @RequestMapping("getUploadProgress")
    @ResponseBody
    public ProgressEntity getUploadProgress(HttpServletRequest request) {
        return (ProgressEntity) request.getSession().getAttribute("uploadStatus");
    }

}
