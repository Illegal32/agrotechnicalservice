package az.iktlab.agrotechnicalservice.client;

import az.iktlab.agrotechnicalservice.model.CodeBeautify;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "open-Data", url = "https://sc.opendata.az/file/476")
public interface AgroServiceClient {
    @GetMapping("/data")
    CodeBeautify getAgroServices();
}
