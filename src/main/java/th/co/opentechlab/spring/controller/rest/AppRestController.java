package th.co.opentechlab.spring.controller.rest;

import org.springframework.web.bind.annotation.*;
import th.co.opentechlab.spring.model.ProfileModel;
import th.co.opentechlab.spring.model.RequestModel;
import th.co.opentechlab.spring.model.ResponseModel;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppRestController {

    @GetMapping("/api/v1/name")
    public String getName(){
        return "mao";
    }
    @GetMapping("/api/v1/profile")
    public Map<String, String> getProfile(){
        Map<String, String> result = new HashMap<>();
        result.put("name", "mao");
        result.put("age", "15");
        return result;
    }
    @GetMapping("/api/v2/profile")
    public ProfileModel getProfilev2(){
        ProfileModel result = new ProfileModel();
        result.setName("mao");
        result.setAge(15);
        return result;
    }

    @GetMapping("/api/v3/profile")
    public ProfileModel getProfilev3(@RequestParam(name = "name") String name, @RequestParam Integer age){
        ProfileModel result = new ProfileModel();
        result.setName(name);
        result.setAge(age);
        return result;
    }

    @GetMapping("/api/v4/profile/{name}/{age}")
    public ProfileModel getProfilev4(@PathVariable String name, @PathVariable Integer age){
        ProfileModel result = new ProfileModel();
        result.setName(name);
        result.setAge(age);
        return result;
    }

    @PostMapping("/api/v5/profile")
    public ResponseModel<ProfileModel> setProfile(@RequestBody RequestModel<ProfileModel> requestModel){
        ResponseModel<ProfileModel> result = new ResponseModel<>();
        result.setData(requestModel.getData());
        result.setError(null);
        result.setStatus(200);
        result.setMessage("ok");

        return result;
    }

}
