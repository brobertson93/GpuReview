package org.wecancodeit.gpureview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class GpuReviewController {
    @Resource
    private GpuReviewRepository gpusRepo;

    @RequestMapping("/gpus")
    public String findAllCourses(Model model) {
        model.addAttribute("gpusModel", gpusRepo.findAll());
        return "gpusTemplate";
    }

    @RequestMapping("/gpu")
    public String findOneGpu(@RequestParam(value="id") Long id, Model model) throws  GpuNotFoundException {
        if(gpusRepo.findOne(id) == null) {
            throw new GpuNotFoundException();
        }

        model.addAttribute("gpuModel", gpusRepo.findOne(id));
        return "gpuTemplate";
    }
}
