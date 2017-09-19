package controller;

import model.hibernate.entity.ContractEntity;
import model.hibernate.util.DatabaseProcess;
import model.hibernate.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import shorten.IUrlStoreService;
import shorten.UrlMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PageController {
    //    @Autowired

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
//            contractEntity.setLinkUrl(Utils.convertUrl(contractEntity.getContractName(), ""));
        }
        session.setAttribute("listContract", lst);
        return "admin/qlhopdong";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String redirectToUrl(@PathVariable String id, HttpServletResponse resp, HttpSession session) throws Exception {
        final String url = UrlMapping.urlStoreService.findUrlById(id);
        if (url != null) {
//            resp.addHeader("Location", url);
//            resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
            List<ContractEntity> lst = DatabaseProcess.getListContract(0);
            for (int i = 0; i < lst.size(); i++) {
                ContractEntity contractEntity = lst.get(i);
                contractEntity.setLinkImg(Utils.convertUrl(contractEntity.getContractName(), ""));
                UrlMapping.urlStoreService.storeUrl(contractEntity.getLinkImg(), "admin/contractDetail");
            }
            session.setAttribute("listContract", lst);
            return url;
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            return "loi";
        }

    }

}
