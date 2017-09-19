package controller;

import model.hibernate.entity.ContractEntity;
import model.hibernate.util.DatabaseProcess;
import model.hibernate.util.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PageController {

    @RequestMapping(value = {"/index", "/"})
    public String pageIndex() {
        return "index";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/home")
    public String homePage(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        return "admin/home";
    }

    @RequestMapping("/ContractManager")
    public String contractManager(@RequestParam(value = "id",
            required = false, defaultValue = "0") String id, HttpSession session) {
        long mid = id == null || "".equals(id.trim()) ? 0 : Long.parseLong(id);
        List<ContractEntity> lst = DatabaseProcess.getListContract(mid);
        for (int i = 0; i < lst.size(); i++) {
            ContractEntity contractEntity = lst.get(i);
            contractEntity.setLinkUrl(Utils.convertUrl(contractEntity.getContractName(), ""));
        }
        session.setAttribute("listContract", lst);
        return "admin/qlhopdong";
    }

}
