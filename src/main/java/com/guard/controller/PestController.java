package com.guard.controller;

import com.github.pagehelper.PageInfo;
import com.guard.dao.PestMapper;
import com.guard.pojo.Pest;
import com.guard.pojo.PestExample;
import com.guard.service.PestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.util.List;

@SessionAttributes({"pestlist", "pestlists", "smallpest", "list"})
@Controller
public class PestController {

    @Resource
    private PestService pestService;
    @Resource
    private PestMapper pestMapper;

    //病虫百科界面跳转
    @RequestMapping("/pest_dict")
    public String Startpest_dict(Model model) {
        PestExample pestExample = new PestExample();
        List<Pest> pests = pestService.selectByExample(pestExample);
        model.addAttribute("pestlist", pests);
        return "pest_dict";
    }

    //病虫列表界面跳转
    @RequestMapping("/pest-list")
    public String list(Model model, Integer start) {
        PestExample pestExample = new PestExample();

        int count = 5;
        if (start == null) {
            start = 1;
        }

        int total = pestMapper.selectByExample(pestExample).size();
        int last;
        if (0 == total % count) {
            last = total / count;
        } else {
            last = total / count + 1;
        }
        int pre = start - 1;
        int next = start + 1;
        pre = pre < 0 ? 0 : pre;
        next = next > last ? last : next;
        PageInfo<Pest> pagelist = pestService.selectAll(start, count);
        List<Pest> list = pagelist.getList();
        model.addAttribute("pre", pre);
        model.addAttribute("next", next);
        model.addAttribute("last", last);
        model.addAttribute("list", list);
        return "pest-list";
    }

    //点击病虫名称查看病虫详情
    @RequestMapping("/pest_detail")
    public String pest_datail(Model model, Integer pid) {
        PestExample pestExample = new PestExample();
        PestExample.Criteria criteria = pestExample.createCriteria();
        criteria.andPestidEqualTo(pid);
        List<Pest> pests = pestService.selectByExample(pestExample);
        model.addAttribute("smallpest", pests.get(0));
        return "pest_detail";
    }


    //病虫害按分类查询 1代表病害 2代表虫害
    @RequestMapping("/pest_select")
    public String pest_select(int id, Model model) {
        PestExample pestExample = new PestExample();
        PestExample.Criteria criteria = pestExample.createCriteria();
        criteria.andKindEqualTo(id);
        List<Pest> pests = pestService.selectByExample(pestExample);
        model.addAttribute("pestlist", pests);
        return "pest_kind";
    }

    //病虫害按名搜索
    @RequestMapping("/pest_find")
    public String pest_find(Model model, String name) {
        PestExample pestExample = new PestExample();
        PestExample.Criteria criteria = pestExample.createCriteria();
        criteria.andNameEqualTo(name);
        List<Pest> pests = pestService.selectByExample(pestExample);
        model.addAttribute("smallpest", pests.get(0));
        return "pest_detail";
    }
}
